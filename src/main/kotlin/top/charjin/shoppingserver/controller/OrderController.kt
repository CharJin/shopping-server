package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsOrder
import top.charjin.shoppingserver.entity.OsOrderDetail
import top.charjin.shoppingserver.model.OsOrderModel
import top.charjin.shoppingserver.model.ResultMap
import top.charjin.shoppingserver.service.OsCartService
import top.charjin.shoppingserver.service.OsOrderDetailService
import top.charjin.shoppingserver.service.OsOrderService
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*
import javax.annotation.Resource


@RestController
@RequestMapping("/order")
class OrderController {


    @Resource
    private lateinit var orderService: OsOrderService

    @Resource
    private lateinit var orderDetailService: OsOrderDetailService

    @Resource
    private lateinit var cartService: OsCartService

    @RequestMapping("/getAllOrdersByUserId")
    fun getAllOrders(@RequestParam("userId") userId: Int): List<OsOrderModel>? {
        return orderService.selectAllOrders(userId)
    }


    @RequestMapping("/addOrder")
    fun insertOrder(@RequestBody order: OsOrder): ResultMap<String> {
        val affectedRowNum = orderService.insertSelective(order)

        return if (affectedRowNum > 0) ResultMap(201, "订单详请信息创建成功!", "")
        else ResultMap(202, "订单详请信息创建失败!", "")
    }


    @RequestMapping("/addOrderDetailGoodsList")
    fun insertOrderDetail(@RequestBody orderDetailGoodsList: List<OsOrderDetail>, @RequestParam("userId") userId: Int): ResultMap<String> {
        var affectedRowNum = 0
        orderDetailGoodsList.forEach {
            affectedRowNum += orderDetailService.insertSelective(it)
            cartService.deleteByPrimaryKey(userId, it.goodsId)
        }
        return if (affectedRowNum == orderDetailGoodsList.size) ResultMap(201, "订单详请信息创建成功!", "")
        else ResultMap(202, "订单详请信息创建失败!", "")
    }

    @RequestMapping("/updateOrderStatusByOrderNo")
    fun updateOrderStatusByOrderNo(@RequestBody orderNoList: List<String>, orderStatus: Int): Int {
        val nowTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale("zh")).format(Date())
        val timestamp = Timestamp.valueOf(nowTime)
        var affectedRowNum = 0
        orderNoList.forEach {
            affectedRowNum += orderService.updateOrderStatusByOrderNo(it, orderStatus, timestamp)
        }
        return affectedRowNum
    }


}