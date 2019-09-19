package com.wzq.ssm.controller;

import com.wzq.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

        List staffs = staffService.findAll();
        model.addAttribute("staffs",staffs);
        return "/page/staff_info";
    }
}
