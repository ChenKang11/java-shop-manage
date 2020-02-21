package com.shop.manage.mapper;

import com.shop.manage.model.Menu;
import com.shop.manage.model.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleWithRowbounds(MenuExample example, RowBounds rowBounds);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}