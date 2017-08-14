package com.weshine.common;

import java.io.Serializable;

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
