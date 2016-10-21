/**
 * 
 */
package com.hgcode.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @author qijianbin@hanyalicai.com
 *
 */
public class FastJsonSerializer implements RedisSerializer<Object> {
	protected static final Logger log = LoggerFactory.getLogger(FastJsonSerializer.class);
	static final byte[] EMPTY_ARRAY = new byte[0];

	@Override
	public byte[] serialize(Object o) throws SerializationException {
		if(null != o) {
			return JSON.toJSONBytes(o, SerializerFeature.WriteNullBooleanAsFalse,
					SerializerFeature.WriteNullNumberAsZero,
					SerializerFeature.WriteNullStringAsEmpty,
					SerializerFeature.WriteMapNullValue);
			//return JSON.toJSONBytes(t);
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object deserialize(byte[] bytes) throws SerializationException {
		if (bytes == null || bytes.length == 0) {
			return null;
		}
		try {
			return JSON.parse(new String(bytes));
		} catch (Exception ex) {
			log.error("", ex);
		}
		return null;
	}
}
