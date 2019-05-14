package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsGoods;

public interface OsGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsGoods record);

    int insertSelective(OsGoods record);

    OsGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsGoods record);

    int updateByPrimaryKey(OsGoods record);
}