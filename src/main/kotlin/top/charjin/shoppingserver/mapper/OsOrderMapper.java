package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsOrder;

public interface OsOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsOrder record);

    int insertSelective(OsOrder record);

    OsOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsOrder record);

    int updateByPrimaryKey(OsOrder record);
}