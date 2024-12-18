package com.ice_cola;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ice_cola.dao.mapper")
public class SpringBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2Application.class, args);
    }

}
