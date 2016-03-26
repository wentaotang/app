package com.hgcode.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by wentao on 2015/10/5.
 */
public class StringUtil {
    /**
     * 生成随机盐值
     * @return
     */
    public static String randomSalt(){
        return RandomStringUtils.random(SysConstants.SALT_LENGTH,true,true);
    }
}
