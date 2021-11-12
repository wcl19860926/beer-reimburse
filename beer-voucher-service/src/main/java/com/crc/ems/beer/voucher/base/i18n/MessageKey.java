package com.crc.ems.beer.voucher.base.i18n;

import cn.hutool.core.util.StrUtil;
import com.google.common.base.CaseFormat;

import java.util.ResourceBundle;

public interface MessageKey {
    default String prefix() {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, getClass().getSimpleName());
    }

    String name();

    default String key() {
        return prefix() + "." + name();
    }

    default String message() {
        ResourceBundle rb = ResourceBundle.getBundle("META-INF/i18n");
        String k = key();
        return rb.containsKey(k) ? rb.getString(k) : k;
    }

    default String message(String lan) {
        return message(key(), lan);
    }

    default String message(String key, String lan) {
        String defaultlan = "i18n";
        if (!StrUtil.isEmpty(lan)) {
            if (!"zh-CN".equalsIgnoreCase(lan)) {
                defaultlan = lan;
            }
        }
        ResourceBundle rb = ResourceBundle.getBundle("META-INF/" + defaultlan);
        return rb.containsKey(key) ? rb.getString(key) : key;
    }

    default String sysmessage(String lan) {
        String defaultlan = "zh-CN_sys";
        if (!StrUtil.isEmpty(lan)) {
            defaultlan = lan + "_sys";
        }
        ResourceBundle rb = ResourceBundle.getBundle("META-INF/" + defaultlan);
        String k = key();
        return rb.containsKey(k) ? rb.getString(k) : k;
    }
}
