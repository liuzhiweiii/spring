package com.example.demo.controller;

import com.example.demo.service.RoleService;
import com.example.demo.untity.Role;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:9529")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @ApiOperation("获取所有角色")
    @GetMapping("/juese")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }
    @ApiOperation("增加角色")
    @PostMapping()
    public ResponseEntity<Role> insertRole(@RequestBody Role role) {
        Role savedRole = roleService.insertRole(role);
        return ResponseEntity.ok(savedRole);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Void> updateRoleStatus(@PathVariable Long id, @RequestBody Map<String, Integer> payload) {
        Integer status = payload.get("status");
        roleService.updateRoleStatus(id, status);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role role) {
        Role updatedRole = roleService.updateRole(id, role);
        if (updatedRole != null) {
            return ResponseEntity.ok(updatedRole);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @ApiOperation("分页获取角色")
    @GetMapping("/page")
    public ResponseEntity<PageInfo<Role>> getAllRolesByPage(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        PageInfo<Role> pageInfo = roleService.getAllRolesByPage(pageNum, pageSize);
        return ResponseEntity.ok(pageInfo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRole(@PathVariable Long id) {
        try {
            roleService.deleteRole(id);
            return ResponseEntity.ok("Role deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting role");
        }
    }



}
