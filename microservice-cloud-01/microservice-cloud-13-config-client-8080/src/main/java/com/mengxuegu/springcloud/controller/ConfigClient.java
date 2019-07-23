package com.mengxuegu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String content = "applicationName:"+applicationName+",port:"+port;
        System.out.println("content: "+content);
        return content;
    }
}
