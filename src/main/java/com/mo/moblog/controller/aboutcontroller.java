package com.mo.moblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName aboutcontroller
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 18:15
 **/
@Controller
public class aboutcontroller {
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
