package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsShop;

public interface OsShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsShop record);

    int insertSelective(OsShop record);

    OsShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsShop record);

    int updateByPrimaryKey(OsShop record);
}