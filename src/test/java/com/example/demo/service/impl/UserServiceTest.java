package com.example.demo.service.impl;

import com.example.demo.DemoApplication;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Project: demo
 * 
 * File Created at 2018-01-02
 * 
 * Copyright 2012-2015 Greenline.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Greenline Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Greenline.com.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService testService;

    @Test
    public void get() throws Exception {
        testService.get(1);
    }

    @Test
    public void save() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 30);
        User user = new User();
        user.setAddress("aaa");
        user.setBirthday(calendar.getTime());
        user.setPassword("bbbb");
        user.setSex(1);
        user.setUserName("userName");
        user.setMobile("13675892403");
        testService.save(user);
    }

}