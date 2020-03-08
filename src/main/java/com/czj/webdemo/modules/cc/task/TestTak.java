package com.czj.webdemo.modules.cc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTak {

    @Scheduled( cron="0 19 * * * *")
    public void test(){

        System.out.println("定时任务启动");
    }



}
