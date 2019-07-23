package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//主启动类
@EnableEurekaClient
@MapperScan("com.mengxuegu.springcloud.mapper")
@SpringBootApplication
public class MicroserviceProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductProvider_8002.class,args);
    }
}
