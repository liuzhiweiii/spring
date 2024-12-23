package com.example.demo.service.impl;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.GoodsService;
import com.example.demo.untity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getAllGoods() {
        return goodsMapper.getAllGoods();
    }

    @Override
    public Goods getGoodsById(Integer goodsid) {
        return goodsMapper.getGoodsById(goodsid);
    }

    @Override
    public boolean deleteGoodsById(Integer goodsid) {
        return goodsMapper.deleteGoodsById(goodsid) > 0;
    }

    @Override
    public void updateGoodsStatus(Integer id, Boolean isOnShelf, Boolean isNew, Boolean isRecommended) {
        goodsMapper.updateGoodsStatus(id, isOnShelf, isNew, isRecommended);
    }
}