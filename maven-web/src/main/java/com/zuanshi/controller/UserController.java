package com.zuanshi.controller;

import com.zuanshi.bean.User;
import com.zuanshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("users",list);
        return "users";
    }
}
