package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsShopType;

public interface OsShopTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsShopType record);

    int insertSelective(OsShopType record);

    OsShopType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsShopType record);

    int updateByPrimaryKey(OsShopType record);
}