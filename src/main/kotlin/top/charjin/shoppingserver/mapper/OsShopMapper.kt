package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsShop

interface OsShopMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsShop): Int

    fun insertSelective(record: OsShop): Int

    fun selectByPrimaryKey(id: Int?): OsShop

    fun updateByPrimaryKeySelective(record: OsShop): Int

    fun updateByPrimaryKey(record: OsShop): Int

    fun selectShopByUserId(userId: Int): List<OsShop>
}