package com.mo.moblog.controller.admin;

import com.mo.moblog.pojo.User;
import com.mo.moblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @ClassName logincontroller
 * @Description TODO
 * @Author mo
 * @Date 2021/3/15 21:32
 **/
@Controller
@RequestMapping("/admin")
public class logincontroller {

    @Autowired
    private UserService userservice;
    @GetMapping("")
    public String tologin(){

        return "admin/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession httpSession, RedirectAttributes redirectAttributes){

        User user = userservice.checkuser(username, password);
        System.out.printf(""+username);
        if (user!=null){
            System.out.printf(""+user.getUsername());
            user.setPassword(null);
            httpSession.setAttribute("user", user);
            return "/admin/index";
        }else {
            System.out.printf(""+password);
            redirectAttributes.addFlashAttribute("message", "wrong username or password");
            return "redirect:/admin/";
        }

    }
    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.removeAttribute("user");
        return "redirect:/admin";

    }

}
