package top.charjin.shoppingserver.entity

import java.io.Serializable
import java.util.*

class OsOrder : Serializable {
    var id: Int? = null

    /**
     * 外键,用户id
     */
    var userId: Int? = null

    /**
     * 外键,商品id
     */
    var commodityId: Int? = null

    /**
     * 订单建立时间
     */
    var orderDate: Date? = null

    /**
     * 订单是否支付
     */
    var isPaid: Boolean? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}