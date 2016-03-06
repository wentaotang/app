package com.hgcode.shiro;

import com.hgcode.domain.User;
import com.hgcode.service.UserRoleService;
import com.hgcode.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by wentao on 16/3/2.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 授权信息
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username=(String)principals.fromRealm(getName()).iterator().next();
        User user=userService.findByUserName(username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        /*Set<String> roles=.findRoles(user.getId());
        authorizationInfo.setRoles();
        authorizationInfo.setStringPermissions(role.getPermissions());*/

        return authorizationInfo;
    }

    /**
     * 认证信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();
       /* if( userName != null && !"".equals(userName) ){
            User userEntity = accountManager.login(token.getUsername(), token.getPassword());

            if( user != null )
                return new SimpleAuthenticationInfo(user.getLoginName(),user.getPassword(), getName());
        }*/
        return null;
    }
}
