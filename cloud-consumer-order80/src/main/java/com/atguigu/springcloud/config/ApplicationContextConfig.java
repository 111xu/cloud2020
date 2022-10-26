package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @project cloud2020
 * @create 2022 09 30 10:55
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced//提供负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
