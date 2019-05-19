package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCart
import top.charjin.shoppingserver.mapper.OsCartMapper
import javax.annotation.Resource

@Service
class OsCartService {

    @Resource
    private val osCartMapper: OsCartMapper? = null


    fun deleteByPrimaryKey(userId: Int?, goodsId: Int?): Int {
        return osCartMapper!!.deleteByPrimaryKey(userId, goodsId)
    }


    fun insert(record: OsCart): Int {
        return osCartMapper!!.insert(record)
    }


    fun insertSelective(record: OsCart): Int {
        return osCartMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(userId: Int?, goodsId: Int?): OsCart? {
        return osCartMapper!!.selectByPrimaryKey(userId, goodsId)
    }


    fun updateByPrimaryKeySelective(record: OsCart): Int {
        return osCartMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCart): Int {
        return osCartMapper!!.updateByPrimaryKey(record)
    }


}
