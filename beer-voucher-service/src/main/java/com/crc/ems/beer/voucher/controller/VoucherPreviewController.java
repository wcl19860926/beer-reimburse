package com.crc.ems.beer.voucher.controller;

import crc.ems.base.dto.page.PageRequest;
import crc.ems.base.dto.page.ReturnPageData;
import crc.ems.base.dto.result.R;
import crc.ems.base.exception.EmsBaseController;
import crc.ems.base.exception.EmsException;
import crc.ems.lease.dto.AccountantLog;
import crc.ems.lease.dto.gl.GLVoucherPreviewHeadVo;
import crc.ems.lease.dto.gl.GLVoucherPreviewLineDto;
import crc.ems.lease.dto.gl.GlVoucherPreviewVo;
import crc.ems.lease.service.EsbSubjectService;
import crc.ems.lease.service.VoucherPreviewService;
import crc.ems.lease.utils.DateUtil;
import crc.ems.lease.utils.ExcelUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(value = "凭证预览", description = "凭证预览controller")
@RestController
@RequestMapping(value = "/voucherPreview")
public class VoucherPreviewController extends EmsBaseController {
    @Resource
    private VoucherPreviewService voucherPreviewService;

    @Resource
    private EsbSubjectService subjectService;

    @ApiOperation(value = "凭证预览列表查询")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public R<List > getListByCondition(@RequestParam("contractCode") String contractCode, @RequestParam("period") String period) {
      
        return R.ok(voucherPreviewService.queryList(contractCode, period));
    }

    @ApiOperation(value = "查询凭证信息")
    @RequestMapping(value = "/voucher", method = RequestMethod.GET)
    public R<GlVoucherPreviewVo> getVoucher(@RequestParam("fmsLogId") String fmsLogId) {
        return R.ok(voucherPreviewService.queryVoucher(fmsLogId));
    }

    @ApiOperation(value = "查询凭证预览的期间")
    @RequestMapping(value = "/period", method = RequestMethod.GET)
    public R<List> getVocherPeriod(@RequestParam("contractCode") String contractCode) {
       
        return R.ok(voucherPreviewService.queryPeriod(contractCode));
    }
    @ApiOperation(value = "重新生成凭证信息")
    @RequestMapping(value = "/voucher", method = RequestMethod.POST)
    public R<GlVoucherPreviewVo> generateVoucherInfo(@RequestParam("fmsLogId") String fmsLogId) {
        return R.ok(voucherPreviewService.generateVoucherInfo(fmsLogId));
    }

    @ApiOperation(value = "保存凭证信息")
    @RequestMapping(value = "/voucher", method = RequestMethod.PUT)
    public R<GlVoucherPreviewVo> modifyVoucherInfo(@RequestBody  GlVoucherPreviewVo glVoucherPreviewVo) {
        voucherPreviewService.modifyVoucherInfo(glVoucherPreviewVo);
        return R.ok();
    }

    @ApiOperation(value = "科目验证")
    @RequestMapping(value = "/subjectVerification", method = RequestMethod.POST)
    public R<String> generateVoucherInfo(@RequestBody List<GLVoucherPreviewLineDto> lineList) {
        subjectService.subjectVerification(lineList);
        return R.ok();
    }

    @ApiOperation(value = "会计留痕")
    @RequestMapping(value = "/accountantLogList", method = RequestMethod.POST)
    public ReturnPageData<?> accountantLogList(@RequestBody PageRequest<AccountantLog> pageRequest){
        return voucherPreviewService.accountantLogList(pageRequest);
    }

    @ApiOperation(value = "会计凭证导出")
    @RequestMapping(value = "/accountantExport", method = RequestMethod.POST)
    public R<?> accountantExport(HttpServletRequest request, HttpServletResponse response,@RequestBody GLVoucherPreviewHeadVo vo) {
        try {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-Type", "application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("凭证结果导出-" + DateUtil.dateToStr(new Date(), "MMdd") + ".xls", "UTF-8"));
            response.flushBuffer();
            OutputStream out = response.getOutputStream();
            HSSFWorkbook workbook = new HSSFWorkbook();

            List<Object[]> obj = new ArrayList<>();
            //合同信息
            List<Map<String, Object>> mapList = voucherPreviewService.accountantExport(vo.getFmsLogId());
            String[] titleColums01 = {"序号", "行号", "科目方向", "行摘要", "账户组合","账户组合名称","增减变动", "记账金额", "本位币金额"};
            obj.add(titleColums01);
            if(mapList.size()>0){
                for (Map<String, Object> map : mapList) {
                    obj.add(map.values().toArray());
                }
            }
            String[] titleColums = {"凭证预览导出"+"-"+vo.getVoucherCategory()+"-"+vo.getPeriod()};
            ExcelUtils.setSheet(obj, titleColums, "凭证信息" , workbook);
            for(int i=0;i<workbook.getNumberOfSheets();i++){
                //设置第一行大标题
                ExcelUtils.addHeadStyle(workbook,i,0,true,0,0,0,8);
                //设置第二行小标题
                ExcelUtils.addHeadStyle(workbook,i,1,false,0,0,0,0);
            }
            workbook.write(out);
            return R.ok();
        } catch (Exception e) {
            throw new EmsException("xxxxxxxxx", e.getMessage());
        }
     }
}
