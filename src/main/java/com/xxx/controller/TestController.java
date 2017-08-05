package com.xxx.controller;

import com.xxx.common.consts.ReData;
import com.xxx.common.util.ReUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangyaoliang on 2017-06-12.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    @ResponseBody
    public ReData getMessage(String message){
        if(message == null){
            return ReUtil.fail("");
        }
        return ReUtil.success(message);
    }

}
