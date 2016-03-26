package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * 用户和角色关联实体
 * Created by wentao on 16/3/5.
 */
@Table(name = "sys_user_role")
public class UserRoleEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;
    /**
     * 角色ID
     */
    @Column(name = "role_id")
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
