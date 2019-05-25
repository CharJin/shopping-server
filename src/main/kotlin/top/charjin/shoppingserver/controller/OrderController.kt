package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.model.OsOrderModel
import top.charjin.shoppingserver.service.OsGoodsService
import top.charjin.shoppingserver.service.OsOrderService
import top.charjin.shoppingserver.service.OsShopService
import javax.annotation.Resource


@RestController
@RequestMapping("/order")
class OrderController {


    @Resource
    private lateinit var shopService: OsShopService

    @Resource
    private lateinit var goodsService: OsGoodsService

    @Resource
    private lateinit var orderService: OsOrderService

    @RequestMapping("/getAllOrdersByUserId")
    fun getAllOrders(@RequestParam("userId") userId: Int): List<OsOrderModel>? {
        return orderService.selectAllOrders(userId)
    }

}