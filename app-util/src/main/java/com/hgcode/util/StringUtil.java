package com.hgcode.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

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

    /**
     * 前闭后开的区间
     * @param from
     * @param to
     * @return
     */
    public static int randomInt(int from,int to){
        return ThreadLocalRandom.current().nextInt(from,to);
    }
}
