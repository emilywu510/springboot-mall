package com.emilywu.springboot_mall.service;

import com.emilywu.springboot_mall.dto.UserLoginRequest;
import com.emilywu.springboot_mall.dto.UserRegisterRequest;
import com.emilywu.springboot_mall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
