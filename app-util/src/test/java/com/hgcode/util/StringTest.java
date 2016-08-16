package com.hgcode.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;



/**
 * Created by wentao on 2015/10/4.
 */
public class StringTest {

    @Test
    public void test(){
        String str="123456";
        System.out.println(DigestUtils.sha1Hex(str));
    }
}
