package com.example.demo.mapper;

import com.example.demo.untity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoleMenuMapper {
    void addRoleMenu(@Param("roleId") Long roleId, @Param("menuId") Long menuId);
    void deleteRoleMenus(@Param("roleId") Long roleId);
    List<RoleMenu> findMenusByRoleId(Long roleId);
}
