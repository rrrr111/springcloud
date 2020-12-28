package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.client.controller"})
public class EurekaClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication2.class, args);
    }

}
