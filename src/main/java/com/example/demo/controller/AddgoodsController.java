package com.example.demo.controller;//package com.example.demo.controller;
//
import com.example.demo.common.Result;
import com.example.demo.service.AddgoodsService;
import com.example.demo.untity.Goods;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//
//
//@RequestMapping("")
//@RestController
//public class AddgoodsController {
//
//    @Autowired
//    private AddgoodsService addgoodsService;
//
//    @ApiOperation("新增商品")
//    @PostMapping("/addGoods")
//    public Result addGoods(@RequestBody Goods addGoods) {
//            System.out.println("接收到的商品数据: " + addGoods.toString());
//            addgoodsService.addGoods(addGoods);
//            return Result.ok().message("商品添加成功");
//    }
//}
//package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/goods") // 定义基础路径
public class AddgoodsController {

    @Autowired
    private AddgoodsService addgoodsService;

    @ApiOperation("新增商品")
    @PostMapping("/add/addGoods") // 只定义具体接口路径
    public Result addGoods(Goods addGoods) {
        System.out.println("接收到的商品数据: " + addGoods.toString());
        addgoodsService.addGoods(addGoods);
        return Result.ok().message("商品添加成功");
    }


//    @ApiOperation("新增商品")
//    @PostMapping("/add")
//    public Result addGoods(@RequestBody CreateGoodsForm form) {
//        System.out.println("123");
//        System.out.println("接收到的商品数据: " + form);
//        return Result.ok().message("商品添加成功");
//    }

}