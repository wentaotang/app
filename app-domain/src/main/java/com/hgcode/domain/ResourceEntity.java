package com.hgcode.domain;

import com.hgcode.vo.ResourceTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * Created by wentao on 16/3/5.
 */
public class ResourceEntity {

    private Integer id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源URL
     */
    private String url;
    /**
     * 资源类型 menu 或 button
     */
    private String type;
    /**
     * 父ID
     */
    private Integer parentId;
    /**
     * 权限(shiro引入)
     */
    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
