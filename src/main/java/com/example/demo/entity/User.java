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
package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-02 16:50
 */
public class User implements Serializable{

    private static final long serialVersionUID = -908432751053765979L;

    private Integer id;

    private String userName;

    private String password;

    private String mobile;

    private String address;

    private Date birthday;

    private Integer sex;

    private Date createdTime;

    private Date updatedTime;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", password='" + password + '\'' + ", mobile='"
            + mobile + '\'' + ", address='" + address + '\'' + ", birthday=" + birthday + ", sex=" + sex
            + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + '}';
    }
}
