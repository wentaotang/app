package com.hgcode.repository;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by wentao on 2015/9/30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
 @Documented
@Component
public @interface MyBatisRepository {
    String value() default "";
}
