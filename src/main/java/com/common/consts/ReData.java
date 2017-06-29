package com.common.consts;

public class ReData {
    
    /** 
     * @Fields code : 返回码 
     */ 
    private int code;
     /** 
      * @Fields msg : 返回信息 
      */ 
    private String msg;
    /** 
    * @Fields data : 返回数据 
    */ 
    private Object data;
    
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
}
