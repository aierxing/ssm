package com.lei.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ssm
 *
 * @author: leiwe
 * @date 2020-08-16 8:23
 */
@SpringBootApplication
@MapperScan("com.lei.ssm.mapper")
public class SsmApp {
    public static void main(String[] args) {
        SpringApplication.run(SsmApp.class,args);
    }
}
