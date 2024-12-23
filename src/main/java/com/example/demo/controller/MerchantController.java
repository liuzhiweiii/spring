package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.MerchantService;
import com.example.demo.untity.Merchant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("商户管理")
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

    @ApiOperation("查询用户信息")
    @GetMapping("searchMerchants/{search}")
    public Result searchMerchantList(@RequestParam(required = false) String search) {
        List<Merchant> list = (search != null && !search.trim().isEmpty())
                ? merchantService.searchMerchants(search)
                : merchantService.getAllMerchant();
        return Result.ok().data("merchants", list);
    }

    @ApiOperation("新增商户")
    @PostMapping("/addMerchant")
    public Result addMerchant(@RequestBody Merchant merchant) {
        return Result.ok().message("商户新增成功");
    }

    @ApiOperation("删除商户信息")
    @DeleteMapping("/deleteMerchant/{id}")
    public ResponseEntity<Result> deleteMerchant(@PathVariable Integer id){
        merchantService.deleteMerchantById(id);
        return ResponseEntity.ok(Result.ok().message("删除成功"));
    }

    @ApiOperation("根据是否显示查询用户信息")
    @GetMapping("searchMerchantsByShow/{merchantShow}")
    public Result searchMerchantsByShow(@PathVariable(required = false) Integer merchantShow) {
        List<Merchant> list;
        if (merchantShow != null) {
            list = merchantService.searchMerchantsByShow(merchantShow);
        } else {
            list = merchantService.getAllMerchant();
        }
        return Result.ok().data("merchants", list);
    }
}
