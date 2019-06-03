package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsAddress
import top.charjin.shoppingserver.mapper.OsAddressMapper
import javax.annotation.Resource

@Service
class OsAddressService {

    @Resource
    private lateinit var addressMapper: OsAddressMapper


    fun deleteByPrimaryKey(addressId: Int?): Int {
        return addressMapper.deleteByPrimaryKey(addressId)
    }


    fun insert(record: OsAddress): Int {
        return addressMapper.insert(record)
    }


    fun insertSelective(record: OsAddress): Int {
        return addressMapper.insertSelective(record)
    }


    fun selectByPrimaryKey(addressId: Int?): OsAddress {
        return addressMapper.selectByPrimaryKey(addressId)
    }


    fun updateByPrimaryKeySelective(record: OsAddress): Int {
        return addressMapper.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsAddress): Int {
        return addressMapper.updateByPrimaryKey(record)
    }

    fun getAllAddressByUserId(userId: Int): List<OsAddress>? = addressMapper.getAllAddressByUserId(userId)

    fun resetDefaultAddress(userId: Int): Int = addressMapper.resetDefaultAddress(userId)
    fun getDefaultAddressByUserId(userId: Int): OsAddress? = addressMapper.getDefaultAddressByUserId(userId)


}
