package com.hgcode.redis.repository;

import com.hgcode.domain.UserEntity;
import com.hgcode.redis.config.GenericRedisRepository;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/8/19
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public class UserRepository extends GenericRedisRepository<UserEntity> {

    public UserRepository(Class<UserEntity> type) {
        super(type);
    }
}
