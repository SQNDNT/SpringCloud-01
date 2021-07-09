package com.guihx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider_8080 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8080.class,args);
    }
}
