package com.xxx.aop;

import com.xxx.common.consts.ReCode;
import com.xxx.exception.Warning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/16 0016.
 * 参数校验返回值
 */
@Component
@Aspect
public class ParamCheckAop {
    @Before("execution(* com.cxzh.chaos.controller..*(..)) && args(..,bindingResult))")
    public void beforeController(BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()){
            List<FieldError> fieldErrors =  bindingResult.getFieldErrors();
            List<String> cues = new ArrayList<>();
            for(FieldError fieldError:fieldErrors){
                String field = fieldError.getField();
                String error = fieldError.getDefaultMessage();
                cues.add(field+":"+error);
            }
            throw new Warning(ReCode.FAIL,cues);
        }
    }
}