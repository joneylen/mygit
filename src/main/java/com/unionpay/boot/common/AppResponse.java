package com.unionpay.boot.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 戴草帽的王子
 * @Date: 2020/3/16 13:58
 * @Version 1.0
 * 项目中统一的返回结果
 */
@Data
public class AppResponse {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    public AppResponse(){}

    public static AppResponse ok(){
        AppResponse r = new AppResponse();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    public static AppResponse error(){
        AppResponse r = new AppResponse();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        r.setMessage(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return r;
    }

    public static AppResponse setResult(ResultCodeEnum resultCodeEnum){
        AppResponse r = new AppResponse();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMessage(resultCodeEnum.getMessage());
        return r;
    }


    public  AppResponse success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public AppResponse message(String message){
        this.setMessage(message);
        return this;
    }

    public AppResponse code(Integer code){
        this.setCode(code);
        return this;
    }

    public AppResponse data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public AppResponse data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}


