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
}
