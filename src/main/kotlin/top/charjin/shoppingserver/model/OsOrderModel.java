package top.charjin.shoppingserver.model;


import top.charjin.shoppingserver.entity.OsAddress;
import top.charjin.shoppingserver.entity.OsOrder;
import top.charjin.shoppingserver.entity.OsOrderDetail;
import top.charjin.shoppingserver.entity.OsShop;

import java.util.List;

public class OsOrderModel extends OsOrder {
    private OsShop shop;
    private OsAddress address;
    private List<OsOrderDetail> orderDetail;

    public OsShop getShop() {
        return shop;
    }

    public void setShop(OsShop shop) {
        this.shop = shop;
    }

    public OsAddress getAddress() {
        return address;
    }

    public void setAddress(OsAddress address) {
        this.address = address;
    }

    public List<OsOrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OsOrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
}