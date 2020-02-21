package com.shop.manage.controller;

import com.shop.manage.MenuListPojo;
import com.shop.manage.constant.CommonConstant;
import com.shop.manage.service.MenuService;
import com.shop.manage.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class menuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/list")
    public ResultMap getMenuList(){
        List<MenuListPojo> menuList = menuService.getMenuList();
        return new ResultMap(CommonConstant.SUCCESS,"获取菜单列表成功",menuList);
    }
}
