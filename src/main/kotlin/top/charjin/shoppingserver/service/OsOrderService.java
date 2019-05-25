package top.charjin.shoppingserver.service;

import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;
import top.charjin.shoppingserver.entity.OsOrder;
import top.charjin.shoppingserver.mapper.OsOrderMapper;
import top.charjin.shoppingserver.model.OsOrderModel;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OsOrderService {

    @Resource
    private OsOrderMapper osOrderMapper;


    public int deleteByPrimaryKey(Integer orderId) {
        return osOrderMapper.deleteByPrimaryKey(orderId);
    }


    public int insert(OsOrder record) {
        return osOrderMapper.insert(record);
    }


    public int insertSelective(OsOrder record) {
        return osOrderMapper.insertSelective(record);
    }


    public OsOrder selectByPrimaryKey(Integer orderId) {
        return osOrderMapper.selectByPrimaryKey(orderId);
    }


    public int updateByPrimaryKeySelective(OsOrder record) {
        return osOrderMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OsOrder record) {
        return osOrderMapper.updateByPrimaryKey(record);
    }

    @Nullable
    public List<OsOrderModel> selectAllOrders(int user_id) {
        return osOrderMapper.selectAllOrders(user_id);
    }
}

