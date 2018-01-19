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
package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-02 13:32
 */
public interface UserService {

     User get(Integer userId);

     User get(String userName, String password);

     User get(String userName);

     Integer update(User user);

     Integer delete(Integer userId);

     Integer delete(User user);

     Integer save(User user);

}
