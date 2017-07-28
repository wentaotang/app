package com.hgcode.redis.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import sun.rmi.runtime.Log;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/8/19
 * Time: 9:59
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericRedisRepository<E> implements InitializingBean{
    protected FastJsonSerializer serializer;
    protected RedisTemplate<String, E> redisTemplate;
    protected StringRedisTemplate stringRedisTemplate;
    protected RedisTemplate<String,Long> longRedisTemplate;

    @Autowired
    private RedisConnectionFactory jedisConnectionFactory;

    public GenericRedisRepository(){
        redisTemplate = new RedisTemplate();
        stringRedisTemplate = new StringRedisTemplate();
        longRedisTemplate=new RedisTemplate<>();
        serializer = new FastJsonSerializer();

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        redisTemplate.setValueSerializer(serializer);
        redisTemplate.setHashValueSerializer(serializer);
        redisTemplate.setHashKeySerializer(redisTemplate.getStringSerializer());
        redisTemplate.setKeySerializer(redisTemplate.getStringSerializer());
        redisTemplate.afterPropertiesSet();

        stringRedisTemplate.setConnectionFactory(jedisConnectionFactory);
        stringRedisTemplate.setValueSerializer(redisTemplate.getStringSerializer());
        stringRedisTemplate.setHashValueSerializer(redisTemplate.getStringSerializer());
        stringRedisTemplate.setHashKeySerializer(redisTemplate.getStringSerializer());
        stringRedisTemplate.setKeySerializer(redisTemplate.getStringSerializer());
        stringRedisTemplate.afterPropertiesSet();

        longRedisTemplate.setConnectionFactory(jedisConnectionFactory);
        longRedisTemplate.setValueSerializer(redisTemplate.getStringSerializer());
        longRedisTemplate.setHashValueSerializer(redisTemplate.getStringSerializer());
        longRedisTemplate.setHashKeySerializer(redisTemplate.getStringSerializer());
        longRedisTemplate.setKeySerializer(redisTemplate.getStringSerializer());
        longRedisTemplate.afterPropertiesSet();
    }
}
