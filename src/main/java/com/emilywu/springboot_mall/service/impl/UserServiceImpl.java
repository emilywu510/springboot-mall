package com.emilywu.springboot_mall.service.impl;

import com.emilywu.springboot_mall.dao.UserDao;
import com.emilywu.springboot_mall.dto.UserRegisterRequest;
import com.emilywu.springboot_mall.model.User;
import com.emilywu.springboot_mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {

        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {

        return userDao.createUser(userRegisterRequest);
    }
}
