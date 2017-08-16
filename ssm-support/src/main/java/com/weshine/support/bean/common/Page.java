package com.weshine.support.bean.common;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
    private int size;        // 当前页的数量 <= pageSize，该属性来自ArrayList的size属性
    private int pages;        // 总页数
    private long total;        //总记录数
    private List<T> list;    //结果集

    public Page(List<T> list) {
        if (list instanceof com.github.pagehelper.Page) {
            com.github.pagehelper.Page<T> page = (com.github.pagehelper.Page<T>) list;
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.size = page.size();
            this.list = page;
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
