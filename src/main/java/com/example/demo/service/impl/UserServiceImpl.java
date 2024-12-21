package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import com.example.demo.untity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private com.example.demo.mapper.UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
            return userMapper.getAllUser();
        }
}

