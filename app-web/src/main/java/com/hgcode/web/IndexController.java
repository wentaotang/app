package com.hgcode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wentao on 16/1/24.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/map")
    @ResponseBody
    public Map<String,String> map(){
        Map<String,String> map=new HashMap<>();
        map.put("username","sdfsadf<script>");
        return map;
    }

}
