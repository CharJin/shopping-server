package top.charjin.shoppingserver.service.serviceImpl

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.UserModel
import top.charjin.shoppingserver.mapper.UserMapper
import top.charjin.shoppingserver.service.UserService
import javax.annotation.Resource

@Service
class UserServiceImpl : UserService {

    @Resource
    private lateinit var userMapper: UserMapper

    override fun queryUser(username: String): UserModel {
        return userMapper.queryUserByName(username)
    }

    override fun queryAllUser(): List<UserModel> {
        return userMapper.queryAllUser()
    }
}