package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.entity.OsAddress
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

}