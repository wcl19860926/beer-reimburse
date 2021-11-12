package com.crc.ems.beer.voucher.service;

import crc.ems.base.dto.page.PageRequest;
import crc.ems.base.dto.page.ReturnPageData;
import crc.ems.lease.dto.AccountantLog;
import crc.ems.lease.dto.gl.GLVoucherPreviewHeadVo;
import crc.ems.lease.dto.gl.GlVoucherPreviewVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface VoucherPreviewService {

    List<GLVoucherPreviewHeadVo> queryList(String contractCode, String period);
    
    List<String> queryPeriod(String contractCode);

    GlVoucherPreviewVo queryVoucher( String fmsLogId);

    GlVoucherPreviewVo generateVoucherInfo(String contractId, String voucherType);

    GlVoucherPreviewVo generateVoucherInfo(String fmsLogId);

    void modifyVoucherInfo(GlVoucherPreviewVo glVoucherPreviewVo);

    ReturnPageData<?> accountantLogList(PageRequest<AccountantLog> pageRequest);

    List<Map<String,Object>> accountantExport(@Param("fmsLogId")  String fmsLogId);
}
