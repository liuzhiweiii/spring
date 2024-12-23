package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.GoodsService;
import com.example.demo.untity.Goods;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class GoodsController {

    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @ApiOperation("获取商品列表信息")
    @GetMapping("/getGoods")
    public Result getGoods() {
        List<Goods> list = goodsService.getAllGoods();
        return Result.ok().data("goods", list);
    }

    @ApiOperation("根据ID查询商品")
    @GetMapping("/{goodsid}")
    public Result getGoodsById(@PathVariable Integer id) {
        Goods goods = goodsService.getGoodsById(id);
        if (goods == null) {
            return Result.error("商品不存在");
        }
        return Result.ok().data("goods", goods);
    }

    @ApiOperation("根据ID删除商品")
    @DeleteMapping("/goods/{goodsid}")
    public Result deleteGoodsById(@PathVariable Integer goodsid) {
        boolean success = goodsService.deleteGoodsById(goodsid);
        if (!success) {
            return Result.error("删除失败，可能该商品不存在");
        }
        return Result.ok().message("删除成功");
    }

    @ApiOperation("更新商品状态")
    @PutMapping("/goods/{goodsid}/status")
    public Result updateGoodsStatus(@PathVariable Integer goodsid,
                                    @RequestBody Map<String, Boolean> statusUpdates) {
        try {
            System.out.println("Updating goods ID: " + goodsid);
            System.out.println("Status updates: " + statusUpdates);

            Boolean isOnShelf = statusUpdates.get("isOnShelf");
            Boolean isNew = statusUpdates.get("isNew");
            Boolean isRecommended = statusUpdates.get("isRecommended");

            goodsService.updateGoodsStatus(goodsid, isOnShelf, isNew, isRecommended);
            return Result.ok().message("状态更新成功");
        } catch (Exception e) {
            // 记录异常日志
            e.printStackTrace();
            return Result.error("更新失败: " + e.getMessage());
        }
    }

    @ApiOperation("更新商品")
    @PutMapping("/update/{goodsid}")
    public Result updateGoods(@PathVariable("goodsid") Integer goodsid,Goods goods) {
        goods.setGoodsid(goodsid); // 设置商品ID，确保更新的是对应商品
        boolean success = goodsService.updateGoods(goods);
        if (success) {
            return Result.ok().message("商品更新成功");
        } else {
            return Result.error("商品更新失败");
        }
    }
}
