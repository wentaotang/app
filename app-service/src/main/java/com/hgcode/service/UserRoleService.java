package com.hgcode.service;

import java.util.List;

/**
 * Created by wentao on 16/3/5.
 */
public interface UserRoleService{
    /**
     * 根据用户ID查询所拥有的角色
     * @param useId
     * @return
     */
    List<String> findRoles(Integer useId);
}
