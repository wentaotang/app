package com.hgcode.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 * Created by wentao on 2016/1/9.
 */
@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
