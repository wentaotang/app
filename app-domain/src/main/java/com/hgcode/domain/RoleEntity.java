package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by wentao on 16/3/4.
 */

public class RoleEntity {

    private Integer id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * 资源IDs
     */

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
