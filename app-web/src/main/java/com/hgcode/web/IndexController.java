package com.hgcode.web;

import org.springframework.stereotype.Controller;

/**
 * Created by wentao on 16/1/24.
 */
@Controller
public class IndexController {

    public String index(){
        return "index";
    }
}
