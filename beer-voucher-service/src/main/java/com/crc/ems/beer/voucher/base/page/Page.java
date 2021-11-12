/**
 *
 */
package com.crc.ems.beer.voucher.base.page;

/**
 * @author tanli45
 *
 */
public class Page {

    private int pageNum = 1; // 传给组件用
    private int pageSize = 10;
    private int currentPage = 1; // 前端用的当前页面

    /**
     * @return the pageNum
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * @param pageNum
     *            the pageNum to set
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize
     *            the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage
     *            the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        this.setPageNum(currentPage); // 赋值到pagenum
    }

}
