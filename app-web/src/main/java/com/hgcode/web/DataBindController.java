package com.hgcode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wentao on 16/9/15.
 */
@Controller
@RequestMapping("/bind")
public class DataBindController {

    @RequestMapping(value = "/base")
    @ResponseBody
    public String baseType(int value){
        return "age:"+value;
    }
}
