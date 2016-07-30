package com.hgcode.context;

import com.hgcode.domain.UserEntity;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/6/27
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class UserContext implements AutoCloseable {

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
