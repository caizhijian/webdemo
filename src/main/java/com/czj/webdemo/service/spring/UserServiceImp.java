package com.czj.webdemo.service.spring;

import com.czj.webdemo.dao.UserMapper;
import com.czj.webdemo.domain.User;
import com.czj.webdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImp implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByName(String id) {

        User user = userMapper.selectUserByName(id);
        System.out.println("user:"+user);
        return user;
    }

    @Override
    public void add(User user) {
        System.out.println(user);
        userMapper.add(user);
    }

    @Override
    public int delete(String id) {

        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        System.out.println("update:"+user);
        return userMapper.update(user);
    }
}
