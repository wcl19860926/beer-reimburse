/**
 *
 */
package com.crc.ems.beer.voucher.base.page;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author tanli45
 *
 */
public class ReturnPageData<T> extends PageInfo<T> {

    private static final long serialVersionUID = 1L;

    public ReturnPageData(List<T> list) {
        super(list);
    }

    public ReturnPageData() {}
}
