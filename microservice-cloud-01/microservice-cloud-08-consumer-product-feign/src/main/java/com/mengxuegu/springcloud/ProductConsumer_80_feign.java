package com.mengxuegu.springcloud;

import com.mengxuegu.springcloud.service.ProductClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackageClasses = ProductClientService.class)
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80_feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_feign.class,args);
    }
}
