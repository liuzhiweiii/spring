package com.example.demo.service.impl;

import com.example.demo.service.MerchantService;
import com.example.demo.untity.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private com.example.demo.mapper.MerchantMapper merchantMapper;

    @Override
    public List<Merchant> getAllMerchant() {
        return merchantMapper.getAllMerchant();
    }

    @Override
    public List<Merchant> searchMerchants(String search) {
        return merchantMapper.searchMerchants(search);
    }
    @Override
    public void addMerchant(Merchant merchant) {
        merchantMapper.addMerchant(merchant);
    }

    @Override
    public void deleteMerchantById(Integer id) {
        merchantMapper.deleteMerchantById(id);
    }

    @Override
    public List<Merchant> searchMerchantsByShow(Integer merchantShow) {
        return merchantMapper.searchMerchantsByShow(merchantShow);
    }
}
