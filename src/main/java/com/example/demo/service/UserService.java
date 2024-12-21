package com.example.demo.service;

import com.example.demo.untity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUser();
}
