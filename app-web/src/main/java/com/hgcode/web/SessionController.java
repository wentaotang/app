package com.hgcode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by wentao on 2016/10/22.
 */
@RestController
@RequestMapping("/session")
public class SessionController {

    public String index(HttpSession session){
        session.setAttribute("user","123456");
        return "";
    }
}
