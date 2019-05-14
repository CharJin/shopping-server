package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsCommodityReview : Serializable {
    var id: Int? = null

    /**
     * 外键,商品id
     */
    var commodityId: Int? = null

    /**
     * 评论内容,80个汉字以内
     */
    var content: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}