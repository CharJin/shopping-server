package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsShop
import top.charjin.shoppingserver.mapper.OsShopMapper
import javax.annotation.Resource

@Service
class OsShopService {

    @Resource
    private val osShopMapper: OsShopMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osShopMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsShop): Int {
        return osShopMapper!!.insert(record)
    }


    fun insertSelective(record: OsShop): Int {
        return osShopMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsShop {
        return osShopMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsShop): Int {
        return osShopMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsShop): Int {
        return osShopMapper!!.updateByPrimaryKey(record)
    }

}
