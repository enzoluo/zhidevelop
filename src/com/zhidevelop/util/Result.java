package com.zhidevelop.util;

/**
 * description
 * author enzoluo
 * time 2017-09-19 17:57
 * version v1.0
 **/
public class Result {
    private String msg;
    private Object obj;
    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
