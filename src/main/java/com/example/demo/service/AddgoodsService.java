package com.example.demo.service;

import com.example.demo.untity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddgoodsService {
    void addGoods(Goods goods);
    List<Goods> getAllGoods();
}