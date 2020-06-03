package com.unionpay.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.unionpay.boot.dao")
@SpringBootApplication
public class OverallscoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(OverallscoresApplication.class, args);
    }

}
