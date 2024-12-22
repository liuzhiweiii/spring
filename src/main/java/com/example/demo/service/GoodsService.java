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
}

