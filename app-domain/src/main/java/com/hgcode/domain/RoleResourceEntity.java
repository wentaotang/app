package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by wentao on 16/3/26.
 */
public class RoleResourceEntity {

    private Integer id;

    private Integer roleId;

    private Integer resourceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
