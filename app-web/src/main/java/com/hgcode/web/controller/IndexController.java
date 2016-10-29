package com.hgcode.web.controller;

import com.hgcode.domain.UserEntity;
import com.hgcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wentao on 2016/10/29.
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public List<UserEntity> index(){
     List<UserEntity> list=   userService.findList();
        return list;
    }
}
