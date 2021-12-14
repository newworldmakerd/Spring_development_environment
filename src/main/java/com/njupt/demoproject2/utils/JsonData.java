package com.njupt.demoproject2.utils;

public class JsonData {
    private int code;
    private Object data;
    private String msg;

    public JsonData() {
    }

    public JsonData(int code, Object data) {
        this.data = data;
        this.code = code;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public static JsonData buildSucess(Object data){
        return new JsonData(1,data);
    }
    public static JsonData buildError(String msg,int code){
        return new JsonData(-1,"",msg);
    }
}
