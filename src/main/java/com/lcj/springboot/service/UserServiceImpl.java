package com.lcj.springboot.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Elijah
 * @Date: 2020/2/28 17:38
 * @Description:
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public void insertUser() {
        System.out.println("添加用户");
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void find() {
        System.out.println("查询用户");
    }
}
