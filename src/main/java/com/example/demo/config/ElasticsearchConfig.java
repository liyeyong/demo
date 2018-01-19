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

/**
 * @author horus
 * @version V1.0
 * @since 2018-01-01 21:07
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

    private static final Logger LOG = LoggerFactory.getLogger(ElasticsearchConfig.class);
    @Value("${spring.elasticsearch.host}")
    private String host;
    @Value("${spring.elasticsearch.port}")
    private int port;

    @Bean
    public TransportClient elasticsearchClient() {   //向spring注入es的客户端操作对象
        TransportClient transportClient = null;

        Settings settings = Settings.builder().put("cluster.name", " my-application").build();
        try {
            transportClient =  new PreBuiltTransportClient(settings).addTransportAddress(
                new TransportAddress(InetAddress.getByName(host), port));
            ;
        } catch (UnknownHostException e) {
            LOG.error("", e);
        }
        LOG.info("创建elasticsearch客户端成功");

        return transportClient;

    }
}
