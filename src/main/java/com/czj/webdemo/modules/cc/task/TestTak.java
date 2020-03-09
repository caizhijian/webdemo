package com.czj.webdemo.modules.cc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class TestTak {

    @Scheduled( cron="0 19 * * * *")
    public void test(){

        System.out.println("19分定时任务启动");
    }

    /**
     * 固定期限运行，单位毫秒
     */
    @Scheduled( fixedDelay=600000)
    public void timing (){
        System.out.println(new Date());
        System.out.println("10分钟启动一次");
    }



}
