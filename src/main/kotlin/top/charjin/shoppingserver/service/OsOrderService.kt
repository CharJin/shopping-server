package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsOrder
import top.charjin.shoppingserver.mapper.OsOrderMapper
import javax.annotation.Resource

@Service
class OsOrderService {

    @Resource
    private val osOrderMapper: OsOrderMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osOrderMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsOrder): Int {
        return osOrderMapper!!.insert(record)
    }


    fun insertSelective(record: OsOrder): Int {
        return osOrderMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsOrder {
        return osOrderMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsOrder): Int {
        return osOrderMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsOrder): Int {
        return osOrderMapper!!.updateByPrimaryKey(record)
    }

}
