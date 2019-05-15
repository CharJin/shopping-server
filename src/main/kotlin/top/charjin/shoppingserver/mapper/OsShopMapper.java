package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsShop;

import java.util.List;

public interface OsShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsShop record);

    int insertSelective(OsShop record);

    OsShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsShop record);

    int updateByPrimaryKey(OsShop record);

    List<OsShop> selectShopByUserId(int userId);
}