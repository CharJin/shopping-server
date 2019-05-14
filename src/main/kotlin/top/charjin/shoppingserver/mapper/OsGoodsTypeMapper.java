package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsGoodsType;

public interface OsGoodsTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsGoodsType record);

    int insertSelective(OsGoodsType record);

    OsGoodsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsGoodsType record);

    int updateByPrimaryKey(OsGoodsType record);
}