package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsOrder
import top.charjin.shoppingserver.mapper.OsOrderMapper
import top.charjin.shoppingserver.model.OsOrderModel

import javax.annotation.Resource

@Service
class OsOrderService {

    @Resource
    private lateinit var osOrderMapper: OsOrderMapper


    fun deleteByPrimaryKey(orderId: Int?): Int {
        return osOrderMapper.deleteByPrimaryKey(orderId)
    }


    fun insert(record: OsOrder): Int {
        return osOrderMapper.insert(record)
    }


    fun insertSelective(record: OsOrder): Int {
        return osOrderMapper.insertSelective(record)
    }


    fun selectByPrimaryKey(orderId: Int?): OsOrder {
        return osOrderMapper.selectByPrimaryKey(orderId)
    }


    fun updateByPrimaryKeySelective(record: OsOrder): Int {
        return osOrderMapper.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsOrder): Int {
        return osOrderMapper.updateByPrimaryKey(record)
    }

    fun selectAllOrders(user_id: Int): List<OsOrderModel>? {
        return osOrderMapper.selectAllOrders(user_id)
    }

    fun updateOrderStatusByOrderNo(orderNo: String, orderStatus: Int): Int {
        return osOrderMapper.updateOrderStatusByOrderNo(orderNo, orderStatus)
    }
}


