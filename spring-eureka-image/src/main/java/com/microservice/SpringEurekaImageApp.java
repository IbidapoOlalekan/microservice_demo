package com.microservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaImageApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}