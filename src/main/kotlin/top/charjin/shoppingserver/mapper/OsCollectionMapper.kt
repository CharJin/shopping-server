package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsCollection

interface OsCollectionMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsCollection): Int

    fun insertSelective(record: OsCollection): Int

    fun selectByPrimaryKey(id: Int?): OsCollection

    fun updateByPrimaryKeySelective(record: OsCollection): Int

    fun updateByPrimaryKey(record: OsCollection): Int
}