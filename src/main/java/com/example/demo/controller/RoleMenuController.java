package com.example.demo.controller;
import com.example.demo.service.RoleMenuService;
import com.example.demo.untity.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin( origins = "http://localhost:9529")
@RestController
@RequestMapping("/api/roleMenu")
public class RoleMenuController {
    @Autowired
    private RoleMenuService roleMenuService;

    @GetMapping("/{roleId}/permissions")
    public ResponseEntity<List<RoleMenu>> getPermissions(@PathVariable Long roleId) {
        List<RoleMenu> permissions = roleMenuService.findMenusByRoleId(roleId);
        return ResponseEntity.ok(permissions);
    }
    @PostMapping("/{roleId}/permissions")
    public ResponseEntity<Void> updateRolePermissions(@PathVariable long roleId, @RequestBody List<Long> menuIds) {
        roleMenuService.updateRoleMenus(roleId, menuIds);
        return ResponseEntity.ok().build();
    }
}

