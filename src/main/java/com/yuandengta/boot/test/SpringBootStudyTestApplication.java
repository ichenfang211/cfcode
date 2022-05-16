package com.yuandengta.boot.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 主启动类
 */
// 扫描 Mapper 接口说
@MapperScan("com.yuandengta.boot.test.mapper")
@SpringBootApplication
public class SpringBootStudyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyTestApplication.class, args);
    }

}
