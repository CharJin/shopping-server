package top.charjin.shoppingserver.model;


import top.charjin.shoppingserver.entity.*;

import java.util.List;

public class OsOrderModel extends OsOrder {
    private OsShop shop;
    private OsAddress address;
    private OsPayBusiness payBusiness;
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

    public OsPayBusiness getPayBusiness() {
        return payBusiness;
    }

    public void setPayBusiness(OsPayBusiness payBusiness) {
        this.payBusiness = payBusiness;
    }

    public List<OsOrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OsOrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
}