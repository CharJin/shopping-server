package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsCart;

public interface OsCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsCart record);

    int insertSelective(OsCart record);

    OsCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsCart record);

    int updateByPrimaryKey(OsCart record);
}