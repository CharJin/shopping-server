package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsShopType
import top.charjin.shoppingserver.mapper.OsShopTypeMapper
import javax.annotation.Resource

@Service
class OsShopTypeService {

    @Resource
    private val osShopTypeMapper: OsShopTypeMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osShopTypeMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsShopType): Int {
        return osShopTypeMapper!!.insert(record)
    }


    fun insertSelective(record: OsShopType): Int {
        return osShopTypeMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsShopType {
        return osShopTypeMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsShopType): Int {
        return osShopTypeMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsShopType): Int {
        return osShopTypeMapper!!.updateByPrimaryKey(record)
    }

}
