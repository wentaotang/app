package com.hgcode.service.impl;

import com.github.pagehelper.PageHelper;
import com.hgcode.domain.UserEntity;
import com.hgcode.mybatis.repository.UserRepository;
import com.hgcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by wentao on 2016/1/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserEntity findByUserName(String userName) {
        return null;
    }
}
