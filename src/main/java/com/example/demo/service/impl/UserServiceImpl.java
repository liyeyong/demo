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
package com.example.demo.service.impl;

import com.example.demo.dal.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-02 13:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User get(Integer userId) {
        User user = new User();
        user.setId(userId);
        return userDao.get(user);
    }

    @Override
    public Integer save(User user) {
        return userDao.save(user);
    }

    @Override
    public User get(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return userDao.get(user);
    }

    @Override
    public User get(String userName) {
        User user = new User();
        user.setUserName(userName);
        return userDao.get(user);
}

    @Override
    public Integer update(User user) {
        return userDao.update(user);
    }

    @Override
    public Integer delete(Integer userId) {
        return userDao.delete(userId);
    }

    @Override
    public Integer delete(User user) {
        return null;
    }
}
