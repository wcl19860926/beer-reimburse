/**
 *
 */
package com.crc.ems.beer.voucher.base.page;



import com.crc.ems.beer.voucher.base.common.CommonMessage;

import java.io.Serializable;

/**
 * @author tanli45
 *
 */
public class RetData<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String stateCode = "200";
    private String msg = "success";
    private T data;
    private Boolean success;
    private T dataResult;// 为了规避有些组件返回结果采用data字段
    private String message = "success";// 为了规避有些组件返回结果采用msg字段
    private CommonMessage messageCode;
    private Object[] args;

    public RetData() {
        super();
    }

    public RetData(T data) {
        super();
        this.data = data;
        this.dataResult = data;
    }

    public RetData(String stateCode, String msg, T data) {
        super();
        this.stateCode = stateCode;
        this.msg = msg;
        this.data = data;
        this.dataResult = data;
        this.message = msg;
    }

    public RetData(CommonMessage messageCode, T data, Object... args) {
        super();
        this.messageCode = messageCode;
        this.stateCode = String.valueOf(messageCode.httpStatus().value());
        this.msg = messageCode.message();
        this.data = data;
        this.dataResult = data;
        this.message = msg;
        if (args != null) {
            this.msg = String.format(this.msg, args);
            this.message = String.format(this.message, args);
        }
    }

    public boolean isSuccess() {
        return stateCode != null && "200".equals(stateCode);
    }

    public static <T> RetData<T> error(String msg) {
        return new RetData<T>(CommonMessage.FAILURE, null);
    }

    public static <T> RetData<T> error(T data) {
        return new RetData<T>(CommonMessage.FAILURE, data);
    }

    public static <T> RetData<T> success(T data) {
        return new RetData<T>(CommonMessage.SUCCESS, data);
    }

    public static <T> RetData<T> success() {
        return new RetData<T>(CommonMessage.SUCCESS, null);
    }

    /**
     * @return the stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode
     *            the stateCode to set
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     *            the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getDataResult() {
        return dataResult;
    }

    public void setDataResult(T dataResult) {
        this.dataResult = dataResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
