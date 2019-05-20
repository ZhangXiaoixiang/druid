package com.demo.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
        System.out.println("注意你配置的端口号");
        System.out.println("http://localhost:8080/druid/login.html");
        System.out.println("http://localhost:8080/druid/index.html");

    }

}
