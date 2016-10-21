package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 用户和角色关联实体
 * Created by wentao on 16/3/5.
 */
public class UserRoleEntity {

    private int id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 角色ID
     */
    private Integer roleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
