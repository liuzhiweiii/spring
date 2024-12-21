package com.example.demo.service;

import com.example.demo.untity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GoodsService {
    List<Goods> getAllGoods();
}

