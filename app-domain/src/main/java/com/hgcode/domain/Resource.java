package com.hgcode.domain;

import com.hgcode.vo.ResourceTypeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * Created by wentao on 16/3/5.
 */
@Table(name = "sys_resource")
public class Resource {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 资源名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 资源URL
     */
    @Column(name="url")
    private String url;
    /**
     * 资源类型 menu 或 button
     */
    @Column(name="type")
    private String type;
    /**
     * 父ID
     */
    @Column(name = "parent_id")
    private Integer parentId;
    /**
     * 权限(shiro引入)
     */
    @Column(name = "permission")
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
