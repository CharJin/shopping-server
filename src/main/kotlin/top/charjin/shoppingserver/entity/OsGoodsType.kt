package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsGoodsType : Serializable {
    var id: Int? = null

    /**
     * 商品类型
     */
    var type: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", id=").append(id)
        sb.append(", type=").append(type)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}