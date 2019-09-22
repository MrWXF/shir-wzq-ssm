package com.wzq.ssm.service.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

public class IRoleService {


    public  String Authentication(String username,String password) {
        try {
            //1.获取Subject对象

            Subject subject = SecurityUtils.getSubject();

            //2 判断是否已登录
            if (subject.isAuthenticated()) {
                //已登录，直接跳转到主页面
                return "ok";
            }

            //未登录 执行验证（IShiroRealm执行数据库认证）
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            //执行登陆
            subject.login(token);
        } catch (
                AuthenticationException e) {
            //验证失败 跳转失败页面
            return "no_ok";
        }
        return "ok";
    }
}
