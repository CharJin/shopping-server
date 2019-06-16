package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.*
import top.charjin.shoppingserver.entity.OsCart
import top.charjin.shoppingserver.model.OsCartModel
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


    /**
     * 根据用户id 查询购物车信息
     */

    @RequestMapping("/query-cart")
    fun queryCartGoodsList(@RequestParam("userId") userId: Int): List<OsCartModel>? {
        val listShop = shopService.selectByUserId(userId)
        val cartModelList = arrayListOf<OsCartModel>()
        listShop.forEach { cartModelList.add(OsCartModel(it, goodsService.selectGoodsByShopId(userId, it.shopId!!))) }
        return cartModelList
    }

    @RequestMapping("/addGoods")
    fun addGoods(userId: Int, goodsId: Int, goodsNum: Int): Int {
        val cart = cartService.selectByPrimaryKey(userId, goodsId)
        return if (cart != null) {
            cart.number += goodsNum
            cartService.updateByPrimaryKey(cart)
            1
        } else {
            val newCart = OsCart()
            newCart.userId = userId
            newCart.goodsId = goodsId
            newCart.number = goodsNum
            newCart.plan = "默认套餐"
            cartService.insert(newCart)
        }
    }

    @RequestMapping("/addGoodsNum")
    fun addGoodsNum(userId: Int, goodsId: Int, number: Int): Int =
            cartService.updateGoodsNum(userId, goodsId, number)


    @RequestMapping(value = ["/removeGoods"], method = [RequestMethod.POST])
    fun removeGoodsByUserId(@RequestParam("userId") userId: Int, @RequestBody goodsList: List<Int>) =
            cartService.removeGoodsByUserId(userId, goodsList)

}