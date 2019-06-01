package top.charjin.shoppingserver.entity

import java.io.Serializable
import java.util.*

class OsAddress : Serializable {
    var addressId: Int? = null

    /**
     * 用户id
     */
    var userId: Int? = null

    /**
     * 收件人电话号码
     */
    var phone: String? = null

    /**
     * 省
     */
    var province: String? = null

    /**
     * 市
     */
    var city: String? = null

    /**
     * 县/区
     */
    var district: String? = null

    /**
     * 详细地址
     */
    var addressDetail: String? = null

    /**
     * 记录创建时间
     */
    var createTime: Date? = null

    /**
     * 记录更新时间
     */
    var updateTime: Date? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", addressId=").append(addressId)
        sb.append(", userId=").append(userId)
        sb.append(", phone=").append(phone)
        sb.append(", province=").append(province)
        sb.append(", city=").append(city)
        sb.append(", district=").append(district)
        sb.append(", addressDetail=").append(addressDetail)
        sb.append(", createTime=").append(createTime)
        sb.append(", updateTime=").append(updateTime)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}