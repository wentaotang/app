package com.hgcode.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/10/24
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class SessionController {

    @RequestMapping("/session")
    public String index() {
        return "ok";
    }
}
