package com.hgcode.service;

import com.hgcode.domain.UserEntity;

/**
 * Created by wentao on 2016/1/9.
 */
public interface UserService {
    /**
     *
     * @param userName
     * @return
     */
    UserEntity findByUserName(String userName);
}
