package com.wzq.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzq.ssm.model.CommunityInfo;
import com.wzq.ssm.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * 商品控制器
 */
@Controller
@RequestMapping("/comm")
public class CommunityController {
    @Autowired
    private CommunityService<CommunityInfo> communityService;


    /**
     * 分页查询查询所有商品信息
     * @param model 模型
     * @param page 起始页
     * @param size 每页多少条
     * @return
     */
    @RequestMapping("/selectCommAll")
    public String selectCommAll(@RequestParam("page") Integer page,
                                @RequestParam("size") Integer size, Model model){
        List<CommunityInfo> comms = communityService.findAll(page,size);
        PageHelper.startPage(page,size);
        PageInfo<CommunityInfo> infos = new PageInfo<CommunityInfo>(comms);


        model.addAttribute("infos",infos);
        return "/page/index";
    }

    /**
     * 添加商品
     * @param comm
     * @return
     */
    @RequestMapping("/addComm")
    public String addComm(@RequestParam("page") Integer page,
                          @RequestParam("size") Integer size, CommunityInfo comm){

        int sava = communityService.sava(comm);
        System.out.println(sava);
        //
        return "redirect:/comm/selectCommAll.do?page="+page+"&size="+size;
    }

    /**
     * 验证
     * @return
     */
    @RequestMapping("/ajax")
    public String ajax(Model model){

        model.addAttribute("ajax1","ajax1");
        return "/headel/pagelift";
    }

    @RequestMapping("/likeFind")
//    @ResponseBody
    public String likeFind(Model model){
        String str = "%力%";

        List<CommunityInfo> communityInfos = communityService.likeFind(str);

        model.addAttribute("comms",communityInfos);

        System.out.println(communityInfos);
        return "/index";
    }


    @ResponseBody
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<CommunityInfo> communityInfos = communityService.findAll();

        ModelAndView mv = new ModelAndView();
        ModelAndView comms = mv.addObject("comms", communityInfos);

        System.out.println(comms);
        mv.setViewName("/index");
        System.out.println(communityInfos);
        return mv;

    }

    /**
     * 利用map封装分组查询的数据
     * name: 查询的条件
     */

    @RequestMapping("/groupFind")
    @ResponseBody
    public ModelAndView groupFind(){
        ModelAndView mv = new ModelAndView();

        String name = "";
        Map<Object, Object> map = communityService.groupFind(name);
        System.out.println(map);

        return mv;
    }

}
