package com.example.demo.controller;
import com.example.demo.common.Result;
import com.example.demo.service.MenuItemService;
import com.example.demo.untity.MenuItem;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Api(tags = "菜单")
@RestController
public class MenuItemController {
    @Autowired
    private MenuItemService menuItemService;
    @ApiOperation("获取用户列表")
    @GetMapping("getAllmenu")//查询用get
    public Result getAllUsers() {
        List<MenuItem> list = menuItemService.getAllmenu();
        return Result.ok().data("list", list);
    }
    @ApiOperation("获取一级菜单")
    @GetMapping("getMenuByOne")
    public Result getMenuByOne() {
        List<MenuItem> list = menuItemService.getMenuByOne();
        return Result.ok().data("list", list);
    }
    @ApiOperation("获取二级菜单")
    @CrossOrigin
    @GetMapping("/getMenuBySecond/{level}")
    public Result getMenuBySecond(@PathVariable Integer level) {
        List<MenuItem> list = menuItemService.getMenuBySecond(level);
        return Result.ok().data("list", list);
    }
    @ApiOperation("获取所有菜单")
    @CrossOrigin
    @GetMapping("/findAll")
    public Result findAll() {
        List<MenuItem> list = menuItemService.findAll();
        return Result.ok().data("list", list);
    }
    @ApiOperation("根据id获取菜单")
    @CrossOrigin
    @GetMapping("/findById/{id}")
    public Result findById(@PathVariable Long id) {
        MenuItem menuItem = menuItemService.findById(id);
        return Result.ok().data("menuItem", menuItem);
    }
    @ApiOperation("添加菜单")
    @CrossOrigin
    @PostMapping("/insert")
    public Result insert(MenuItem menuItem) {
        int i = menuItemService.insert(menuItem);
        return Result.ok().data("i", i);
    }
    @ApiOperation("修改菜单")
    @CrossOrigin
    @PutMapping("/updateMenu")
    public Result update(@RequestBody MenuItem menuItem) {
        int i = menuItemService.update(menuItem);
        return Result.ok().data("i", i);
    }
    @ApiOperation("删除菜单")
    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        int i = menuItemService.delete(id);
        return Result.ok().data("i", i);
    }
    @ApiOperation("分页获取角色")
    @CrossOrigin
    @GetMapping("/page")
    public ResponseEntity<PageInfo<MenuItem>> getAllByPage(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        PageInfo<MenuItem> pageInfo = menuItemService.getAllPage(pageNum, pageSize);
        return ResponseEntity.ok(pageInfo);
    }
}