package com.wzq.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件上传
 */
@RequestMapping("/upload")
@Controller
public class UploadController {

    /**
     * 单文件上传
     * @return
     */
    public String upload(){
        return "";
    }

    /**
     * 多文件上传
     * @return
     */
    public String uploads(){
        return "";
    }
}
