package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsCollection;

public interface OsCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsCollection record);

    int insertSelective(OsCollection record);

    OsCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsCollection record);

    int updateByPrimaryKey(OsCollection record);
}