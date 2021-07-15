package com.guihx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //等价于spring的applicationcontext.xml的注册bean
public class ConfigBean {

    @Bean
    @LoadBalanced //配置负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
