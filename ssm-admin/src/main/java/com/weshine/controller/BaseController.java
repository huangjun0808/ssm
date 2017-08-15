package com.weshine.controller;


import com.weshine.support.bean.Constant;
import com.weshine.support.bean.JSONBean;
import com.weshine.support.bean.JSONBeanData;
import com.weshine.support.bean.JSONBeanNoData;

public class BaseController {

    public JSONBean success(){
        JSONBean jsonBean = new JSONBeanNoData(Constant.SUCCESS,"请求成功");
        return jsonBean;
    }

    public JSONBean success(String message){
        JSONBean jsonBean = new JSONBeanNoData(Constant.SUCCESS,message);
        return jsonBean;
    }

    public JSONBean success(Object object){
        JSONBean jsonBean = new JSONBeanData(Constant.SUCCESS,"请求成功",object);
        return jsonBean;
    }

    public JSONBean success(String message, Object object){
        JSONBean jsonBean = new JSONBeanData(Constant.SUCCESS,message,object);
        return jsonBean;
    }

    public JSONBean failure(){
        JSONBean jsonBean = new JSONBeanNoData(Constant.FAIL,"请求失败");
        return jsonBean;
    }

    public JSONBean failure(String message){
        JSONBean jsonBean = new JSONBeanNoData(Constant.FAIL,message);
        return jsonBean;
    }

}
