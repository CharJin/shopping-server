package top.charjin.shoppingserver.mapper

import org.apache.ibatis.annotations.Param
import top.charjin.shoppingserver.entity.OsGoods

interface OsGoodsMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsGoods): Int

    fun insertSelective(record: OsGoods): Int

    fun selectByPrimaryKey(id: Int?): OsGoods

    fun updateByPrimaryKeySelective(record: OsGoods): Int

    fun updateByPrimaryKey(record: OsGoods): Int

    fun selectGoodsByShopId(@Param("userId") userId: Int, @Param("shopId") shopId: Int): List<OsGoods>

}