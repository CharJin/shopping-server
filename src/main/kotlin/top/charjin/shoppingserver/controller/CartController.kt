package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsGoods
import top.charjin.shoppingserver.entity.OsShop
import top.charjin.shoppingserver.service.OsCartService
import top.charjin.shoppingserver.service.OsGoodsService
import top.charjin.shoppingserver.service.OsShopService
import javax.annotation.Resource

@RestController
@RequestMapping("/cart")
class CartController {


    @Resource
    private lateinit var cartService: OsCartService

    @Resource
    private lateinit var goodsService: OsGoodsService

    @Resource
    private lateinit var shopService: OsShopService

    @RequestMapping("/fetch", method = [RequestMethod.GET])
    fun fetchCartByUserId(@RequestParam("id") userId: Int): HashMap<OsShop, List<OsGoods>> {
        var mapCart = HashMap<OsShop, List<OsGoods>>()
        val listShop: List<OsShop> = shopService.selectByUserId(userId)
        listShop.forEach {
            val listGoods = goodsService.selectGoodsByShopId(userId, it.id!!)
            mapCart[it] = listGoods
        }
        return mapCart
    }


}