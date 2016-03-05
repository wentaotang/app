package com.hgcode.service.impl;

import com.github.pagehelper.PageHelper;
import com.hgcode.domain.UserEntity;
import com.hgcode.repository.UserRepository;
import com.hgcode.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
@Service
public class UserServiceImpl extends BaseService<UserEntity> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> selectByCountry(UserEntity user, int page, int pagesize) {
        Example example = new Example(UserEntity.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(user.getName())) {
            criteria.andLike("name", "%" + user.getName() + "%");
        }
        if (user.getId() != null) {
            criteria.andEqualTo("id", user.getId());
        }
        //分页查询
        PageHelper.startPage(page, pagesize);
        return selectByExample(example);
    }

    @Override
    public UserEntity findByUserName(String userName) {
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName(userName);
        return userRepository.selectOne(userEntity);
    }


}
