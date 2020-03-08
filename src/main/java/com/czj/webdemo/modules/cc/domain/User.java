package com.czj.webdemo.modules.cc.domain;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private Integer age;

    public User(String id,String username, Integer age) {
        this.id=id;
        this.username=username;
        this.age=age;

    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

