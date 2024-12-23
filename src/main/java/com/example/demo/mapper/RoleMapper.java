package com.example.demo.mapper;

import com.example.demo.untity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface RoleMapper {
    List<Role> getAllRoles();
    int insertRole(Role role);
    int updateRoleStatus(@Param("id") Long id, @Param("status") Integer status);
    int updateRole(Role role);
    Role findById(Long id);
    void deleteRole(Long id);


}
