package com.weshine.admin.common;

/**
 * @author huangjun
 * &date 2017/11/1
 */
public class DataResponse extends Response {

    private Object data;

    public DataResponse(Integer code, String message, Object data) {
        super(code, message);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
