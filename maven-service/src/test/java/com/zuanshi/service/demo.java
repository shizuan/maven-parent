package com.zuanshi.service;

import com.zuanshi.bean.User;
import com.zuanshi.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-service.xml")
public class demo {
    @Autowired
    private UserService userService;
    @Test
    public void show(){
        List<User> all = userService.findAll();
        System.out.println(all);
    }
}
