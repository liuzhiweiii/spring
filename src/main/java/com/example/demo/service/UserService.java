package com.example.demo.service;

import com.example.demo.untity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    // 获取用户列表
    List<User> getAllUser();

    // 创建新用户
    User createUser(User user);

    // 更新用户
    User updateUser(User user);

    // 删除用户
    boolean deleteUser(Integer id);
}

