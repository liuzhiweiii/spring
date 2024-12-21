package com.example.demo.mapper;

import com.example.demo.untity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> getAllGoods();
}
