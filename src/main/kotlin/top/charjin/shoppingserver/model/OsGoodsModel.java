package top.charjin.shoppingserver.model;

import top.charjin.shoppingserver.entity.OsGoods;

public class OsGoodsModel extends OsGoods {
    private int goodsNum;

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }
}
