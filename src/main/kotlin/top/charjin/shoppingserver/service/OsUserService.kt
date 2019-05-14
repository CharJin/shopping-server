package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsUser
import top.charjin.shoppingserver.mapper.OsUserMapper
import javax.annotation.Resource

@Service
open class OsUserService {

    @Resource
    private val osUserMapper: OsUserMapper? = null


    open fun deleteByPrimaryKey(id: Int?): Int {
        return osUserMapper!!.deleteByPrimaryKey(id)
    }


    open fun insert(record: OsUser): Int {
        return osUserMapper!!.insert(record)
    }


    open fun insertSelective(record: OsUser): Int {
        return osUserMapper!!.insertSelective(record)
    }


    open fun selectByPrimaryKey(id: Int?): OsUser {
        return osUserMapper!!.selectByPrimaryKey(id)
    }


    open fun updateByPrimaryKeySelective(record: OsUser): Int {
        return osUserMapper!!.updateByPrimaryKeySelective(record)
    }


    open fun updateByPrimaryKey(record: OsUser): Int {
        return osUserMapper!!.updateByPrimaryKey(record)
    }


    open fun selectByUsernamePwd(username: String, password: String): OsUser? {
        return osUserMapper!!.selectByUsernamePwd(username, password)
    }

    fun updateByUserNamePwdSelective(user: OsUser): Int {
        return osUserMapper!!.updateByUserNamePwdSelective(user)
    }
}
