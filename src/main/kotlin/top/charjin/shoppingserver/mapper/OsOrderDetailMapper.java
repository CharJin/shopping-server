package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import top.charjin.shoppingserver.entity.OsOrderDetail;

import java.util.List;

public interface OsOrderDetailMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OsOrderDetail record);

    int insertSelective(OsOrderDetail record);

    OsOrderDetail selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(OsOrderDetail record);

    int updateByPrimaryKey(OsOrderDetail record);

    List<OsOrderDetail> selectByOrderNo(@Param("orderNo") String orderNo);
}