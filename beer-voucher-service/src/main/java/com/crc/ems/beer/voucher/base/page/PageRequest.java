/**
 *
 */
package com.crc.ems.beer.voucher.base.page;

import java.io.Serializable;

/**
 * @author tanli45
 *
 */
public class PageRequest<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Page page;

    private T params;

    private SortDTO sortDTO;

    public SortDTO getSortDTO() {
        return sortDTO;
    }

    public void setSortDTO(SortDTO sortDTO) {
        this.sortDTO = sortDTO;
    }

    /**
     * @return the page
     */
    public Page getPage() {
        return page;
    }

    /**
     * @param page
     *            the page to set
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * @return the params
     */
    public T getParams() {
        return params;
    }

    /**
     * @param params
     *            the params to set
     */
    public void setParams(T params) {
        this.params = params;
    }
}
