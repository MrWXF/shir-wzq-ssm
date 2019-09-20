package com.wzq.ssm.controller;

import com.wzq.ssm.model.Admin;
import com.wzq.ssm.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        Admin admin1 = new Admin("wzq","222",2);
        int saveconnt = adminService.sava(admin1);
        System.out.println(saveconnt);
        return "page/list-test";
    }

    /**
     * 删除数据
     * @return
     */
    @RequestMapping("/delete")
    public String delete() {
        int deletecont = adminService.delete(4);

        System.out.println(deletecont);
        return "delete";
    }

    @RequestMapping("/update")
    public String update(){

        Admin admin = new Admin("吴金兰","123",1);
        admin.setId(5);
        adminService.update(admin);
        return "update";
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
            return "redirect:/admin/no_power.do";
        }
        return "redirect:/admin/findAll.do";
    }

    /**
     * 权限不够页面
     */
    @RequestMapping("no_power")
    public String noPower(){

        ModelAndView mv = new ModelAndView();
        String no_power = "对不起！你没有权限访问！";
        mv.addObject("nopower",no_power);
        return "/page/login";
    }

    /**
     * 注销页面
     */
    @RequestMapping("/logout")
    public String logout(){

        return null;
    }

}
