package com.jn.sbstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan("com.jn.sbstudy.mapper")
@ServletComponentScan
public class SbstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbstudyApplication.class, args);
    }
}
