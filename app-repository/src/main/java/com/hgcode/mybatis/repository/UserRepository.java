package com.hgcode.mybatis.repository;

import com.hgcode.domain.UserEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by wentao on 2016/1/9.
 */
@Repository
public interface UserRepository extends Mapper<UserEntity>{
}
