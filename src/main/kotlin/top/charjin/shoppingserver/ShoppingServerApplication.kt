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

    @RequestMapping("/")
    fun home(): String {
        return "login"
    }
}

fun main(args: Array<String>) {
    runApplication<ShoppingServerApplication>(*args)
}
