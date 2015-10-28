package com.hgcode.jedis;

import java.util.concurrent.ExecutionException;

/**
 * Created by wentao on 2015/10/28.
 */
public class JedisTest {
    public static void main(String[] args) throws ExecutionException {

        String url="direct://192.168.200.128:6379?poolSize=500";

        JedisPool jedisPool=JedisPoolUtils.getJedisPopol(0);
        JedisPool jedisPool2=JedisPoolUtils.getJedisPopol(0);
        JedisPool jedisPool3=JedisPoolUtils.getJedisPopol(0);
        System.out.println(jedisPool);
        System.out.println(jedisPool2);
        System.out.println(jedisPool3);
    }
}
