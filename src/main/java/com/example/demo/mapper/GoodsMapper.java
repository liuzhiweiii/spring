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

    /**
     * 根据ID获取商品
     */
    Goods getGoodsById(@Param("goodsid") Integer goodsid);

    /**
     * 根据ID删除商品
     */
    int deleteGoodsById(@Param("goodsid") Integer goodsid);

    /**
     * 更新商品状态
     */
    void updateGoodsStatus(@Param("id") Integer id,
                           @Param("isOnShelf") Boolean isOnShelf,
                           @Param("isNew") Boolean isNew,
                           @Param("isRecommended") Boolean isRecommended);

    /**
     * 更新商品所有信息（完整编辑商品）
     */
//    void updateGoods(@Param("goods") Goods goods);
    int updateGoodsById(Goods goods);
}