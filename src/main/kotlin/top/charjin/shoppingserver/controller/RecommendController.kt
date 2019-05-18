package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsRecommend
import top.charjin.shoppingserver.service.OsRecommendService
import javax.annotation.Resource


@RequestMapping("/recommend")
@RestController
class RecommendController {

    @Resource
    private lateinit var recommendService: OsRecommendService

    /**
     * 随机获取4条搜索推荐
     */
    @RequestMapping("/getRecommend")
    fun getRecommend(): List<OsRecommend>? {
        return recommendService.selectRandomly()
    }
}