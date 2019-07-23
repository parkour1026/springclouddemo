package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//主启动类
@EnableHystrix
@EnableEurekaClient
@MapperScan("com.mengxuegu.springcloud.mapper")
@SpringBootApplication
public class MicroserviceProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductProvider_8001_Hystrix.class,args);
    }
}
