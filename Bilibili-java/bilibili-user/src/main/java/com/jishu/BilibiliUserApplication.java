package com.jishu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jishu.mapper")
public class BilibiliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilibiliUserApplication.class, args);
    }

}
