package com.example.demo.mapper;
import com.example.demo.untity.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginUserMapper {
    String checkLogin(@Param("loginName") String loginName); // 返回密码字符串
    void registerUser(LoginUser user);
}
