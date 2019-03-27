package top.charjin.shoppingserver.entity

import java.io.Serializable
import java.util.*

/**
 * os_user
 * @author
 */
class UserModel : Serializable {
    var id: Int? = null

    var username: String? = null

    var pwd: String? = null

    var realname: String? = null

    var birthday: Date? = null

    var phone: String? = null

    var email: String? = null

    var address: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}