package com.zuanshi.dao;

import com.zuanshi.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mybatis-spring.xml")
public class demo {
    @Autowired
    private UserDao userDao;

    @Test
    public void show(){
        List<User> l = userDao.findAll();
        System.out.println(l);
    }
}
