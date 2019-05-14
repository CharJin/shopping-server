package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsGoods : Serializable {
    var id: Int? = null

    /**
     * 商品(id)
     */
    var commodityTypeId: Int? = null

    /**
     * 店铺(id)
     */
    var shopId: Int? = null

    /**
     * 商品名
     */
    var name: String? = null

    /**
     * 商品展示图片,存放路径,多图片使用分隔符"^^^"
     */
    var image: String? = null

    /**
     * 价格
     */
    var price: Double? = null

    /**
     * 销量
     */
    var salesVolume: Short? = null

    /**
     * 商品地区
     */
    var region: String? = null

    /**
     * 商品描述信息
     */
    var description: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}