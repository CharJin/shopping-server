package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsGoodsType

interface OsGoodsTypeMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsGoodsType): Int

    fun insertSelective(record: OsGoodsType): Int

    fun selectByPrimaryKey(id: Int?): OsGoodsType

    fun updateByPrimaryKeySelective(record: OsGoodsType): Int

    fun updateByPrimaryKey(record: OsGoodsType): Int
}