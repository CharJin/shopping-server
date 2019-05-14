package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsGoods
import top.charjin.shoppingserver.mapper.OsGoodsMapper
import javax.annotation.Resource

@Service
class OsGoodsService {

    @Resource
    private val osGoodsMapper: OsGoodsMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osGoodsMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsGoods): Int {
        return osGoodsMapper!!.insert(record)
    }


    fun insertSelective(record: OsGoods): Int {
        return osGoodsMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsGoods {
        return osGoodsMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsGoods): Int {
        return osGoodsMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsGoods): Int {
        return osGoodsMapper!!.updateByPrimaryKey(record)
    }

}
