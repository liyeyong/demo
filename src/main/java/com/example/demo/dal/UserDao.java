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
package com.example.demo.dal;

import com.example.demo.entity.User;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-02 16:49
 */
public interface UserDao {

    @Cacheable(cacheNames="userDao",key="'' + #user.getId()")
    User get(User user);

    Integer save(User user);

    @CachePut(cacheNames = "userDao",key = "#user.id")
    Integer update(User user);

    @CacheEvict(cacheNames="userDao",key = "#userId")
    Integer delete(Integer  userId);
}
