package com.wzq.ssm.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;

/**
 * 用户sha1加密的验证方法
 */
public class SecondRealm extends AuthenticatingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//      1把AuthenticationToken类型转换为UsernamePasswordToken
        UsernamePasswordToken  upToken= (UsernamePasswordToken) token;

        // 2 根据UsernamePasswordToken来获取username
        String username = upToken.getUsername();

        //3 根据username 来查询数据库的数据
        System.out.println("查询数据库的"+username+"数据");

        // 4 若数据库没有数据  测抛出异常UnknownAccountException
        if ("unknown".equals(username)){
            throw new UnknownAccountException("用户不存在！");
        }
        if ("monster".equals(username)){
            throw new LockedAccountException("用户锁定");
        }

        //5 根据用户情况来抛出其他异常

        // 根据用户情况  来构建AuthenticationInfo的饭回来先
//        System.out.println("被拦截啦！"+token);

        //1） 第一个参数：认证的实体类信息，可以是username 也可以是数据表用户对应的是实体类对象
        Object principal = username;
        //2） 第二个参数：用户的密码 password
        Object hashedCreds = null;
        if ("admin".equals(username)){
            //加密密码
            String name = "SHA1";
            Object source = "123456";
            Object salt = ByteSource.Util.bytes("admin");
            int hash = 1024;
            hashedCreds  = new SimpleHash(name,source,salt,hash);

        }
        if ("user".equals(username)) {
            //加密密码
            String name = "SHA1";
            Object source = "123456";
            Object salt = ByteSource.Util.bytes("admin");
            int hash = 1024;
            hashedCreds  = new SimpleHash(name,source,salt,hash);
        }

        //3） 第三个参数：当前realm对象的name,调用父类的getName即可
        String realmName = getName();

        //4） 盐值加密
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo("secondRealmName",hashedCreds, credentialsSalt, realmName);

//        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(name,"123456",realm);
        return info;
    }


    public static void main(String[] args) {
        //加密密码
        String name = "SHA1";
        Object source = "123456";
        Object salt = "admin";
        int hashlterations = 1024;
        Object result  = new SimpleHash(name,source,salt,hashlterations);
        System.out.println(result);
    }


    //    @Override
//    public String getName() {
//        return null;
//    }
//
//    @Override
//    public boolean supports(AuthenticationToken authenticationToken) {
//        return false;
//    }
//
//    @Override
//    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        return null;
//    }
}
