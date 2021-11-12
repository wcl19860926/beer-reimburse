package com.crc.ems.beer.voucher.base.common;

/**
 * Create by EMS Code Standard on 2018/12/25 11:21<br>
 *
 * @authoer: wuxin53
 * @see
 * @since JDK 1.8.0
 */
public enum CommonMessage implements ClientMessage {
    SUCCESS, FAILURE(400);

    CommonMessage() {

    }

    CommonMessage(int code) {
        this.httpStatus(code);
    }
}
