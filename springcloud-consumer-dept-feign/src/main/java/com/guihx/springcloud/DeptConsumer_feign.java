package com.guihx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.guihx.springcloud")
//@ComponentScan(basePackages = {"com.guihx.springcloud"})
public class DeptConsumer_feign {
    public static void main(String[] args) {
            SpringApplication.run(DeptConsumer_feign.class,args);
    }
}
