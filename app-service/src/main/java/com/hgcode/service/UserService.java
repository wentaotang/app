package com.hgcode.service;

import com.hgcode.domain.UserEntity;

import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
public interface UserService{
    /**
     *
     * @param userName
     * @return
     */
    UserEntity findByUserName(String userName);


    void save(UserEntity userEntity);

    List<UserEntity> findList();
}
