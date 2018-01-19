/*
 * Project: demo
 * 
 * File Created at 2018-01-06
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
package com.example.demo;

import org.springframework.core.ResolvableType;
import org.springframework.util.ClassUtils;

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-06 16:01
 */

interface Service<N, M> {
}

class ServiceImpl<N, M> implements Service<N, M> {
    private Class<?> entityN;
    private Class<?> entityM;

    public ServiceImpl() {
        System.out.println("this is " + this.getClass());
        //用于避过aop 获得原始的类型
        Class<?> childClass = ClassUtils.getUserClass(this.getClass());
        if (childClass.equals(this.getClass())) {
            System.out.println("一样");
        }
        ResolvableType resolvableType1 = ResolvableType.forClass(childClass);
        entityN = resolvableType1.as(ServiceImpl.class).getGeneric(0).resolve();
        entityM = resolvableType1.as(ServiceImpl.class).getGeneric(1).resolve();
        System.out.println(entityN + "  **  " + entityM);
    }
}

class A {
}

class B {
}

class ABService extends ServiceImpl<A, B> {

}

public class Test {

    public static void main(String[] args) {

        Service<A, B> abService = (Service<A, B>) new ABService();
        System.out.println("************* " + abService);
    }
}

