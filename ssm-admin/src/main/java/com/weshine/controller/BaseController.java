package com.weshine.controller;


import com.weshine.support.bean.common.*;

public abstract class BaseController {

    public ResultBean success(){
        ResultBean resultNoData = new ResultNoData(Constant.SUCCESS,"请求成功");
        return resultNoData;
    }

    public ResultBean success(String message){
        ResultBean resultNoData = new ResultNoData(Constant.SUCCESS,message);
        return resultNoData;
    }

    public ResultBean success(Object object){
        ResultBean resultData = new ResultData(Constant.SUCCESS,"请求成功",object);
        return resultData;
    }

    public ResultBean success(String message, Object object){
        ResultBean resultData = new ResultData(Constant.SUCCESS,message,object);
        return resultData;
    }

    public ResultBean failure(){
        ResultBean resultNoData = new ResultNoData(Constant.FAIL,"请求失败");
        return resultNoData;
    }

    public ResultBean failure(String message){
        ResultBean resultNoData = new ResultNoData(Constant.FAIL,message);
        return resultNoData;
    }

}
