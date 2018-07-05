package com.tian.service.provider.common;

import lombok.Data;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
@Data
public class CommonResponse<T> {

    private int code;

    private String msg;

    private T data;

    public CommonResponse() {
    }

    public CommonResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
