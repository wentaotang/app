package com.hgcode.shiro;

import com.hgcode.domain.ResourceEntity;
import com.hgcode.domain.UserEntity;
import com.hgcode.service.RoleService;
import com.hgcode.service.UserRoleService;
import com.hgcode.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wentao on 16/3/2.
 */
public class MyShiroRealm extends AuthorizingRealm {

    /*@Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private RoleService roleService;*/

    /**
     * 授权信息
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        /*String username=(String)principals.fromRealm(getName()).iterator().next();
        UserEntity user=userService.findByUserName(username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        List<String> roles=userRoleService.findRoles(user.getId());
        for(String role:roles){
            authorizationInfo.addRole(role);
            List<ResourceEntity> resourceList=null;//roleService.findResources(role);
            for(ResourceEntity resource:resourceList){
                authorizationInfo.addStringPermission(resource.getPermission());
            }
        }
        return authorizationInfo;*/
        return null;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();

        return null;
    }
}
