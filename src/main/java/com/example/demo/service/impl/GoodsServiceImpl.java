package com.example.demo.service.impl;

import com.example.demo.service.GoodsService;
import com.example.demo.untity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private com.example.demo.mapper.GoodsMapper goodsMapper;

    @Override
    public List<Goods> getAllGoods() {return goodsMapper.getAllGoods();}
}
