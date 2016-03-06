package com.hgcode.service;

import com.hgcode.domain.UserRole;

import java.util.Set;

/**
 * Created by wentao on 16/3/5.
 */
public interface UserRoleService{
    /**
     * 根据用户ID查询所拥有的角色
     * @param useId
     * @return
     */
    Set<String> findRoles(Integer useId);
}
