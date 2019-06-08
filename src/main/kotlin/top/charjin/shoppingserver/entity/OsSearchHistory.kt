package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsSearchHistory : Serializable {
    var id: Int? = null

    /**
     * 外键,用户id
     */
    var userId: Int? = null

    /**
     * 搜索内容
     */
    var content: String? = null

    /**
     * 搜索权重
     */
    var weight: Short? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", shopId=").append(id)
        sb.append(", userId=").append(userId)
        sb.append(", content=").append(content)
        sb.append(", weight=").append(weight)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}