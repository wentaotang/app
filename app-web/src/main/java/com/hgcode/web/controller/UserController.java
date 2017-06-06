package com.hgcode.web.controller;

import com.hgcode.web.support.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wentao on 2016/12/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String  list(){
        return "user/list";
    }

    @RequestMapping("/add")
    public String  addDemo(){
        return "user/add";
    }

}
