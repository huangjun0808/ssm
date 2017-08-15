package com.weshine.support.bean;

import java.io.Serializable;

/**
 * json对象子类 带数据
 */
public class JSONBeanData extends JSONBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object data;

    public JSONBeanData(Integer status, String message, Object data) {
        super(status, message);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
