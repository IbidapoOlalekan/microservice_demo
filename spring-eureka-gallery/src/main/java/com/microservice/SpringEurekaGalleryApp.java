package com.microservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaGalleryApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

@Configuration
class RestTemplateConfig{
    //create a bean for restTemplate to call services
    @Bean
    @LoadBalanced // Load Balance between services instances running at diffrent ports
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}