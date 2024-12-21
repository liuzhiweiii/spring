package com.example.demo.service;

import com.example.demo.untity.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MerchantService {
    List<Merchant> getAllMerchant();
}
