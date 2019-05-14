package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCommodityReview
import top.charjin.shoppingserver.mapper.OsCommodityReviewMapper
import javax.annotation.Resource

@Service
class OsCommodityReviewService {

    @Resource
    private val osCommodityReviewMapper: OsCommodityReviewMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osCommodityReviewMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsCommodityReview): Int {
        return osCommodityReviewMapper!!.insert(record)
    }


    fun insertSelective(record: OsCommodityReview): Int {
        return osCommodityReviewMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsCommodityReview {
        return osCommodityReviewMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsCommodityReview): Int {
        return osCommodityReviewMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCommodityReview): Int {
        return osCommodityReviewMapper!!.updateByPrimaryKey(record)
    }

}
