package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.service.OsGoodsService
import top.charjin.shoppingserver.service.OsShopService
import javax.annotation.Resource


@RestController
@RequestMapping("/shop")
class ShopController {


    @Resource
    private lateinit var shopService: OsShopService

    @Resource
    private lateinit var goodsService: OsGoodsService

}