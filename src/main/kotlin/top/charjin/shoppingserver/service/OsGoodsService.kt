package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsGoods
import top.charjin.shoppingserver.mapper.OsGoodsMapper
import top.charjin.shoppingserver.model.OsGoodsModel
import javax.annotation.Resource

@Service
class OsGoodsService {

    @Resource
    private lateinit var osGoodsMapper: OsGoodsMapper


    fun deleteByPrimaryKey(id: Int?): Int {
        return osGoodsMapper.deleteByPrimaryKey(id)
    }


    fun insert(record: OsGoods): Int {
        return osGoodsMapper.insert(record)
    }


    fun insertSelective(record: OsGoods): Int {
        return osGoodsMapper.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsGoods {
        return osGoodsMapper.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsGoods): Int {
        return osGoodsMapper.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsGoods): Int {
        return osGoodsMapper.updateByPrimaryKey(record)
    }

    fun selectGoodsByShopId(userId: Int, shopId: Int): List<OsGoodsModel> {
        return osGoodsMapper.selectGoodsByShopId(userId, shopId)
    }

    fun selectAllGoods(): List<OsGoods>? {
        return osGoodsMapper.selectAllGoods()
    }

    fun getGoodsByKey(key: String?): List<OsGoods>? {
        return osGoodsMapper.getGoodsByKey(key)
    }

    fun getAllGoodsByShopId(shopId: Int): List<OsGoods>? {
        return osGoodsMapper.getAllGoodsByShopId(shopId)
    }


}
