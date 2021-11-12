package com.crc.ems.beer.voucher.base.result;

import crc.ems.lease.constants.CommonConst;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: create by lisl
 * @version: v1.0
 * @description:返回对象信息工具类
 * @date:2019/12/10
 */
@Builder
@ToString
@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返回编码", example = "S000A000 成功，E000A000 失败，详细参见异常编码表")
    private String code = CommonConst.SUCCESS;

    @ApiModelProperty(value = "返回信息描述", example = "保存成功")
    private String msg = "success";

    @ApiModelProperty(value = "返回结果", example = "返回结果")
    private T data;

    @ApiModelProperty(value = "返回异常堆栈", example = "返回异常堆栈")
    private String detailErrorStack;

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }

    public R(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public R(String code, T data, String msg) {
        super();
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = CommonConst.FAIL;
    }

    public static <T> R<T> ok() {
        return new R<T>();
    }


    public static <T> R<T> ok(T data) {
        return new R<T>(data);
    }

    public static R<?> ok(String code) {
        return new R<>(code);
    }

    /**
     * 返回成功数据，提示语msg自定义
     *
     * @param data
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> R<T> ok(T data, String msg) {
        return new R<T>(data, msg);
    }

    public static <T> R<T> ok(String code, T data, String msg) {
        return new R<T>(code, data, msg);
    }

    public static <T> R<T> error(String msg) {
        return new R<T>(CommonConst.FAIL, null, msg);
    }

    public static <T> R<T> error(T data, String msg) {
        return new R<T>(CommonConst.FAIL, data, msg);
    }

    public static <T> R<T> error(String code, String msg) {
        return new R<T>(code, msg);
    }

    public static <T> R<T> error(String code, T data, String msg) {
        return new R<T>(code, data, msg);
    }
}
