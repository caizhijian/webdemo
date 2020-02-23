package com.czj.webdemo.service;

import com.czj.webdemo.domain.User;

public interface IUserService {
    /**
     * 通过用户名查询用户信息
     * @param id
     * @return
     */
    public User selectUserByName(String id);

    /**
     * 新增人员
     * @param user
     */
    public void add(User user);

    /**
     * 删除人员
     * @param id
     */
    public int delete(String id);

    /**
     * 更新信息
     * @param user
     * @return
     */
    public int update(User user);
}
