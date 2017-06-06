package com.hgcode.web.controller;

import com.hgcode.domain.UserEntity;
import com.hgcode.web.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wentao on 2016/12/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String  list(){
        return "user/list";
    }


    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public List<UserEntity>  listData(UserForm userForm){
        List<UserEntity> result=new ArrayList<>();
        for(int i=0;i<=100;i++){
            UserEntity userEntity=new UserEntity();
            userEntity.setUserName("twt-"+i);
            userEntity.setId(1+i);
            userEntity.setMobile("13466329314");
            userEntity.setRegisterDate(org.apache.commons.lang3.time.DateUtils.addDays(new Date(),i));
            result.add(userEntity);
        }
        return result;

    }

    @RequestMapping("/add")
    public String  addDemo(){
        return "user/add";
    }

}
