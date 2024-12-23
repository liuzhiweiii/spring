package com.example.demo.untity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "菜单项实体类", description = "菜单项实体类")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuItem {
    @ApiModelProperty(value = "编号", example = "1")
    private int id;

    @ApiModelProperty(value = "菜单名称", example = "商品")
    private String menuName;

    @ApiModelProperty(value = "菜单级数", example = "一级")
    private String menuLevel;

    @ApiModelProperty(value = "前端名称", example = "pms")
    private String frontendName;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "显示顺序", example = "0")
    private int displayOrder;
    @ApiModelProperty
    private int isVisible;

    @ApiModelProperty(value = "显示顺序", example = "0")
    private int level;


    // 构造函数
    public MenuItem() {
    }


    // 带参数的构造函数
    public MenuItem(int id, String menuName, String menuLevel, String frontendName,String icon,int isVisible,int displayOrder) {
        this.id = id;
        this.menuName = menuName;
        this.menuLevel = menuLevel;
        this.frontendName = frontendName;
        this.icon = icon;
        this.isVisible = isVisible;
        this.displayOrder = displayOrder;
    }

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getFrontendName() {
        return frontendName;
    }
    public void setIcon(String icon) {
         this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }

    public void setFrontendName(String frontendName) {
        this.frontendName = frontendName;
    }
    public int getIsVisible() {
        return isVisible;
    }
    public void setIsVisible(int isVisible) {
        this.isVisible = isVisible;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", menuLevel='" + menuLevel + '\'' +
                ", frontendName='" + frontendName + '\'' +
                ", icon='" + icon + '\'' +
                ", isVisible=" + isVisible +
                ", displayOrder=" + displayOrder +
                ", level=" + level +
                '}';
    }
}