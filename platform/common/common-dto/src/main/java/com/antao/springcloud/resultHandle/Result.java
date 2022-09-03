package com.antao.springcloud.resultHandle;

import lombok.Data;

/**
 * @author     ：antao
 * @date        2022/9/3 14:50
 * @description：
 * @modified By：
 */
@Data
public class Result<T> {

    public static final int CODE_SUCCESS = 1;
    public static final int CODE_FAIL = 0;

    //结果码
    private Integer code;

    //消息
    private String message;

    //返回数据
    public T data;

    //请求成功返回
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.code = CODE_SUCCESS;
        result.data = data;
        return  result;
    }


    //请求成功返回
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.code = CODE_SUCCESS;
        return  result;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<>();
        result.code = CODE_FAIL;
        result.message = message;
        return  result;
    }
}