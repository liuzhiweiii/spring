package com.example.demo.mapper;

import com.example.demo.untity.Merchant;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MerchantMapper {
    List<Merchant> getAllMerchant();
    List<Merchant> searchMerchants(@Param("search") String search);
    void addMerchant(Merchant merchant); // 新增商户的方法
    Merchant getMerchantById(@Param("id") Integer id);
    void deleteMerchantById(@Param("id") Integer id);

    List<Merchant> searchMerchantsByShow(@Param("merchantShow") Integer merchantShow);
}
