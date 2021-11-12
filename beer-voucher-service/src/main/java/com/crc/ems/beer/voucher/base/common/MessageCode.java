package com.crc.ems.beer.voucher.base.common;

import com.crc.ems.beer.voucher.base.i18n.MessageKey;
import org.springframework.http.HttpStatus;

/**
 * Create by EMS Code Standard on 2018/12/25 10:11<br>
 *
 * @authoer: wuxin53
 * @see
 * @since JDK 1.8.0
 */
public interface MessageCode extends MessageKey {
    HttpStatus httpStatus(int... codes);
}
