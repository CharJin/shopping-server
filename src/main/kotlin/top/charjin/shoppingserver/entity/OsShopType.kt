package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsShopType : Serializable {
    var id: Int? = null

    /**
     * 商品类型
     */
    var type: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}