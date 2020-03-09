package com.czj.webdemo.test;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class ModulesTest {
    
    @Test
    public void test(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDate.atTime(localTime).format(f4));

        LocalDate parse = LocalDate.parse("2020-03-08");
        System.out.println(parse);

    }
    
}
