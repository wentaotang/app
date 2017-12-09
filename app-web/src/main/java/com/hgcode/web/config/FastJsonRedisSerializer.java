package com.hgcode.web.config;

import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Created by wentao on 2016/10/30.
 */
public class FastJsonRedisSerializer implements RedisSerializer<Object> {
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (o == null){
            return new byte[0];
        }
        return JSON.toJSONBytes(o);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0){
            return null;
        }
        return JSON.parse(bytes);
    }
}
