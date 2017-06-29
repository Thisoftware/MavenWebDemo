package com.common.consts;

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

    GOLO_REQUEST_ERROR(400001,"golo平台接口请求出错"),

    BRAND_NOT_FOUNT(400002,"该品牌存在"),

    OBD_HAS_BINDED(400003,"obd已经被绑定"),

    GOLO_DATA_NULL(400004,"空数据异常"),


    GOLO_SERIES_NOT_EXITS(400005,"序列号不存在"),
    OBD_SERIES_NOT_FOUNT(400006,"该OBD序列号不存在"),
    DEVICE_NOT_ACTIVE(400007,"请先激活设备");

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
