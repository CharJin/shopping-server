package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCommodity
import top.charjin.shoppingserver.mapper.OsCommodityMapper
import javax.annotation.Resource

@Service
class OsCommodityService {

    @Resource
    private val osCommodityMapper: OsCommodityMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osCommodityMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsCommodity): Int {
        return osCommodityMapper!!.insert(record)
    }


    fun insertSelective(record: OsCommodity): Int {
        return osCommodityMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsCommodity {
        return osCommodityMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsCommodity): Int {
        return osCommodityMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCommodity): Int {
        return osCommodityMapper!!.updateByPrimaryKey(record)
    }

}
