package com.hgcode.domain;

import com.hgcode.vo.ResourceTypeEnum;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by wentao on 16/3/5.
 */
public class Resource {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String url;
    @Column(name="")
    private ResourceTypeEnum resourceTypeEnum;
}
