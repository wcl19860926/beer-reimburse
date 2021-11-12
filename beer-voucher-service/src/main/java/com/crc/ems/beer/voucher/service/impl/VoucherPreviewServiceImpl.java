package com.crc.ems.beer.voucher.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageHelper;
import crc.ems.base.dto.page.PageRequest;
import crc.ems.base.dto.page.ReturnPageData;
import crc.ems.base.exception.EmsException;
import crc.ems.lease.constants.ImportFmsConstant;
import crc.ems.lease.dto.AccountantLog;
import crc.ems.lease.dto.gl.GLVoucherPreviewHeadVo;
import crc.ems.lease.dto.gl.GLVoucherPreviewLineVo;
import crc.ems.lease.dto.gl.GlVoucherPreviewVo;
import crc.ems.lease.mapper.AccountantLogMapper;
import crc.ems.lease.mapper.ImportFmsLogMapper;
import crc.ems.lease.mapper.VoucherPreviewMapper;
import crc.ems.lease.pojo.ImportFmsLog;
import crc.ems.lease.service.VoucherPreviewService;
import crc.ems.lease.utils.DateUtil;
import crc.ems.lease.utils.TokenUtil;
import crc.ems.lease.xxl.PreviewFMSJobHandlerGL;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class VoucherPreviewServiceImpl implements VoucherPreviewService {
    @Resource
    private VoucherPreviewMapper voucherPreviewMapper;
    
    @Resource
    private ImportFmsLogMapper importFmsLogMapper;

    @Autowired
    private PreviewFMSJobHandlerGL previewFMSJobHandlerGL;

    @Autowired
    private AccountantLogMapper accountantLogMapper;


    @Override
    public List<GLVoucherPreviewHeadVo> queryList(String contractCode, String period) {
       
        return  voucherPreviewMapper.queryList(contractCode,DateUtil.getDateMonthFirstDay(DateUtil.getMonthFirstDay(period)),DateUtil.getMonthLastDay(period));
    }

    @Override
    public List<String> queryPeriod(String contractCode) {
        LambdaQueryWrapper<ImportFmsLog> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(ImportFmsLog::getIsDel, "N");
        queryWrapper.eq(ImportFmsLog::getContractCode, contractCode);
        List<ImportFmsLog> importFmsLogList = importFmsLogMapper.selectList(queryWrapper);
        return importFmsLogList.stream().filter(t-> DateUtil.getNextMonthFirsttDay().compareTo(t.getGlDate())>0).map(t->DateUtil.dateToStr(t.getGlDate() ,"yyyy-MM")).distinct().collect(Collectors.toList());
    }

    @Override
    public GlVoucherPreviewVo queryVoucher(String fmsLogId) {
        GlVoucherPreviewVo glVoucherPreviewDto =  new GlVoucherPreviewVo();
        GLVoucherPreviewHeadVo voucherPreviewHeadDto = voucherPreviewMapper.queryVoucherHead( fmsLogId);
        List<GLVoucherPreviewLineVo> voucherPreviewLineList = voucherPreviewMapper.queryVoucherLine( fmsLogId);
        glVoucherPreviewDto.setVoucherPreviewHeadDto(voucherPreviewHeadDto);
        glVoucherPreviewDto.setVoucherPreviewLineList(voucherPreviewLineList);
        return  glVoucherPreviewDto;
    }

    @Override
    @Async
    @Transactional
    public GlVoucherPreviewVo generateVoucherInfo(String contractId, String voucherType) {
        LambdaQueryWrapper<ImportFmsLog> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ImportFmsLog::getContractId, contractId)
                .eq(ImportFmsLog::getFmsModule, "GL")
                .eq(ImportFmsLog::getIsDel, ImportFmsConstant.N);
        queryWrapper.lt(ImportFmsLog::getGlDate, DateUtil.getNextMonthFirsttDay()).ge(ImportFmsLog::getGlDate, DateUtil.getMonthFirstDay());
        if(StringUtils.isNotEmpty(voucherType))
        {
            queryWrapper.eq(ImportFmsLog::getVoucherType, voucherType);
        }
        List<ImportFmsLog> importFmsLogs = importFmsLogMapper.selectList(queryWrapper);
        StringBuffer params = new StringBuffer();
        params.append("B17");
        for(ImportFmsLog importFmsLog:importFmsLogs){
            params.append(",");
            params.append(importFmsLog.getId());
        }
        previewFMSJobHandlerGL.execute(params.toString());
        return null;
    }

    @Override
    public GlVoucherPreviewVo generateVoucherInfo(String fmsLogId) {
       
//        LambdaQueryWrapper<ImportFmsLog> queryWrapper = new LambdaQueryWrapper();
//
//        queryWrapper.eq(ImportFmsLog::getIsDel, "N");
//        queryWrapper.eq(ImportFmsLog::getId, fmsLogId);
//        List<ImportFmsLog> importFmsLogList = importFmsLogMapper.selectList(queryWrapper);
//        if(StringUtils.equalsIgnoreCase(importFmsLogList.get(0).getErrorMsg(),"不需要生成凭证")){
//            return null;
//        }
        //先查询旧的凭证记录
        GlVoucherPreviewVo oldGlVoucherPreviewVo=queryVoucher(fmsLogId);
        if(oldGlVoucherPreviewVo.getVoucherPreviewHeadDto()!=null && oldGlVoucherPreviewVo.getVoucherPreviewHeadDto().isEdit() == false){
            throw new EmsException("E000A015", "凭证状态已变更，不允许编辑保存，请刷新页面");
        }
        // 重新生成凭证预览
        voucherPreviewMapper.deleteVoucher(fmsLogId, null, null, null);
        // 重新置状态位2 -> 1 | 3 -> 1 | W、4 -> 1
        int rows = importFmsLogMapper.updateImportFmsLog(fmsLogId);
        if (BigDecimal.ONE.intValue() != rows) {
            throw EmsException.error("E000V001");
        }
        StringBuffer params = new StringBuffer();
        params.append("B17").append(',').append(fmsLogId);
        previewFMSJobHandlerGL.execute(params.toString());
        //查询新生成的凭证
        GlVoucherPreviewVo newGlVoucherPreviewVo=queryVoucher(fmsLogId);
        //新增凭证修改记录
        insertAccountantLog(oldGlVoucherPreviewVo,newGlVoucherPreviewVo,"1");
        return newGlVoucherPreviewVo;
    }

    @Override
    @Transactional
    public void modifyVoucherInfo(GlVoucherPreviewVo glVoucherPreviewVo) {
        //先查询旧的凭证记录
        GlVoucherPreviewVo oldGlVoucherPreviewVo=queryVoucher(glVoucherPreviewVo.getVoucherPreviewHeadDto().getFmsLogId());
        if(oldGlVoucherPreviewVo.getVoucherPreviewHeadDto()!=null){
            if(oldGlVoucherPreviewVo.getVoucherPreviewHeadDto().isEdit() == false){
                throw new EmsException("E000A015", "凭证状态已变更，不允许编辑保存，请刷新页面");
            }
            //新增会计留痕日志
            insertAccountantLog(null,glVoucherPreviewVo,"0");
            voucherPreviewMapper.modifyVoucherInfo( glVoucherPreviewVo.getVoucherPreviewLineList());
        }
        
    }

    @Override
    public ReturnPageData<?> accountantLogList(PageRequest<AccountantLog> pageRequest) {
        PageHelper.startPage(pageRequest.getPage());
        List<AccountantLog> tempData=accountantLogMapper.list(pageRequest.getParams());
        tempData.forEach(t->{
            if(t.getOperateType().equals("0")){
                t.setOperateType("修改");
            }else if(t.getOperateType().equals("1")){
                t.setOperateType("重新生成");
            }else {
                t.setOperateType("");
            }
        });
        return new ReturnPageData<>(tempData);
    }

    @Override
    public List<Map<String, Object>> accountantExport(String fmsLogId) {
        List<Map<String, Object>> tempList=voucherPreviewMapper.accountantExport(fmsLogId);
        final int[] index = {1};
        tempList.forEach(map->{
            map.keySet().forEach(k -> {
                if (StringUtils.equalsIgnoreCase(k, "ID")) {//序号自增
                    map.put("ID", index[0]);
                    index[0]++;
                }
            });
        });
        return tempList;
    }

    /**
     * 新增凭证修改记录
     * @param oldGlVoucherPreviewVo
     * @param newGlVoucherPreviewVo
     * @param type
     */
    private void insertAccountantLog(GlVoucherPreviewVo oldGlVoucherPreviewVo,GlVoucherPreviewVo newGlVoucherPreviewVo,String type){
        if(!CollectionUtils.isEmpty(newGlVoucherPreviewVo.getVoucherPreviewLineList())) {
            StringBuilder oldValue = new StringBuilder();
            StringBuilder newValue = new StringBuilder();
            List<AccountantLog> accountantLogList = new ArrayList<AccountantLog>();
            //编辑凭证
            if (type.equals("0")) {
                List<GLVoucherPreviewLineVo> oldVoucherPreviewLineList = voucherPreviewMapper.queryVoucherLine(newGlVoucherPreviewVo.getVoucherPreviewHeadDto().getFmsLogId());
                newGlVoucherPreviewVo.getVoucherPreviewLineList().forEach(newLine -> {
                    GLVoucherPreviewLineVo oldLine = oldVoucherPreviewLineList.stream().filter(f -> f.getId().equals(newLine.getId())).findFirst().orElse(null);
                    compareLine(oldLine, newLine, oldValue, newValue);
                });
                //重新生成凭证
            } else if (type.equals("1")) {
                List<GLVoucherPreviewLineVo> oldVoucherPreviewLineList = oldGlVoucherPreviewVo.getVoucherPreviewLineList();
                newGlVoucherPreviewVo.getVoucherPreviewLineList().forEach(newLine -> {
                    GLVoucherPreviewLineVo oldLine = oldVoucherPreviewLineList.stream().filter(f -> f.getLineNumber().equals(newLine.getLineNumber())).findFirst().orElse(null);
                    compareLine(oldLine, newLine, oldValue, newValue);
                });
            }
            if (!StringUtils.isEmpty(oldValue) && !StringUtils.isEmpty(newValue)) {
                AccountantLog accountantLog = new AccountantLog();
                String userCode = TokenUtil.getUserCode();
                String userCodeName = TokenUtil.getUserName();
                accountantLog.setOperateType(type);
                accountantLog.setContractCode(newGlVoucherPreviewVo.getVoucherPreviewHeadDto().getInvoiceNumber());
                accountantLog.setFmsLogId(newGlVoucherPreviewVo.getVoucherPreviewHeadDto().getFmsLogId());
                accountantLog.setVoucherType(newGlVoucherPreviewVo.getVoucherPreviewHeadDto().getVoucherType());
                accountantLog.setVoucherDesc(newGlVoucherPreviewVo.getVoucherPreviewHeadDto().getVoucherCategory());
                accountantLog.setOperateBy(userCode);
                accountantLog.setOperateByName(userCodeName);
                accountantLog.setOperateDate(new Date());
                accountantLog.setOperateBefore(oldValue.substring(0, oldValue.length() - 1));
                accountantLog.setOperateAfter(newValue.substring(0, newValue.length() - 1));
                accountantLogList.add(accountantLog);
                accountantLogMapper.insert(accountantLogList);
            }
        }
    }

    /**
     * 比较可以编辑的字段
     * @param oldLine
     * @param newLine
     * @param oldValue
     * @param newValue
     */
    private void compareLine(GLVoucherPreviewLineVo oldLine,GLVoucherPreviewLineVo newLine,StringBuilder oldValue,StringBuilder newValue){
        if(oldLine!=null && newLine!=null){
            //行摘要
            if(!oldLine.getRowSummary().equals(newLine.getRowSummary())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("行摘要：").append(oldLine.getRowSummary()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("行摘要：").append(newLine.getRowSummary()).append(";");
            }
            //增减变动
            if(!oldLine.getMovgChange().equals(newLine.getMovgChange())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("增减变动：").append(oldLine.getMovgChangeName()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("增减变动：").append(newLine.getMovgChangeName()).append(";");
            }
            //成本中心段
            if(!oldLine.getSegment2().equals(newLine.getSegment2())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("成本中心编码：").append(oldLine.getSegment2()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("成本中心描述：").append(oldLine.getSegment2Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("成本中心编码：").append(newLine.getSegment2()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("成本中心描述：").append(newLine.getSegment2Name()).append(";");
            }
            //会计科目段
            if(!oldLine.getSegment3().equals(newLine.getSegment3())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("会计科目编码：").append(oldLine.getSegment3()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("会计科目描述：").append(oldLine.getSegment3Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("会计科目编码：").append(newLine.getSegment3()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("会计科目描述：").append(newLine.getSegment3Name()).append(";");
            }
            //会计子目段
            if(!oldLine.getSegment4().equals(newLine.getSegment4())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("会计子目编码：").append(oldLine.getSegment4()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("会计子目描述：").append(oldLine.getSegment4Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("会计子目编码：").append(newLine.getSegment4()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("会计子目描述：").append(newLine.getSegment4Name()).append(";");
            }
            //产品段
            if(!oldLine.getSegment5().equals(newLine.getSegment5())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("产品编码：").append(oldLine.getSegment5()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("产品描述：").append(oldLine.getSegment5Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("产品编码：").append(newLine.getSegment5()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("产品描述：").append(newLine.getSegment5Name()).append(";");
            }
            //地区段
            if(!oldLine.getSegment6().equals(newLine.getSegment6())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("地区描述：").append(oldLine.getSegment6()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("产品编码：").append(oldLine.getSegment6Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("产品编码：").append(newLine.getSegment6()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("地区描述：").append(newLine.getSegment6Name()).append(";");
            }
            //SBU专用段
            if(!oldLine.getSegment7().equals(newLine.getSegment7())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("SBU专用编码：").append(oldLine.getSegment7()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("SBU专用描述：").append(oldLine.getSegment7Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("SBU专用编码：").append(newLine.getSegment7()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("SBU专用描述：").append(newLine.getSegment7Name()).append(";");
            }
            //关联方段
            if(!oldLine.getSegment8().equals(newLine.getSegment8())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("关联方编码：").append(oldLine.getSegment8()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("关联方描述：").append(oldLine.getSegment8Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("关联方编码：").append(newLine.getSegment8()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("关联方描述：").append(newLine.getSegment8Name()).append(";");
            }
            //项目段
            if(!oldLine.getSegment9().equals(newLine.getSegment9())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("项目编码：").append(oldLine.getSegment9()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("项目描述：").append(oldLine.getSegment9Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("项目编码：").append(newLine.getSegment9()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("项目描述：").append(newLine.getSegment9Name()).append(";");
            }
            //备用描述
            if(!oldLine.getSegment10().equals(newLine.getSegment10())){
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("备用编码：").append(oldLine.getSegment10()).append(";");
                oldValue.append("行号：").append(oldLine.getLineNumber()).append("，").append("备用描述：").append(oldLine.getSegment10Name()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("备用编码：").append(newLine.getSegment10()).append(";");
                newValue.append("行号：").append(newLine.getLineNumber()).append("，").append("备用描述：").append(newLine.getSegment10Name()).append(";");
            }
        }
    }
}
