package com.shop.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.shop.manage.mapper")
public class JavaShopManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaShopManageApplication.class, args);
    }
}
