package com.shop.manage.utils;

import com.shop.manage.constant.CommonConstant;

public class ResultMap<T> {
    private int code;
    private String msg;
    private T result;

    public ResultMap() {
        code = CommonConstant.SUCCESS;
        msg = CommonConstant.RESULT_SUCCESS;
    }

    public ResultMap(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMap(int code, String msg, T result) {
        super();
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
