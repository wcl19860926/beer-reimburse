package com.crc.ems.beer.voucher.base.common;

import org.springframework.http.HttpStatus;

/**
 * Create by EMS Code Standard on 2018/12/25 11:20<br>
 *
 * @authoer: wuxin53
 * @see
 * @since JDK 1.8.0
 */
public interface ClientMessage extends MessageCode {
    @Override
    default HttpStatus httpStatus(int... codes) {
        int code = 200;
        if (codes != null && codes.length > 0) {
            code = codes[0];
        }
        HttpStatus httpStatus = HttpStatus.resolve(code);
        if (httpStatus == null) {
            httpStatus = HttpStatus.OK;
        }
        return httpStatus;
    }
}
