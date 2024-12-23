package com.example.demo.service.impl;


import com.example.demo.mapper.MenuItemMapper;
import com.example.demo.service.MenuItemService;
import com.example.demo.untity.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

import java.util.List;
@Service
public class MenuItemServiceimpl implements MenuItemService {
    @Autowired
    private MenuItemMapper menuItemMapper;
    @Override
    public List<MenuItem> getAllmenu() {
        return menuItemMapper.getAllmenu();
    }

    @Override
    public List<MenuItem> getMenuByOne() {
        return menuItemMapper.getMenuByOne();
    }
    @Override
    public List<MenuItem> getMenuBySecond(Integer level) {
        return menuItemMapper.getMenuBySecond(level);
    }

    @Override
    public List<MenuItem> findAll() {
        return menuItemMapper.findAll();
    }

    @Override
    public MenuItem findById(Long id) {
        return menuItemMapper.findById(id);
    }

    @Override
    public int insert(MenuItem menuItem) {
        return menuItemMapper.insert(menuItem);
    }

    @Override
    public int update(MenuItem menuItem) {
        return menuItemMapper.update(menuItem);
    }

    @Override
    public int delete(Long id) {
        return menuItemMapper.delete(id);
    }

    @Override
    public PageInfo<MenuItem> getAllPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<MenuItem> roles = menuItemMapper.getAllmenu();
        return new PageInfo<>(roles);
    }
}