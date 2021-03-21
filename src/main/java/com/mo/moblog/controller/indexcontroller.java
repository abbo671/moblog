package com.mo.moblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName indexcontroller
 * @Description TODO
 * @Author mo
 * @Date 2021/3/14 18:06
 **/
@Controller
public class indexcontroller {

    /**
    * @Description:
    * @Param: []
    * @return: java.lang.String
    * @Author: mo
    * @Date: 2021/3/14
    * @Time: 18:48
    */
    @GetMapping("/f")
    public String index(){


        return "friends";
    }
}
