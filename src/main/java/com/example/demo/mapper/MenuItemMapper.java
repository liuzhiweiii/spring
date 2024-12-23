package com.example.demo.mapper;
import com.example.demo.untity.MenuItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MenuItemMapper {
//查询用户list
    List<MenuItem> getAllmenu();
    List<MenuItem> getMenuByOne();
    List<MenuItem> getMenuBySecond(Integer level);
    List<MenuItem> findAll();

    MenuItem findById(Long id);

    int insert(MenuItem menuItem);

    int update(MenuItem menuItem);

    int delete(Long id);
}
