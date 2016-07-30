package com.hgcode.web;

import com.hgcode.domain.UserEntity;
import com.hgcode.service.UserService;
import com.hgcode.vo.GridJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wentao on 16/1/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "user/list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public GridJson<UserEntity> dolist(){
        return new GridJson<UserEntity>(userService.findList(),25);
    }

}
