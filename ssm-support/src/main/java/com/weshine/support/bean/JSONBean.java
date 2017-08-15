package com.weshine.support.bean;


import com.alibaba.fastjson.JSON;

/**
 * json对象基类
 */
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

    /**
     * json对象转成json字符串
     * @return
     */
    public String toJsonString(){
        return JSON.toJSONString(this);
    }
}
