package top.charjin.shoppingserver.entity

import java.io.Serializable
import java.util.*

/**
 * os_user
 * @author
 */
data class UserModel(var id: Int?, var username: String?, var pwd: String?,
                     var realname: String?, var birthday: Date?, var phone: String?, var email: String?, var address: String?) : Serializable