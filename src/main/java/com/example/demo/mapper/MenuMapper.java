package com.example.demo.mapper;

import com.example.demo.untity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenuItems();

}
