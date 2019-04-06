package top.charjin.shoppingserver.service

import top.charjin.shoppingserver.entity.UserModel

interface UserService {
    fun queryUser(username: String): UserModel

    fun queryAllUser(): List<UserModel>
}