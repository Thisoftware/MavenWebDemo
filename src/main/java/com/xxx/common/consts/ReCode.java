package com.xxx.common.consts;

public enum ReCode {
    SUCCESS(0,"success"),
    FAIL(1,"FAIL"),
    /** 
    * @Fields WRONG_PASSWORD : 用户名或密码错误 
    */ 
    WRONG_PASSWORD_OR_USERNAME(100000,"用户名或密码错误"),
    
    USER_NOT_FOUND(100001,"该用户不存在"),

    UNAUTHORIZED_ACCESS(100003,"无权访问"),

    SING_ERROR(100004,"sign错误"),

    GOLO_DATA_NULL(400004,"空数据异常");

    private int code;
    private String msg;
    
    ReCode(int code, String msg){
        this.code = code;
        this.msg = msg;
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
    
}
