package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.untity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service // 帮我们创建对象
public class UserServiceImpl implements UserService {
    @Autowired // spring 帮我们自动 new 一个这个对象
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository; // 添加对 userRepository 的注入

    //获取用户
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    //创建用户
    @Override
    public User createUser(User user) {
        user.setCreated(LocalDateTime.now()); // 设置创建时间
        userMapper.createUser(user); // 插入数据库
//        userRepository.save(user); // 保存到仓库
        return user; // 返回创建的用户对象
    }

    //更新用户
    @Override
    public User updateUser(User user) {
        System.out.println("Updating user with id: " + user.getId()); // 调试日志
        if (user.getId() == 0) {
            throw new RuntimeException("User ID is required");
        }
        user.setUpdated(LocalDateTime.now());
        int rowsAffected = userMapper.updateUserById(user);
        if (rowsAffected > 0) {
            return user;
        } else {
            throw new RuntimeException("User not found or update failed");
        }
    }

    public void updateLastLogin(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found")); // 找不到用户则抛出异常
        user.setLastLogin(LocalDateTime.now()); // 更新最后登录时间
        userRepository.save(user); // 保存更新
    }

    //删除用户
    @Override
    public boolean deleteUser(Integer id) {
        return userMapper.deleteUser(id) > 0;
    }
}


