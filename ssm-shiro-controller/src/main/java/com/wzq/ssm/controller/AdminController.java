package com.wzq.ssm.controller;

import com.wzq.ssm.model.Admin;
import com.wzq.ssm.service.AdminService;
import com.wzq.ssm.service.shiro.IRoleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<Admin> admins = adminService.findAll();

        System.out.println(admins);

        model.addAttribute("admins",admins);
        return "/page/list-test";
    }

    /**
     * 保存数据
     * @return
     */
    @RequestMapping("/sava")
    public String sava(){

        return null;
    }

    /**
     * 删除数据
     * @return
     */
    @RequestMapping("/delete")
    public String delete() {
        return null;
    }

    @RequestMapping("/update")
    public String update(){

        return null;
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password,Model model){

        try {
            //1.获取Subject对象

            Subject subject = SecurityUtils.getSubject();

            //2 判断是否已登录
            if(subject.isAuthenticated()){
                //已登录，直接跳转到主页面
                return "redirect:/admin/findAll.do";
            }

            //未登录 执行验证（IShiroRealm执行数据库认证）
            UsernamePasswordToken token = new UsernamePasswordToken(name,password);
            token.setRememberMe(true);
            //执行登陆
            subject.login(token);
        }catch (AuthenticationException e){
            //验证失败 跳转失败页面
            model.addAttribute("msg","用户名或密码错误！");
            return "redirect:/admin/no_power.do";
        }
        return "redirect:/admin/findAll.do";
    }

    /**
     * 验证错误页面
     */
    @RequestMapping("no_power")
    public String noPower(@ModelAttribute("msg") String msg,Model model){
        System.out.println(msg);
        System.out.println("no_power");
        model.addAttribute("msg",msg);

        return "/page/login";
    }

    /**
     * 注销页面
     */
    @RequestMapping("/logout")
    public String logout(){

        return "redirect:/page/login";
    }

    /**
     * 刷新用户数据,然后重定向到登陆页面
     */
    @RequestMapping("/reAdmin")
    public String reAdmin(){
        adminService.findAll();
        return "redirect:/admin/login.do";
}

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/register")
    public String register(Admin admin,Model model) {
        ModelAndView mv = new ModelAndView();
        String isEmpty = adminService.register(admin);
        //存储用户是否存在的关键字
        model.addAttribute("isEmpty",isEmpty);

        //若用户不存在则跳转到添加页面
        if ("ok".equals(isEmpty)){
            return "redirect:/admin/add_user.do";
//            mv.setViewName("forward:/admin/add_user.do");
//            return mv;
        }
        //若存在，在提示用户用户名或邮箱已被注册
        String noEmpty = "用户名或邮箱已被注册!";
        model.addAttribute("noEmpty",noEmpty);

//        mv.addObject("noEmpty",noEmpty);
//        mv.setViewName("page/register");
        return "/page/register";
    }

    /**
     * 用户添加
     */
    @RequestMapping("add_user")
    public String addUser(Admin admin,Model model){

        int i = adminService.addUser(admin);
        System.out.println(i);

        //添加完成刷新用户数据
        return "redirect:/reAdmin.do";
    }

}
