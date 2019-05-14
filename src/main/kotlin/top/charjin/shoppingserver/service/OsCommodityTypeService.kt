package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCommodityType
import top.charjin.shoppingserver.mapper.OsCommodityTypeMapper
import javax.annotation.Resource

@Service
class OsCommodityTypeService {

    @Resource
    private val osCommodityTypeMapper: OsCommodityTypeMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osCommodityTypeMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsCommodityType): Int {
        return osCommodityTypeMapper!!.insert(record)
    }


    fun insertSelective(record: OsCommodityType): Int {
        return osCommodityTypeMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsCommodityType {
        return osCommodityTypeMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsCommodityType): Int {
        return osCommodityTypeMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCommodityType): Int {
        return osCommodityTypeMapper!!.updateByPrimaryKey(record)
    }

}
