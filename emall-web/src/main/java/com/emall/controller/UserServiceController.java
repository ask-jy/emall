package com.emall.controller;

import com.emall.service.UserService;
import com.emall.service.iml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServiceController {

        @Autowired
        UserService userService;

        @RequestMapping("/user/{username}")
        public String getUsrByUsername(@PathVariable("username") String username,Model model){
            model.addAttribute("msg",userService.getUserByUsername(username).toString());
            return "hello";
        }

        @RequestMapping("/hello")
        public String hello(Model model){

            model.addAttribute("msg","hello");
            return "hello";
        }
}
