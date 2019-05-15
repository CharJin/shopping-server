package top.charjin.shoppingserver.model

import top.charjin.shoppingserver.entity.OsGoods
import top.charjin.shoppingserver.entity.OsShop

data class OsCartModel(val shop: OsShop, val listGoods: List<OsGoods>)
