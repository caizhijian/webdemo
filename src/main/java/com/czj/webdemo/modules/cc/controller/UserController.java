package com.czj.webdemo.modules.cc.controller;


import com.czj.webdemo.modules.cc.domain.User;
import com.czj.webdemo.modules.cc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by beyondLi on 2017/6/19.
 */
//证明是controller层并且返回json
@RestController
@RequestMapping("/user")
public class UserController {
    //依赖注入

    @Autowired
    IUserService userService;

    @RequestMapping(value = "userinfo")
    public User userinfo(@RequestParam("id") String id) {
        System.out.println("id:"+id);
        
        User user = userService.selectUserByName(id);
        return user;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam("username") String username,@RequestParam("age") int age){
        String id = UUID.randomUUID().toString().replace("-", "");
        User user = new User(id,username,age);
        userService.add(user);
        return "success";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("id") String id,@RequestParam("username") String username,
                         @RequestParam(value="age",required = false ) Integer age){
        User user = new User(id,username,age);

        userService.update(user);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") String id){
        userService.delete(id);
        return "success";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("666");
        System.out.println();
        return "hello，这是服务2";
    }
}



