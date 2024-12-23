package com.example.demo.service;


import com.example.demo.untity.LoginUser;

public interface LoginUserService {
    boolean login(LoginUser user);
    void register(LoginUser user);
    boolean checkUserExists(String loginName);
}
