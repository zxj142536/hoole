package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  HollwordApplication {

    private static  final Logger LOG = LoggerFactory.getLogger(HollwordApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HollwordApplication.class, args);
        LOG.info("启动成功");
    }

}
