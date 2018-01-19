/*
 * Project: demo
 * 
 * File Created at 2018-01-01
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
package com.example.demo.config;

import java.io.Serializable;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-01 21:19
 */
public class User implements Serializable{
    private String email;

    public User(String email, String aa, String aa123456, String aa1, String s1) {
        this.email = email;
    }
}
