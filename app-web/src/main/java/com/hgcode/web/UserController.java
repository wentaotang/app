package com.hgcode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wentao on 16/1/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "user/list";
    }

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        return "demo";
    }
}
