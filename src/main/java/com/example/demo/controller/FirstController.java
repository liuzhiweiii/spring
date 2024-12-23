package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.common.ResultCodeEnum;
import com.example.demo.service.UserService;
import com.example.demo.untity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api("测试")
@CrossOrigin
@RestController
public class FirstController {
    @Autowired
    private UserService userService;

    // 获取用户信息
    @ApiOperation("获取用户列表")
    @GetMapping("getUsers")
    public Result getAll(){
        List<User> list = userService.getAllUser();
        return Result.ok().data("user",list);
    }

    //删除用户信息
    @ApiOperation("根据ID删除用户")
    @DeleteMapping("deleteUsers/{id}")
    public Result deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return Result.ok().message("删除成功");
    }

    // 创建新用户的POST请求
    @ApiOperation("创建新用户")
    @PostMapping("/addUsers")
    public Result createUser(User user) {
        try {
            System.out.println("创建用户============：" + user);
            User createdUser = userService.createUser(user);
            return Result.setResult(ResultCodeEnum.SUCCESS)
                    .message("用户创建成功")
                    .data("user", createdUser);
        } catch (Exception e) {
            // 捕获异常并返回错误信息
            return Result.setError(ResultCodeEnum.INTERNAL_ERROR)
                    .message("用户创建失败: " + e.getMessage());
        }
    }

    // 更新用户信息
    @PostMapping("/updateUsers")
    public Result updateUser(User user) {
        if (user.getId() == 0) {
            return Result.setError(ResultCodeEnum.INTERNAL_ERROR).message("User ID is required");
        }
        try {
            User updatedUser = userService.updateUser(user);
            return Result.ok().data("user", updatedUser);
        } catch (RuntimeException e) {
            return Result.setError(ResultCodeEnum.INTERNAL_ERROR).message(e.getMessage());
        }
    }
}
