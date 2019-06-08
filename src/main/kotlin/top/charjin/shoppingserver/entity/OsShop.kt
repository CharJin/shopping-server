package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsShop : Serializable {
    var shopId: Int? = null

    var shopName: String? = null

    /**
     * 商品类型(shopId)
     */
    var shopTypeId: Int? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", shopId=").append(shopId)
        sb.append(", shopName=").append(shopName)
        sb.append(", shopTypeId=").append(shopTypeId)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}