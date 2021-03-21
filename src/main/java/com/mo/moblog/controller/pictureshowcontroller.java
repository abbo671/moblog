package com.mo.moblog.controller;

import com.mo.moblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName pictureshowcontroller
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 18:13
 **/
@Controller
public class pictureshowcontroller {
    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) {
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";}
}
