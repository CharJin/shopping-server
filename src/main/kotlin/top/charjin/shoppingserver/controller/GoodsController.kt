package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsGoods
import top.charjin.shoppingserver.service.OsGoodsService
import javax.annotation.Resource


@RestController
@RequestMapping("/goods")
class GoodsController {

    @Resource
    private lateinit var goodsService: OsGoodsService

    @RequestMapping("/getAllGoods")
    fun getAllGoods(): List<OsGoods>? {
        return goodsService.selectAllGoods()
    }


    @RequestMapping("/getAllGoodsByShopId")
    fun getAllGoodsByShopId(shopId: Int): List<OsGoods>? = goodsService.getAllGoodsByShopId(shopId)


    /**
     * 根据关键字搜索商品
     */
    @RequestMapping("/getGoodsByKey")
    fun getAllGoods(@RequestParam("key") key: String?): List<OsGoods>? {
        return goodsService.getGoodsByKey(key)
    }


    @RequestMapping("/getGoodsById")
    fun getGoodsById(goodsId: Int) = goodsService.selectByPrimaryKey(goodsId)
}