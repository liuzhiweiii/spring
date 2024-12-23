package com.example.demo.service;

import com.example.demo.untity.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MerchantService {
    List<Merchant> getAllMerchant();
    List<Merchant> searchMerchants(String search);
    void addMerchant(Merchant merchant);
    Merchant getMerchantById(Integer id);
    void updateMerchant(Merchant merchant);
    void deleteMerchantById(Integer id);

    List<Merchant> searchMerchantsByShow(Integer merchantShow);
}
