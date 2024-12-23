package com.example.demo.service;

import com.example.demo.untity.Role;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role insertRole(Role role);
    void updateRoleStatus(Long id, Integer status);
    Role updateRole(Long id, Role role);
    Role findById(Long id);
    void deleteRole(Long id);
    PageInfo<Role> getAllRolesByPage(int pageNum, int pageSize);
}
