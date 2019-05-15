package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsSearchHistory;

public interface OsSearchHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsSearchHistory record);

    int insertSelective(OsSearchHistory record);

    OsSearchHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsSearchHistory record);

    int updateByPrimaryKey(OsSearchHistory record);
}