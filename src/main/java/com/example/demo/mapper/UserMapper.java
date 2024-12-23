package com.example.demo.mapper;

import com.example.demo.untity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //获取用户
    List<User> getAllUser();

    // 添加创建用户的方法
    void createUser(User user);

    // 更新用户信息
    int updateUserById(User user);

    //删除用户
    int deleteUser(@Param("id") Integer id);
}
