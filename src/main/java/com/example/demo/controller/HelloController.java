//package com.example.demo.controller;
//
//import com.example.demo.untity.User;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("json")
//public class HelloController {
//    @GetMapping("hello")
//    public String hello(){
//        return("hello");
//    }
//
//    @GetMapping("user")
////    public Result getUser(){
////    return Result.ok().data("user".new User(99,"liu","123456"));
////    }
//    public User getUser(){
//        return new User(99,"liu","123456");
//    }
//
//    @GetMapping("List")
//    public List<User> getUserList(){
//        User user = new User(1,"张三","123456");
//        ArrayList<User> objects = new ArrayList<>();
//        objects.add(user);
//        return objects;
//    }
//
//    @GetMapping("map")
//    public Map<String,Object> getMap(){
//        HashMap<String,Object> map = new HashMap<>();
//        User user = new User(1,"zhangsan","123456");
//        map.put("user",user);
//        return map;
//    }
//
//
//}
