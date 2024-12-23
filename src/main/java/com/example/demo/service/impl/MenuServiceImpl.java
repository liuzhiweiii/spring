package com.example.demo.service.impl;

import com.example.demo.mapper.MenuMapper;
import com.example.demo.service.MenuService;
import com.example.demo.untity.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> getAllMenuItems() {
        List<Menu> allMenus = menuMapper.getAllMenuItems();//调用Mapper层的方法，从数据库中检索所有菜单项。
        return buildMenuTree(allMenus);//将检索到的平面菜单列表转换成树形结构。
    }
    private List<Menu> buildMenuTree(List<Menu> menus) {
        Map<Long, Menu> menuMap = new HashMap<>();//一个HashMap，用于存储菜单项，以菜单ID为键。
        menus.forEach(menu -> menuMap.put(menu.getId(), menu));

        List<Menu> topLevelMenus = new ArrayList<>();
        for (Menu menu : menus) {//遍历菜单列表，对于每个菜单项，检查其父ID
            if (menuMap.containsKey(menu.getId())) { // 确保菜单项存在于 map 中
                if (menu.getParentId() == null || menu.getParentId().equals(0L)) { // 假设parentId为null或0表示顶级菜单
                    topLevelMenus.add(menu);
                } else {
                    Menu parent = menuMap.get(menu.getParentId());
                    if (parent != null) {
                        parent.getChildren().add(menu);
                    }
                }
            }
        }
        return topLevelMenus;
    }
}
