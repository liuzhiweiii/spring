package com.example.demo.controller;

import com.example.demo.service.MenuService;
import com.example.demo.untity.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin( origins = "http://localhost:9529")
@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping()
    public List<Menu> getAllMenuItems() {
        return menuService.getAllMenuItems();
    }
}
