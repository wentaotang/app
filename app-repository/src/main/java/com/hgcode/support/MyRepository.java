package com.hgcode.support;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wentao on 2016/1/9.
 */
public interface MyRepository<T> extends Mapper<T>, MySqlMapper<T> {
}
