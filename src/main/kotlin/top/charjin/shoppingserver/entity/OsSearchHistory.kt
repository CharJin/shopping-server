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

    companion object {

        private const val serialVersionUID = 1L
    }
}