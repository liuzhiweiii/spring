package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.MerchantService;
import com.example.demo.untity.Merchant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("测试")
@RestController
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @ApiOperation("获取商户信息")
    @GetMapping("getMerchants")
    public Result getMerchant(){
        List<Merchant> list = merchantService.getAllMerchant();
        return Result.ok().data("merchants",list);
    }

//    @ApiOperation("获取添加商户")
//    @PostMapping("/addMerchant")
//    public ResponseEntity<String> addMerchant(@RequestBody Merchant merchant) {
//        // 保存商户信息
//        merchantService.saveMerchant(merchant);
//        return ResponseEntity.ok("商户信息保存成功！");
//    }

}
