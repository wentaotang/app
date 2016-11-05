package com.hgcode.web.controller;

import com.hgcode.domain.UserEntity;
import com.hgcode.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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

    @RequestMapping("/add")
    public List<ObjectError> index(@Valid UserEntity userEntity , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors();
        }
        return null;
    }

    @RequestMapping("/session")
    public String session(HttpServletRequest request){
        String param=request.getParameter("param");
        if(StringUtils.isBlank(param)){
            request.getSession().setAttribute("param","123456");
        }else{
            request.getSession().setAttribute("param",param);
        }
        return (String)request.getSession().getAttribute("param");
    }
}
