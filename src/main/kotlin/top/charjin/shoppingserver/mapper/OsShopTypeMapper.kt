package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsShopType

interface OsShopTypeMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsShopType): Int

    fun insertSelective(record: OsShopType): Int

    fun selectByPrimaryKey(id: Int?): OsShopType

    fun updateByPrimaryKeySelective(record: OsShopType): Int

    fun updateByPrimaryKey(record: OsShopType): Int
}