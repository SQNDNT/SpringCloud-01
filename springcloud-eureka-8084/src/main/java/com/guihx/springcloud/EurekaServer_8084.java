package com.guihx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_8084 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_8084.class, args);
    }
}
