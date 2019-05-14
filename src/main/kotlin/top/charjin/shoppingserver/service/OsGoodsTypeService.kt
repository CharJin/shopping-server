package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsGoodsType
import top.charjin.shoppingserver.mapper.OsGoodsTypeMapper
import javax.annotation.Resource

@Service
class OsGoodsTypeService {

    @Resource
    private val osGoodsTypeMapper: OsGoodsTypeMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osGoodsTypeMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsGoodsType): Int {
        return osGoodsTypeMapper!!.insert(record)
    }


    fun insertSelective(record: OsGoodsType): Int {
        return osGoodsTypeMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsGoodsType {
        return osGoodsTypeMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsGoodsType): Int {
        return osGoodsTypeMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsGoodsType): Int {
        return osGoodsTypeMapper!!.updateByPrimaryKey(record)
    }

}
