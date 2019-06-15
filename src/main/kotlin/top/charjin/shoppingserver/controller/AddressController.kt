package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.*
import top.charjin.shoppingserver.entity.OsAddress
import top.charjin.shoppingserver.model.ResultModel
import top.charjin.shoppingserver.service.OsAddressService
import javax.annotation.Resource


@RestController
@RequestMapping("/address")
class AddressController {

    @Resource
    private lateinit var addressService: OsAddressService

    @RequestMapping("/getAllAddressByUserId")
    fun getAllAddress(@RequestParam("userId") userId: Int): List<OsAddress>? {
        return addressService.getAllAddressByUserId(userId)
    }


    @RequestMapping("/getDefaultAddress")
    fun getDefaultAddress(@RequestParam("userId") userId: Int): ResultModel<OsAddress?> {
//        return addressService.getDefaultAddressByUserId(userId)
        val addressList: List<OsAddress> = getAllAddress(userId)!!
        return if (addressList.isNotEmpty())
            ResultModel(200, "success", addressList.first())
        else
            ResultModel(202, "error", null)
    }


    @RequestMapping("/add", method = [RequestMethod.POST])
    fun addAddress(@RequestBody address: OsAddress): Int {
        if (address.isDefault) {
            // 把用户的默认地址设置为非默认状态
            addressService.resetDefaultAddress(address.userId)
        }
        return addressService.insertSelective(address)
    }


    /**
     * 更新新地址 判断该项是否为默认地址，并在数据库中对其做修改
     */
    @RequestMapping("/update", method = [RequestMethod.POST])
    fun updateAddress(@RequestBody address: OsAddress): Int {
        if (address.isDefault) {
            // 把用户的默认地址设置为非默认状态
            addressService.resetDefaultAddress(address.userId)
        }
        println("Hello : ")
        println(address)
        return addressService.updateByPrimaryKeySelective(address)
    }

    /**
     * 更新新地址 判断该项是否为默认地址，并在数据库中对其做修改
     */
    @RequestMapping("/deleteById")
    fun deleteById(addressId: Int): Int = addressService.deleteByPrimaryKey(addressId)
}