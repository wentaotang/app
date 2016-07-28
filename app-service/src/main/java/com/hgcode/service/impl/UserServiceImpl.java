package com.hgcode.service.impl;

import com.hgcode.domain.UserEntity;
import com.hgcode.mybatis.repository.UserRepository;
import com.hgcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findByUserName(String userName) {
        return null;
    }

    @Override
    public void save(UserEntity userEntity) {

    }

    @Override
    public List<UserEntity> findList() {
        return userRepository.findList();
    }
}
