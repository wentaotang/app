package com.hgcode.service;

import com.hgcode.domain.UserEntity;

import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
public interface UserService extends IService<UserEntity>{
    List<UserEntity> selectByCountry(UserEntity country, int page, int pagesize);

    /**
     *
     * @param userName
     * @return
     */
    UserEntity findByUserName(String userName);
}
