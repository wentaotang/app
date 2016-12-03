package com.hgcode.web.support;

import com.hgcode.domain.UserEntity;

/**
 * Created by wentao on 2016/12/3.
 */
public class UserContext implements AutoCloseable

{
    static final ThreadLocal<UserEntity> current = new ThreadLocal<UserEntity>();

    public UserContext(UserEntity user) {
        current.set(user);
    }

    public static UserEntity getCurrentUser() {
        return current.get();
    }

    @Override
    public void close() throws Exception {
        current.remove();
    }
}
