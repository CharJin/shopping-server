package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsSearchHistory

interface OsSearchHistoryMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsSearchHistory): Int

    fun insertSelective(record: OsSearchHistory): Int

    fun selectByPrimaryKey(id: Int?): OsSearchHistory

    fun updateByPrimaryKeySelective(record: OsSearchHistory): Int

    fun updateByPrimaryKey(record: OsSearchHistory): Int
}