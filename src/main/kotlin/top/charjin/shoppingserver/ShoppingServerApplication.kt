package top.charjin.shoppingserver

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("top.charjin.shoppingserver.mapper")
class ShoppingServerApplication

fun main(args: Array<String>) {
    runApplication<ShoppingServerApplication>(*args)
}
