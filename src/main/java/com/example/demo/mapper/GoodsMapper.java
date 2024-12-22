package com.example.demo.mapper;

import com.example.demo.untity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {

    /**
     * 获取所有商品列表
     */
    List<Goods> getAllGoods();

    // 新增的方法：根据ID获取商品
    Goods getGoodsById(@Param("goodsid") Integer goodsid);

    // 新增的方法：根据ID删除商品
    int deleteGoodsById(@Param("goodsid") Integer goodsid);
}