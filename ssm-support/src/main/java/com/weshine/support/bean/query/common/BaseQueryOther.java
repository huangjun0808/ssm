package com.weshine.support.bean.query.common;

public abstract class BaseQueryOther {

    private Integer pageNum = 1; //第几页

    private Integer pageSize = 10; //每页记录数

    private String orderByClause;  //排序

    private GeneratedCriteria generatedCriteria;

    private Boolean annotation;

    public BaseQueryOther() {
        this.annotation = false;
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


    public static void main(String[] args) {
        GeneratedCriteria generatedCriteria = new GeneratedCriteria();
        generatedCriteria.where("11","22","33").whereOr("11","22","33").where(new GeneratedCriteria(){

        });
    }
}
