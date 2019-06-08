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

    /* @Bean
     fun fastJsonConfigure(): HttpMessageConverters {
         val converter = FastJsonHttpMessageConverter()
         val fastJsonConfig = FastJsonConfig()
         fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat)
         //日期格式化
         fastJsonConfig.dateFormat = "yyyy-MM-dd HH:mm:ss"

         val fastMediaTypes = ArrayList<MediaType>()
         fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8)
         converter.supportedMediaTypes = fastMediaTypes
         converter.fastJsonConfig = fastJsonConfig
         return HttpMessageConverters(converter)
     }*/

}

fun main(args: Array<String>) {
    runApplication<ShoppingServerApplication>(*args)
}
