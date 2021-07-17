package com.guihx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9494 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9494.class, args);
    }
}
