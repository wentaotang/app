package com.hgcode.service.impl;

import com.github.pagehelper.PageHelper;
import com.hgcode.domain.User;
import com.hgcode.service.UserService;
import org.apache.commons.lang3.StringUtils;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Created by wentao on 2016/1/9.
 */
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Override
    public List<User> selectByCountry(User user, int page, int pagesize) {
        Example example = new Example(User.class);
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
}
