package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCart
import top.charjin.shoppingserver.mapper.OsCartMapper
import javax.annotation.Resource

@Service
class OsCartService {

    @Resource
    private lateinit var osCartMapper: OsCartMapper


    fun deleteByPrimaryKey(userId: Int?, goodsId: Int?): Int {
        return osCartMapper.deleteByPrimaryKey(userId, goodsId)
    }


    fun insert(record: OsCart): Int {
        return osCartMapper.insert(record)
    }


    fun insertSelective(record: OsCart): Int {
        return osCartMapper.insertSelective(record)
    }


    fun selectByPrimaryKey(userId: Int?, goodsId: Int?): OsCart? {
        return osCartMapper.selectByPrimaryKey(userId, goodsId)
    }


    fun updateByPrimaryKeySelective(record: OsCart): Int {
        return osCartMapper.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCart): Int {
        return osCartMapper.updateByPrimaryKey(record)
    }

    fun updateGoodsNum(userId: Int, goodsId: Int, number: Int): Int {
        return osCartMapper.updateGoodsNum(userId, goodsId, number)
    }

    fun removeGoodsByUserId(userId: Int, goodsList: List<Int>) = osCartMapper.removeGoodsByUserId(userId, goodsList)
}
