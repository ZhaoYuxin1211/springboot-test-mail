package com.javasm.springboottestmail.common.http;

import java.util.HashMap;

/**
 * @Author：Dilraba
 * @Version：1.0
 * @Date：2021/11/1-17:15
 * @Since:jdk1.8
 * @Description:
 */
public class AjaxResult extends HashMap<String,Object> {
    private static final String STATUS = "status";
    private static final String MESSAGE = "message";
    private static final String DATA = "data";
    private static final String TOTAL="total";
    //2.构造方法私有化，不让别人去new
    private AjaxResult(EnumStatus enumStatus) {
        this.put(STATUS,enumStatus.getStatus());
        this.put(MESSAGE,enumStatus.getMessage());
    }
    //3.成功的默认状态码和信息
    public static AjaxResult success(){
        return new AjaxResult(EnumStatus.SUCCESS);
    }
    //4.成功返回后的自定义状态码,比如返回新建成功
    public static AjaxResult success(EnumStatus enumStatus){
        return new AjaxResult(enumStatus);
    }
    //5.成功返回后携带数据
    public static AjaxResult success(Object data){
        //状态码是key = status  value= 2000
        // key = message   value= 成功
//        success是map，里已经有了两个key 两个value
        AjaxResult success = success();
        success.put(DATA,data);
        return success;
    }

    //6.返回数据成功后，分页查询携带数据和总记录数
    public static AjaxResult success(Object data, long total){
        AjaxResult success = success();
        success.put(DATA,data);
        success.put(TOTAL,total);
        return success;
    }
    //7.失败后，默认返回状态码和提示信息
    public static AjaxResult error(){
        return new AjaxResult(EnumStatus.ERROR);
    }
    //8.失败后，自定义返回状态码和提示信息
    public static AjaxResult error(EnumStatus enumStatus){
        return new AjaxResult(enumStatus);
    }


    //9.成功返回后携带数据
    public static AjaxResult success(EnumStatus enumStatus, Object data){
        AjaxResult ajaxResult = new AjaxResult(enumStatus);
        ajaxResult.put(DATA,data);
        return ajaxResult;
    }
}