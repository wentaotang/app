package com.hgcode.domain;

import com.hgcode.util.SysConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by wentao on 2016/1/9.
 */
public class UserEntity {

    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐值
     */
    private String salt;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return RandomStringUtils.random(SysConstants.SALT_LENGTH,true,true);
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
