package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsCart

interface OsCartMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsCart): Int

    fun insertSelective(record: OsCart): Int

    fun selectByPrimaryKey(id: Int?): OsCart

    fun updateByPrimaryKeySelective(record: OsCart): Int

    fun updateByPrimaryKey(record: OsCart): Int

}