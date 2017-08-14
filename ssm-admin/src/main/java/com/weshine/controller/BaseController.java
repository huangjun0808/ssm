package com.weshine.controller;


import com.weshine.common.*;

public class BaseController {

    public JSONBean success(){
        JSONBean jsonBean = new JSONBeanNoData(Constans.SUCCESS,"请求成功");
        return jsonBean;
    }

    public JSONBean success(String message){
        JSONBean jsonBean = new JSONBeanNoData(Constans.SUCCESS,message);
        return jsonBean;
    }

    public JSONBean success(Object object){
        JSONBean jsonBean = new JSONBeanData(Constans.SUCCESS,"请求成功",object);
        return jsonBean;
    }

    public JSONBean success(String message, Object object){
        JSONBean jsonBean = new JSONBeanData(Constans.SUCCESS,message,object);
        return jsonBean;
    }

    public JSONBean failure(){
        JSONBean jsonBean = new JSONBeanNoData(Constans.FAIL,"请求失败");
        return jsonBean;
    }

    public JSONBean failure(String message){
        JSONBean jsonBean = new JSONBeanNoData(Constans.FAIL,message);
        return jsonBean;
    }

}
