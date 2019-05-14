package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.service.OsCartService
import javax.annotation.Resource

@RestController
@RequestMapping("/cart")
class CartController {
    @Resource
    private lateinit var cartService: OsCartService

    @RequestMapping("/fetch", method = [RequestMethod.GET])
    fun fetchCartByUserId(@RequestParam("id") userId: Int) {

    }


}