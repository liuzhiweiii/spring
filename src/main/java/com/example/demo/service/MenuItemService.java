package com.example.demo.service;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.untity.MenuItem;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface MenuItemService {

    List<MenuItem> getAllmenu();
    List<MenuItem> getMenuByOne();
    List<MenuItem> getMenuBySecond(Integer level);

    List<MenuItem> findAll();
    MenuItem findById(Long id);
    int insert(MenuItem menuItem);
    int update(MenuItem menuItem);
    int delete(Long id);
    PageInfo<MenuItem> getAllPage(int pageNum, int pageSize);
}
