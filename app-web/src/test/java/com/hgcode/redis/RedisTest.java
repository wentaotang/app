package com.hgcode.redis;

import com.hgcode.domain.UserEntity;
import com.hgcode.redis.repository.UserRedisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wentao on 2016/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class RedisTest {

    @Autowired
    private ApplicationContext applicationContext;
 

    @Test
    public void addTest(){
       UserRedisRepository userRedisRepository= applicationContext.getBean(UserRedisRepository.class);
       UserEntity userEntity=new UserEntity();
       userEntity.setUserName("123");
       userEntity.setId(123);
       userRedisRepository.save(userEntity);
    }



}
