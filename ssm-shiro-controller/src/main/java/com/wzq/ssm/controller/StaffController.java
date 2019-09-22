package com.wzq.ssm.controller;

import com.wzq.ssm.model.Staff;
import com.wzq.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 员工的控制层
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    /**
     * 查所所有员工信息
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<Staff> staffs = staffService.findAll();
        model.addAttribute("staffs",staffs);
        return "/page/staff_info";
    }

    /**
     * 添加员工
     * @return
     */
    @RequestMapping("/addStaff")
    public String addStaff(Staff staff){

        int count = staffService.addStaff(staff);
        System.out.println(count);
        return "redirect:/staff/findAll.do";
    }
}
