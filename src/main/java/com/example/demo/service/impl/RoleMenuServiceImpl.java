package com.example.demo.service.impl;
import com.example.demo.mapper.RoleMenuMapper;
import com.example.demo.service.RoleMenuService;
import com.example.demo.untity.RoleMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Override
    public List<RoleMenu> findMenusByRoleId(Long roleId) {
        return roleMenuMapper.findMenusByRoleId(roleId);
    }
    @Override
    public void updateRoleMenus(Long roleId, List<Long> menuIds) {
        // 删除旧的权限关联
        roleMenuMapper.deleteRoleMenus(roleId);
        // 添加新的权限关联
        menuIds.forEach(menuId -> roleMenuMapper.addRoleMenu(roleId, menuId));
    }

}
