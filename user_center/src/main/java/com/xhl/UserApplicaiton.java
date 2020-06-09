package com.xhl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicaiton.class,args);
    }
}
