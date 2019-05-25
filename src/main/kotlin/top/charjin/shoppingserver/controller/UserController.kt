package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsUser
import top.charjin.shoppingserver.service.OsUserService
import javax.annotation.Resource

/**
 * 为控制器添加模块名
 */

@RestController
@RequestMapping("/user")
class UserController {

    @Resource
    private lateinit var userService: OsUserService

    /**
     * 根据用户和密码获取用户对象
     */
    @RequestMapping("/login")
    fun identifyUser(username: String, password: String): OsUser? = userService.selectByUsernamePwd(username, password)


    /////////////// user 对象不能为空////////////////
    /**
     * 仅负责数据的插入,至于数据是否符合规范有客户端进行判断以降低请求响应时间
     * 插入与修改相同,如果操作成功均返回"1"(1条记录受影响),"0"(无记录受影响)
     */
    @RequestMapping("/register", method = [RequestMethod.POST])
    fun registerNewUser(@RequestBody user: OsUser): Int {
        println(user)
        return userService.insertSelective(user)
    }


    /**
     * 更新用户数据
     */
    @RequestMapping("/update", method = [RequestMethod.POST])
    fun updateUserData(user: OsUser): Int = userService.updateByUserNamePwdSelective(user)
}