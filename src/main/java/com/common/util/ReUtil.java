package com.common.util;


import com.common.consts.ReCode;
import com.common.consts.ReData;

public class ReUtil {
    
    public static ReData success(){
        ReData reData = new ReData();
        reData.setCode(ReCode.SUCCESS.getCode());
        reData.setMsg(ReCode.SUCCESS.getMsg());
        reData.setData("");
        return reData;
    }
    
    public static ReData success(Object data){
        ReData reData = new ReData();
        reData.setCode(ReCode.SUCCESS.getCode());
        reData.setMsg(ReCode.SUCCESS.getMsg());
        reData.setData(data);
        return reData;
    }
    
    public static ReData success(Object data,ReCode reCode){
        ReData reData = new ReData();
        reData.setData(data);
        reData.setCode(reCode.getCode());
        reData.setMsg(reCode.getMsg());
        return reData;
    }
    
    public static ReData fail(){
        ReData reData = new ReData();
        reData.setCode(ReCode.FAIL.getCode());
        reData.setMsg(ReCode.FAIL.getMsg());
        reData.setData("");
        return reData;
    }
    
    public static ReData fail(Object data){
        ReData reData = new ReData();
        reData.setData(data);
        reData.setCode(ReCode.FAIL.getCode());
        reData.setMsg(ReCode.FAIL.getMsg());
        return reData;
    }
    public static ReData fail(Object data,ReCode reCode){
        ReData reData = new ReData();
        reData.setData(data);
        reData.setCode(reCode.getCode());
        reData.setMsg(reCode.getMsg());
        return reData;
    }
    
    public static ReData fail(ReCode reCode){
        ReData reData = new ReData();
        reData.setCode(reCode.getCode());
        reData.setMsg(reCode.getMsg());
        reData.setData("");
        return reData;
    }
    
}
