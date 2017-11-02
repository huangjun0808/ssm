package com.weshine.model.query;

import java.io.Serializable;

/**
 * 类@
 * 基础查询类
 * @author huangjun
 * &date 2017/11/2
 */
public class BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 第几页
     */
    private Integer pageNum = 1;
    /**
     * 每页记录数
     */
    private Integer pageSize = 10;
    /**
     * 排序字符串
     */
    private String orderby = "id DESC";

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

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public Integer getOffset(){
        if(this.pageNum==0){
            return 0;
        }
        return (this.pageNum - 1) * pageSize;
    }
}
