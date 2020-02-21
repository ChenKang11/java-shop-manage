package com.shop.manage;

import com.shop.manage.model.Menu;

import java.util.List;

public class MenuListPojo {

    private String menuId;
    private String menuName;
    private String path;
    private List<Menu> childrenMenu;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Menu> getChildrenMenu() {
        return childrenMenu;
    }

    public void setChildrenMenu(List<Menu> childrenMenu) {
        this.childrenMenu = childrenMenu;
    }
}
