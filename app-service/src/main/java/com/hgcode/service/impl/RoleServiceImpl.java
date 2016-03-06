package com.hgcode.service.impl;

import com.hgcode.repository.mybatis.RoleRepository;
import com.hgcode.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wentao on 16/3/6.
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

}
