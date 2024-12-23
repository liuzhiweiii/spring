package com.example.demo.untity;

import java.util.List;

public class Menu {
    private Long id;
    private String menuName;
    private String menuLevel;
    private String frontendName;
    private Integer displayOrder;
    private Integer level;
    private List<Menu> children;
    public List<Menu> getChildren() {
        return children;
    }
    private Long parentId; // 父菜单项的 ID

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
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
    public void setFrontendName(String frontendName) {
        this.frontendName = frontendName;
    }
    public Integer getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Menu(int id , String menuName, String menuLevel, String frontendName, Integer displayOrder, Integer level) {
        this.id = Long.valueOf(id);
        this.menuName = menuName;
        this.menuLevel = menuLevel;
        this.frontendName = frontendName;
        this.displayOrder = displayOrder;
        this.level = level;
        this.children = null;
        this.parentId = null;


    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", menuLevel='" + menuLevel + '\'' +
                ", frontendName='" + frontendName + '\'' +
                ", displayOrder=" + displayOrder +
                ", level=" + level +
                ", children=" + children +
                ", parentId=" + parentId +
                '}';
    }
}
