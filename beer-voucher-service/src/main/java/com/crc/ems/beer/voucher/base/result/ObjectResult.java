package com.crc.ems.beer.voucher.base.result;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class ObjectResult {
    private String statusCode = "-1";

    private String msg = null;
    
    private Object dataResult;

    private Map<?, ?> extra;

    @ApiModelProperty(value = "状态编码")
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @ApiModelProperty(value = "提示信息")
    public String getMsg() {
        if (StringUtils.isBlank(this.msg) && StringUtils.equals("-1", this.statusCode))
            //return ErrorCodeEnum.FAIL.getStatusMsg();
            return "API RETURN ERROR";
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    @ApiModelProperty(dataType = "java.util.Map", value = "扩展对象")
    public Map<?, ?> getExtra() {
        return extra;
    }

    public void setExtra(Map<?, ?> extra) {
        this.extra = extra;
    }

    @ApiModelProperty(value = "数据对象")
    public Object getDataResult() {
        return dataResult;
    }

    public void setDataResult(Object dataResult) {
        this.dataResult = dataResult;
    }
}
