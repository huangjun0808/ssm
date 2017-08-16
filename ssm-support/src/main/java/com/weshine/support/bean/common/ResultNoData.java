package com.weshine.support.bean.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class ResultNoData implements ResultBean, Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;

    private String message;

    public ResultNoData() {
    }

    public ResultNoData(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toJsonString() {
        return JSON.toJSONString(this);
    }
}
