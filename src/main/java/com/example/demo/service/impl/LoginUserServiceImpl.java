package com.example.demo.service.impl;

import com.example.demo.mapper.LoginUserMapper;
import com.example.demo.service.LoginUserService;
import com.example.demo.untity.LoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements LoginUserService {
    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public boolean login(LoginUser user) {
        String storedPassword = loginUserMapper.checkLogin(user.getLoginName());
        return storedPassword != null && storedPassword.equals(user.getLoginPsw());
    }

    @Override
    public void register(LoginUser user) {
        loginUserMapper.registerUser(user);
    }

    @Override
    public boolean checkUserExists(String loginName) {
        return loginUserMapper.checkLogin(loginName) != null;
    }
}
