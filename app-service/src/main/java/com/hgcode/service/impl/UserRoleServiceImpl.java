package com.hgcode.service.impl;

import com.hgcode.repository.mybatis.UserRoleRepository;
import com.hgcode.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

/**
 * Created by wentao on 16/3/5.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public Set<String> findRoles(Integer useId) {
        return null;
    }
}
