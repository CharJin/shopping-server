package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsShop : Serializable {
    var id: Int? = null

    var name: String? = null

    /**
     * 商品类型(id)
     */
    var shopTypeId: Int? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}