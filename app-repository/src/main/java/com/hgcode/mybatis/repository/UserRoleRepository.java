package com.hgcode.mybatis.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
@Repository
public interface UserRoleRepository {
    /**
     * 根据用户ID查询所拥有的角色
     * @param userId
     * @return
     */
    List<String> findRoles(Integer userId);
}
