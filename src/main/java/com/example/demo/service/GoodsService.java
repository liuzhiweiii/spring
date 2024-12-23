package com.example.demo.service;

import com.example.demo.untity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
@Service
public interface GoodsService {

    List<Goods> getAllGoods();

    // 新增的方法：根据ID获取用户
    Goods getGoodsById(Integer goodsid);

    // 新增的方法：根据ID删除用户
    boolean deleteGoodsById(Integer goodsid);

    // 更新商品状态
    void updateGoodsStatus(Integer id, Boolean isOnShelf, Boolean isNew, Boolean isRecommended);
//
//    Goods updateGoods(Integer goodsId, Goods goods); // 添加编辑商品的方法声明

    boolean updateGoods(Goods goods);
}

