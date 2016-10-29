package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;


/**
 * Created by wentao on 2016/1/9.
 */
public class UserEntity {
    private Integer id;
    @NotNull(message = "{username.is.null}")
    private String userName;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
