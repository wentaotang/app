package com.hgcode.jedis;

import java.util.ResourceBundle;

/**
 * Created by wentao on 2015/10/28.
 */
public class JedisPoolUtils {
    private JedisPoolUtils(){

    }
    private static ResourceBundle rb;

    static {
        rb=ResourceBundle.getBundle("jdbc");
    }

    private static class Singleton{
        private static final JedisPool INSTANCE =new JedisPoolBuilder().setPoolName("pool").setTimeout(2000).setUrl(rb.getString("redis.url")).buildPool();
    }

    private static class DB0{
        private static final JedisPool INSTANCE =new JedisPoolBuilder().setPoolName("pool").setDatabase(0).setTimeout(2000).setUrl(rb.getString("redis.url")).buildPool();
    }

    private static class DB1{
        private static final JedisPool INSTANCE =new JedisPoolBuilder().setPoolName("pool").setDatabase(1).setTimeout(2000).setUrl(rb.getString("redis.url")).buildPool();
    }

    private static class DB2{
        private static final JedisPool INSTANCE =new JedisPoolBuilder().setPoolName("pool").setDatabase(2).setTimeout(2000).setUrl(rb.getString("redis.url")).buildPool();
    }

    public static final JedisPool getJedisPopol(Integer index){
        JedisPool jedisPool=null;
        switch (index){
            case 0:jedisPool= DB0.INSTANCE;break;
            case 1:jedisPool= DB1.INSTANCE;break;
            case 2:jedisPool= DB2.INSTANCE;break;
        }
        return jedisPool;
    }
}
