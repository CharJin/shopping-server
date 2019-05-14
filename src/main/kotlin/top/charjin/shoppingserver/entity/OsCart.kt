package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsCart : Serializable {
    var id: Int? = null

    /**
     * 外键,用户id
     */
    var userId: Int? = null

    /**
     * 外键,商品id
     */
    var commodityId: Int? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}