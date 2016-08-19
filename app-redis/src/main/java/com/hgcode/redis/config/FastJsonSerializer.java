package com.hgcode.redis.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class FastJsonSerializer<E> implements RedisSerializer<E> {

    protected static final Logger log = LoggerFactory.getLogger(FastJsonSerializer.class);

    static final byte[] EMPTY_ARRAY = new byte[0];

    private final Class<E> javaType;

    public FastJsonSerializer(Class<E> type) {
        this.javaType = type;
    }

    @Override
    public byte[] serialize(E t) throws SerializationException {
        if (null != t) {
            return JSON.toJSONBytes(t, SerializerFeature.WriteNullBooleanAsFalse,
                    SerializerFeature.WriteNullNumberAsZero,
                    SerializerFeature.WriteNullStringAsEmpty);
        }
        return EMPTY_ARRAY;
    }

    @Override
    public E deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            return JSON.parseObject(bytes, this.javaType);
        } catch (Exception ex) {
            log.error("", ex);
            return null;
        }
    }

}
