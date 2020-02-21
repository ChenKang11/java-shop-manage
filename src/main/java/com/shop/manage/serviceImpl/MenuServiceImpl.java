package com.shop.manage.serviceImpl;

import com.shop.manage.MenuListPojo;
import com.shop.manage.mapper.MenuMapper;
import com.shop.manage.model.Menu;
import com.shop.manage.model.MenuExample;
import com.shop.manage.service.MenuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuListPojo> getMenuList() {
        List<MenuListPojo> menuListPojos = new ArrayList<>();
        MenuExample menuExample = new MenuExample();
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        for(Menu menu : menus){
            MenuListPojo menuListPojo = new MenuListPojo();
            if(StringUtils.isBlank(menu.getParentId())){
                menuListPojo.setMenuId(menu.getMenuId());
                menuListPojo.setMenuName(menu.getMenuName());
                menuListPojo.setPath(menu.getPath());
                menuListPojos.add(menuListPojo);
            }
        }
        for(MenuListPojo menuListPojo : menuListPojos){
            List<Menu> childrenMenu = new ArrayList<>();
            for(Menu menu : menus){
                if(StringUtils.isNotBlank(menu.getParentId())){
                    if(menu.getParentId().equals(menuListPojo.getMenuId())){
                        childrenMenu.add(menu);
                    }
                }
            }
            menuListPojo.setChildrenMenu(childrenMenu);
        }
        return menuListPojos;
    }
}
