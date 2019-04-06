package top.charjin.shoppingserver.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView
import top.charjin.shoppingserver.entity.UserModel
import top.charjin.shoppingserver.service.UserService


@Controller
class LoginController(val userService: UserService) {

    //    @Autowired
//    private lateinit var userService: UserServiceImpl

    @ResponseBody
    @RequestMapping(value = ["/login"], method = [RequestMethod.GET])
    fun login(@RequestParam(value = "username", required = false) username: String?, @RequestParam(value = "password", required = false) password: String?): List<UserModel> {
        return userService.queryAllUser()
    }

    @RequestMapping(value = ["/login1"], method = [RequestMethod.GET])
    @ResponseBody
    fun login1(@RequestParam("username", required = false, defaultValue = "123") username: String, @RequestParam("password", required = false, defaultValue = "123") password: String): String {
        val user = userService.queryUser(username)
        print(user.username + "   " + user.pwd)
        return user.username + "   " + user.pwd
    }

    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    fun hello(map: ModelMap): ModelAndView {
        val mv = ModelAndView("Hello")
        mv.addObject("username", 123)
        mv.addObject("pwd", 321)
        return mv
    }
}