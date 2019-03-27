package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.UserModel
import top.charjin.shoppingserver.service.serviceImpl.UserServiceImpl
import javax.annotation.Resource

@RestController
class LoginController {

    @Resource
    private val userService: UserServiceImpl? = null

    @RequestMapping(value = ["/login"], method = [RequestMethod.GET])
    fun login(@RequestParam(value = "username", required = false) username: String): UserModel? {
        val user = userService?.queryUser(username)
        if (user != null)
            return user
        return null
    }
}