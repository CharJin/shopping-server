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
    var goodsId: Int? = null

    /**
     * 订单建立时间
     */
    var orderDate: Date? = null

    var orderStatus: Boolean? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", id=").append(id)
        sb.append(", userId=").append(userId)
        sb.append(", goodsId=").append(goodsId)
        sb.append(", orderDate=").append(orderDate)
        sb.append(", orderStatus=").append(orderStatus)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}