package com.hgcode.redis.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class FastJsonSerializer implements RedisSerializer<Object> {

    protected static final Logger log = LoggerFactory.getLogger(FastJsonSerializer.class);

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (null != o) {
            return JSON.toJSONBytes(o, SerializerFeature.WriteNullBooleanAsFalse,
                    SerializerFeature.WriteNullNumberAsZero,
                    SerializerFeature.WriteNullStringAsEmpty);
        }
        return new byte[0];
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            return JSON.parseObject(new String(bytes));
        } catch (Exception ex) {
            log.error("", ex);
            return null;
        }
    }
}
