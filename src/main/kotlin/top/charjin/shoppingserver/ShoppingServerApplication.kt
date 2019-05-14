package top.charjin.shoppingserver

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@MapperScan("top.charjin.shoppingserver.mapper")
@Controller
class ShoppingServerApplication {

    // 配置start page指向静态页面 而非控制器请求
    @RequestMapping("/")
    fun home(): String {
        return "login"
    }
}

fun main(args: Array<String>) {
    runApplication<ShoppingServerApplication>(*args)
}
