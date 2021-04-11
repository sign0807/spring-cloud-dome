package com.zf.dome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Application
 * </p>
 *
 * @author 钟凡
 * @since 2021-04-03 15:56:50
 * @description 由 Mybatisplus Code Generator 创建
 **/

@SpringBootApplication
@MapperScan("com.zf.dome")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
