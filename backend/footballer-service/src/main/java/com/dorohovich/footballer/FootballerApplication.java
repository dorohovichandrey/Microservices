package com.dorohovich.footballer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FootballerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballerApplication.class, args);
    }

}
