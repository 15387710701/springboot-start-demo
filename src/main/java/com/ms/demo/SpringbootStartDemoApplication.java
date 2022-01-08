package com.ms.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ms.demo.mapper")
@SpringBootApplication
public class SpringbootStartDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStartDemoApplication.class, args);
    }

}
