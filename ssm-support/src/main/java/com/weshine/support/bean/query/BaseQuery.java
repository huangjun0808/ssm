package com.weshine.support.bean.query;

/**
 * 基础查询bean
 */
public abstract class BaseQuery {

    private Integer pageNum = 1; //第几页

    private Integer pageSize = 10; //每页记录数

    public BaseQuery() {
    }

    public BaseQuery(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public BaseQuery(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
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

    public Integer getOffset(){
        return (pageNum - 1)*pageSize;
    }
}
