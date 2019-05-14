package top.charjin.shoppingserver.mapper

import top.charjin.shoppingserver.entity.OsGoodsReview

interface OsGoodsReviewMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsGoodsReview): Int

    fun insertSelective(record: OsGoodsReview): Int

    fun selectByPrimaryKey(id: Int?): OsGoodsReview

    fun updateByPrimaryKeySelective(record: OsGoodsReview): Int

    fun updateByPrimaryKey(record: OsGoodsReview): Int
}