package com.example.demo.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    private Result(){

    }
    public static Result ok(){
        Result r=new Result();
        r.setSuccess(com.example.demo.common.ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(com.example.demo.common.ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(com.example.demo.common.ResultCodeEnum.SUCCESS.getMessages());
        return r;

    }
    public static Result error(){
        Result r=new Result();
        r.setSuccess(com.example.demo.common.ResultCodeEnum.UNKNOW_REASON.getSuccess());
        r.setCode(com.example.demo.common.ResultCodeEnum.UNKNOW_REASON.getCode());
        r.setMessage(com.example.demo.common.ResultCodeEnum.UNKNOW_REASON.getMessages());
        return r;
    }

    public static Result setResult(com.example.demo.common.ResultCodeEnum result){
        Result r=new Result();
        r.setSuccess(result.getSuccess());
        r.setCode(result.getCode());
        r.setMessage(result.getMessages());
        return r;
    }
    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result data(String key,Object value){
        this.data.put(key, value);
        return this;
    }

    public  Result data( Map<String, Object> map){
        this.setData(map);
        return this;

    }

}


//
///**
// * @author yinyin
// * @create 2021/07/22 下午 6:03
// */
//@Data
//public class Result {
//
//    private Boolean success;
//
//    private Integer code;
//
//    private String message;
//
//    private Map<String, Object> data = new HashMap<String, Object>();
//
//    private Result(){
//
//    }
//    public static Result ok(){
//        Result r=new Result();
//        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
//        r.setCode(ResultCodeEnum.SUCCESS.getCode());
//        r.setMessage(ResultCodeEnum.SUCCESS.getMessages());
//        return r;
//
//    }
//    public static Result error(){
//        Result r=new Result();
//        r.setSuccess(ResultCodeEnum.UNKNOW_REASON.getSuccess());
//        r.setCode(ResultCodeEnum.UNKNOW_REASON.getCode());
//        r.setMessage(ResultCodeEnum.UNKNOW_REASON.getMessages());
//        return r;
//    }
//
//    public static Result setResult(ResultCodeEnum result){
//        Result r=new Result();
//        r.setSuccess(result.getSuccess());
//        r.setCode(result.getCode());
//        r.setMessage(result.getMessages());
//        return r;
//    }
//    public Result success(Boolean success){
//        this.setSuccess(success);
//        return this;
//    }
//
//    private void setSuccess(Boolean success) {
//    }
//
//    public Result code(Integer code){
//        this.setCode(code);
//        return this;
//    }
//
//    private void setCode(Integer code) {
//    }
//
//    public Result message(String message){
//        this.setMessage(message);
//        return this;
//    }
//
//    private void setMessage(String message) {
//    }
//
//    public Result data(String key,Object value){
//        this.data.put(key, value);
//        return this;
//    }
//
//    public  Result data( Map<String, Object> map){
//        this.setData(map);
//        return this;
//
//    }
//
//    private void setData(Map<String, Object> map) {
//    }
//
//}
