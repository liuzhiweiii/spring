package com.example.demo.mapper;

import com.example.demo.untity.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MerchantMapper {
    List<Merchant> getAllMerchant();
}
