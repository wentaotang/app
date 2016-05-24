package com.hgcode.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.persistence.*;

/**
 * Created by wentao on 2016/1/9.
 */
@Entity
@Table(name="user")
public class UserEntity {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 用户名
     */
    @Column(name = "name")
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
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
