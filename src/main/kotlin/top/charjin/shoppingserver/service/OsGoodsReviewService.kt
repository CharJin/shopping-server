package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsGoodsReview
import top.charjin.shoppingserver.mapper.OsGoodsReviewMapper
import javax.annotation.Resource

@Service
class OsGoodsReviewService {

    @Resource
    private val osGoodsReviewMapper: OsGoodsReviewMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osGoodsReviewMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsGoodsReview): Int {
        return osGoodsReviewMapper!!.insert(record)
    }


    fun insertSelective(record: OsGoodsReview): Int {
        return osGoodsReviewMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsGoodsReview {
        return osGoodsReviewMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsGoodsReview): Int {
        return osGoodsReviewMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsGoodsReview): Int {
        return osGoodsReviewMapper!!.updateByPrimaryKey(record)
    }

}
