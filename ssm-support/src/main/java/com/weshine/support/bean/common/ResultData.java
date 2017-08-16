package com.weshine.support.bean.common;


public class ResultData extends ResultNoData {

    private static final long serialVersionUID = 1L;

    private Object data;

    public ResultData() {
    }

    public ResultData(Integer status, String message, Object data) {
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
