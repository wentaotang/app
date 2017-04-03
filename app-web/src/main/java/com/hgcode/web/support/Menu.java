package com.hgcode.web.support;

/**
 * Created by wentao on 2016/12/25.
 */
public class Menu {
    /**
     * 菜单ID
     */
    private String id;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 目标
     */
    private String target;
    /**
     * 菜单url
     */
    private String url;
    /**
     * 子菜单
     */
    private Menu child;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Menu getChild() {
        return child;
    }

    public void setChild(Menu child) {
        this.child = child;
    }
}
