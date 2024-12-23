package com.example.demo.service;

import com.example.demo.untity.RoleMenu;

import java.util.List;

public interface RoleMenuService {
    List<RoleMenu> findMenusByRoleId(Long roleId);
    void updateRoleMenus(Long roleId, List<Long> menuIds);
}
