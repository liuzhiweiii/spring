package com.example.demo.service.impl;

import com.example.demo.mapper.AddgoodsMapper;
import com.example.demo.service.AddgoodsService;
import com.example.demo.untity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddgoodsServiceImpl implements AddgoodsService {

    @Autowired
    private AddgoodsMapper addgoodsMapper;

    @Override
    public void addGoods(Goods goods){
        addgoodsMapper.insertGoods(goods);
    }

    @Override
    public List<Goods> getAllGoods(){
        return addgoodsMapper.getAllGoods();
    }
}