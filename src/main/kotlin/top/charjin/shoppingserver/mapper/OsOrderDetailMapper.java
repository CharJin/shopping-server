package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsOrderDetail;

public interface OsOrderDetailMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OsOrderDetail record);

    int insertSelective(OsOrderDetail record);

    OsOrderDetail selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OsOrderDetail record);

    int updateByPrimaryKey(OsOrderDetail record);
}