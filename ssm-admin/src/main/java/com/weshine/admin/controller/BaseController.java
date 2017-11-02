package com.weshine.admin.controller;

import com.weshine.admin.common.CodeEnum;
import com.weshine.admin.common.DataResponse;
import com.weshine.admin.common.Response;

public class BaseController {

    public DataResponse success(){
        return (DataResponse) new Response(CodeEnum.SUCCESS.getIndex(), CodeEnum.SUCCESS.getName());
    }

    public Response success(String message){
        return new Response(CodeEnum.SUCCESS.getIndex(), message);
    }

    public Response success(Object object){
        Response response = new DataResponse(CodeEnum.SUCCESS.getIndex(), CodeEnum.SUCCESS.getName(), object);
        return response;
    }

    public Response failure(){
        return new Response(CodeEnum.FAIL.getIndex(), CodeEnum.FAIL.getName());
    }

    public Response failure(CodeEnum codeEnum){
        return new Response(codeEnum.getIndex(), codeEnum.getName());
    }

    public Response failure(Integer index, String name){
        return new Response(index, name);
    }

}
