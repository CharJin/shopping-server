package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsOrder

interface OsOrderMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsOrder): Int

    fun insertSelective(record: OsOrder): Int

    fun selectByPrimaryKey(id: Int?): OsOrder

    fun updateByPrimaryKeySelective(record: OsOrder): Int

    fun updateByPrimaryKey(record: OsOrder): Int
}