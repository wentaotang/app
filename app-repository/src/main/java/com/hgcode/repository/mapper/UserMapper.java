package com.hgcode.repository.mapper;

import com.hgcode.domain.UserEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
@Repository
public interface UserMapper  {
     List<UserEntity> findList();
}
