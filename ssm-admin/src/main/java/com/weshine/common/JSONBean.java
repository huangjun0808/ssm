package com.weshine.common;

import com.alibaba.fastjson.JSON;

public abstract class JSONBean {

    private Integer status;

    private String message;

    public JSONBean() {
    }

    public JSONBean(Integer status, String message) {
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

    public String toJsonString(){
        return JSON.toJSONString(this);
    }
}
