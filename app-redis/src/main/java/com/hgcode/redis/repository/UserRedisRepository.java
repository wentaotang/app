package com.hgcode.redis.repository;

import com.hgcode.domain.UserEntity;
import com.hgcode.redis.config.GenericRedisRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/8/19
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserRedisRepository extends GenericRedisRepository<UserEntity> {

    public void save(UserEntity u){
        redisTemplate.opsForHash().put("abc","1",u);
    }

}
