package top.charjin.shoppingserver.service;

import org.springframework.stereotype.Service;
import top.charjin.shoppingserver.entity.OsOrderDetail;
import top.charjin.shoppingserver.mapper.OsOrderDetailMapper;

import javax.annotation.Resource;

@Service
public class OsOrderDetailService {

    @Resource
    private OsOrderDetailMapper osOrderDetailMapper;


    public int deleteByPrimaryKey(Integer orderDetailId) {
        return osOrderDetailMapper.deleteByPrimaryKey(orderDetailId);
    }


    public int insert(OsOrderDetail record) {
        return osOrderDetailMapper.insert(record);
    }


    public int insertSelective(OsOrderDetail record) {
        return osOrderDetailMapper.insertSelective(record);
    }


    public OsOrderDetail selectByPrimaryKey(Integer orderDetailId) {
        return osOrderDetailMapper.selectByPrimaryKey(orderDetailId);
    }


    public int updateByPrimaryKeySelective(OsOrderDetail record) {
        return osOrderDetailMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OsOrderDetail record) {
        return osOrderDetailMapper.updateByPrimaryKey(record);
    }

}


