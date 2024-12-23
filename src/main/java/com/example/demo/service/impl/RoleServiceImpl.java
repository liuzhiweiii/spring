package com.example.demo.service.impl;

import com.example.demo.mapper.RoleMapper;
import com.example.demo.service.RoleService;
import com.example.demo.untity.Role;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getAllRoles() {

        return roleMapper.getAllRoles();
    }
    @Override
    public Role insertRole(Role role) {
        role.setCreated(LocalDateTime.now());
        role.setUpdated(LocalDateTime.now());
        role.setStatus(role.getStatus() != null ? role.getStatus() : 1); // 默认启用状态为1
        roleMapper.insertRole(role);//调用RoleMapper的insertRole方法将角色信息插入数据库
        return role;
    }
    @Override
    public Role updateRole(Long id, Role role) {
        Role existingRole = roleMapper.findById(id);
        if (existingRole != null) {
            existingRole.setName(role.getName());
            existingRole.setRemark(role.getRemark());
            existingRole.setStatus(role.getStatus());
            int updatedCount = roleMapper.updateRole(existingRole);
            if (updatedCount > 0) {
                existingRole.setUpdated(LocalDateTime.now()); // 更新时间
                return existingRole; // 返回更新后的角色对象
            } else {
                throw new RuntimeException("Failed to update role"); // 更新失败，抛出异常
            }
        } else {
            throw new RuntimeException("Role not found"); // 角色不存在，抛出异常
        }
    }
    @Override
    public void updateRoleStatus(Long id, Integer status) {
        roleMapper.updateRoleStatus(id, status);
    }

    @Override
    public void deleteRole(Long id) {

        roleMapper.deleteRole(id);
    }
    @Override
    public PageInfo<Role> getAllRolesByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);//使用PageHelper的startPage方法设置分页参数
        List<Role> roles = roleMapper.getAllRoles();
        return new PageInfo<>(roles);//使用PageInfo包装列表
    }
    @Override
    public Role findById(Long id) {
        return roleMapper.findById(id);
    }
}
