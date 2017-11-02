package com.weshine.admin.common;

/**
 * 类@
 * @author huangjun
 * &date 2017/11/1
 */
public class Response {

    private Integer code;

    private String message;

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
