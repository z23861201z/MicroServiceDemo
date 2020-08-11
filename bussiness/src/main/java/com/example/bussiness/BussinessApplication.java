package com.example.bussiness;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class BussinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(BussinessApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hellow"+port;
    }
}
