package com.czj.webdemo.dao;

import com.czj.webdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    User selectUserByName(String id);

    void add(User user);

    int delete(String id);

    int update(User user);
}

