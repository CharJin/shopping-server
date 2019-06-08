package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsGoodsReview : Serializable {
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
     * 评论内容,80个汉字以内
     */
    var content: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", shopId=").append(id)
        sb.append(", userId=").append(userId)
        sb.append(", goodsId=").append(goodsId)
        sb.append(", content=").append(content)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}