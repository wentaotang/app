package com.hgcode.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by wentao on 2016/12/18.
 */
public class EncodeDemo {


    @Test
    public void encrypt() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String str="$2a$10$34MhMmwHZk1tjXJpjmwyPOGxywGHbrsgWASdAv6MfrKyp6uBDTEA.";
        // 每次生成的密码都不一样
        System.out.println(passwordEncoder.encode("123456"));
    }
}
