package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.UserService;
import com.example.demo.untity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api("测试")
@RestController
public class FirstController {
    @Autowired
    private UserService userService;


    @ApiOperation("获取id")
    @GetMapping("user")
    public Result testGet(Integer id) {
        System.out.println("获取到的ID为" + id);
        return Result.ok().data("id", id);
    }


    @ApiOperation("根据id获取数据")
    @GetMapping("path/{id}")
    public Result testPath(@PathVariable Integer id) {
        System.out.println("获取到的ID为" + id);
        return Result.ok().data("id", id);
    }

    @ApiOperation("post传输数据")
    @PostMapping("login")
    public Result testForm(String name, String password) {
        System.out.println("name=" + name);
        System.out.println("password=" + password);
        Map<String, Object> data = new HashMap<>();
        data.put("name", name);
        data.put("password", password);
        return Result.ok().data(data);
    }

    @PostMapping("json")
    public Result testForm(@RequestBody User user) {
        System.out.println("name=" + user.getName());
        System.out.println("password=" + user.getPassword());
        Map<String, Object> data = new HashMap<>();
        data.put("name", user.getName());
        data.put("password", user.getPassword());
        return Result.ok().data(data);
    }

//    public void getAllUser(){
//
//    }

    @ApiOperation("获取用户列表")
    @GetMapping( "getUsers")
    public Result getAll(){
        List<User> list = userService.getAllUser();
        return Result.ok().data("users",list);
    }

    //Hello
    //test
    //xww
}
