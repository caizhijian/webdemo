package com.czj.webdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@EnableScheduling//定时任务
@MapperScan("com.czj.webdemo.dao")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
public class WebdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebdemoApplication.class, args);
    }

}
