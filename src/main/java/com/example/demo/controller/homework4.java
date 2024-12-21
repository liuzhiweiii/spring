//package com.example.demo.controller;
//
//import com.example.demo.common.Result;
//import com.example.demo.untity.User;
//import org.springframework.web.bind.annotation.*;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class homework4 {
//
//    // GET请求，使用?形式传递一个参数
//    // http://localhost:8080/user?id=5
//    @GetMapping("user")
//    public Result testGetOneParam(Integer id) {
//        System.out.println("获取到的ID为" + id);
//        return Result.ok().data("id", id);
//    }
//
//    // GET请求，使用?形式传递两个参数
//    // http://localhost:8080/user/details?id=1&name=刘
//    @GetMapping("user/details")
//    public Result testGetTwoParams(Integer id,String name) {
//        System.out.println("获取到的ID为" + id + ", 名称为" + name);
//        Map<String, Object> data = new HashMap<>();
//        data.put("id", id);
//        data.put("name", name);
//        return Result.ok().data(data);
//    }
//
//    // GET请求，使用/形式传递一个参数（路径变量）
//    // http://localhost:8080/path/2
//    @GetMapping("path/{id}")
//    public Result testPathOneParam(@PathVariable Integer id) {
//        System.out.println("获取到的ID为" + id);
//        return Result.ok().data("id", id);
//    }
//
//    // GET请求，使用/形式传递两个参数（路径变量）
//    // http://localhost:8080/path/123/刘
//    @GetMapping("path/{id}/{name}")
//    public Result testPathTwoParams(@PathVariable Integer id, @PathVariable String name) {
//        System.out.println("获取到的ID为" + id + ", 名称为" + name);
//        Map<String, Object> data = new HashMap<>();
//        data.put("id", id);
//        data.put("name", name);
//        return Result.ok().data(data);
//    }
//
//    // POST请求，使用form表单提交方式传递参数
//    @PostMapping("login/form")
//    public Result testForm(String name,String password) {
//        System.out.println("name=" + name);
//        System.out.println("password=" + password);
//        Map<String, Object> data = new HashMap<>();
//        data.put("name", name);
//        data.put("password", password);
//        return Result.ok().data(data);
//    }
//
//
//    // POST请求，使用JSON形式传递参数
//    // http://localhost:8080/login/json
//    //    {
//    //        "name": "刘",
//    //            "password": "123456"
//    //    }
//    @PostMapping("login/json")
//    public Result testJson(@RequestBody User user) {
//        System.out.println("name=" + user.getName());
//        System.out.println("password=" + user.getPassword());
//        Map<String, Object> data = new HashMap<>();
//        data.put("name", user.getName());
//        data.put("password", user.getPassword());
//        return Result.ok().data(data);
//    }
//}
//
//
////    @RestController: 这是一个Spring MVC的注解，用于定义一个控制器类。它告诉Spring这个类是一个控制器，并且其中的每个方法返回的数据都会直接转换为HTTP响应体，而不是视图名。
////    @PathVariable Integer id: 这个注解用于将路径变量{id}绑定到方法的参数id上，将路径变量绑定到方法的参数上。
////    @GetMapping/PostMapping：这是一个组合注解，用于处理HTTP GET请求。它映射HTTP GET请求到/user路径到这个方法。
////    @RequestBody User user: 这个注解告诉Spring将HTTP请求体（通常是一个JSON字符串）自动反序列化为User类型的对象。