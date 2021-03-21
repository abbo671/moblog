package com.mo.moblog.controller;

import com.mo.moblog.service.BlogService;
import com.mo.moblog.vo.QueryBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ClassName timelinecontroller
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 11:38
 **/
@Controller
public class timelinecontroller {
    @Autowired
    private BlogService blogService;

    @GetMapping("/timeline")
    public String archive(Model model){
        List<QueryBlog> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "/timeline";
    }
}
