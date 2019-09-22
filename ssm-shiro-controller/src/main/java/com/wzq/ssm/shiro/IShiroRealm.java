package com.wzq.ssm.shiro;


import com.wzq.ssm.model.Admin;
import com.wzq.ssm.model.Role;
import com.wzq.ssm.service.AdminService;
import com.wzq.ssm.service.RoleService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IShiroRealm extends AuthorizingRealm {

    @Autowired
    private AdminService adminService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//      1把AuthenticationToken类型转换为UsernamePasswordToken
        UsernamePasswordToken  upToken= (UsernamePasswordToken) token;

        // 2 根据UsernamePasswordToken来获取username
        String name = upToken.getUsername();
        char[] password = upToken.getPassword();
        String pwd = String.valueOf(password);

        //3 根据username 来查询数据库的数据
        Admin admin = (Admin) adminService.lonin(name);

        //获取数据库密码
        String sqlPassword = admin.getPassword();
        // 4 若数据库没有数据  测抛出异常UnknownAccountException
        if (admin==null){
            throw new UnknownAccountException("用户不存在！");
        }

        if ("monster".equals(name)){
            throw new LockedAccountException("用户锁定");
        }

        // 根据用户情况  来构建AuthenticationInfo的饭回来先

        //1） 第一个参数：认证的实体类信息，可以是username 也可以是数据表用户对应的是实体类对象
        Object principal = name;
        //2） 第二个参数：用户的密码 password
        Object hashedCreds = null;
        if (admin.getName().equals(name)){
            //加密密码
            String md5 = "MD5";
            Object source = pwd;
            Object salt = ByteSource.Util.bytes(admin.getName());
            int hash = 1024;
            hashedCreds  = new SimpleHash(md5,source,salt,hash);
        }

        //hashedCreds加密的密码转换为字符串
        String rePassword = String.valueOf(hashedCreds);

        //判断密码是否一致
        if(!sqlPassword.equals(rePassword)){
            throw new IncorrectCredentialsException("密码错误！");
        }
        //3） 第三个参数：当前realm对象的name,调用父类的getName即可
        String realmName = getName();

        //4） 盐值加密
        ByteSource credentialsSalt = ByteSource.Util.bytes(name);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,hashedCreds, credentialsSalt, realmName);
        return info;
    }



    @Autowired
    private RoleService<Role> roleService;
    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //1.利用principals获取登陆用户的信息
        String username = (String) principals.getPrimaryPrincipal();
        Admin admin = (Admin) adminService.lonin(username);
        System.out.println(admin);
        //2 .利用登陆用户的信息来查询当前用户的角色和权限
        String roleName = roleService.roleName(admin.getRole());

        //创建角色集合
        Set<String> role = new HashSet<>();

        //添加角色权限
        role.add(roleName);
        if ("admin".equals(roleName)){
            role.add("user");
        }
//
        //3.    创建，设置角色属性
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(role);


        return null;
    }



}
