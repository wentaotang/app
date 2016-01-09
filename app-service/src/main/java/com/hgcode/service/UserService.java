package com.hgcode.service;

import com.hgcode.domain.User;

import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
public interface UserService extends IService<User>{
    List<User> selectByCountry(User country, int page, int pagesize);
}
