package com.antao.servermanager.model;

import java.io.Serializable;

/**
 * @author     ：antao
 * @date        2022/7/24 12:19
 * @description： 前后端数据返回对象
 * @modified By：
 */
public class ResMessage implements Serializable {

    public static final int SUCCESS = 0;
    public static final int FAIL = 1;

    //请求反应结果代码
    private int code = SUCCESS;

    //请求成功数据
    private Object data;

    //请求错误消息
    private String errMessage;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}