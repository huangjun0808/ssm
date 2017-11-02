package com.weshine.support.common;

import java.io.Serializable;
import java.util.List;

/**
 * 类@
 * 分页类
 * @author huangjun
 * &date 2017/11/2
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 第几页
     */
    private Integer pageNum;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    /**
     * 当前页的数量 <= pageSize，该属性来自ArrayList的size属性
     */
    private Integer size;
    /**
     * 总页数
     */
    private Integer pages;
    /**
     * 总记录数
     */
    private Long total;
    /**
     * 结果集
     */
    private List<T> list;

    public Page(List<T> list) {
        if(list instanceof com.github.pagehelper.Page){
            com.github.pagehelper.Page<T> page = (com.github.pagehelper.Page<T>) list;
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.size = page.size();
            this.list = page;
        }
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
