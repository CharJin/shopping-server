package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsUser
import top.charjin.shoppingserver.mapper.OsUserMapper
import javax.annotation.Resource

@Service
class OsUserService {

    @Resource
    private lateinit var osUserMapper: OsUserMapper


    fun deleteByPrimaryKey(id: Int?): Int {
        return osUserMapper.deleteByPrimaryKey(id)
    }


    fun insert(record: OsUser): Int {
        return osUserMapper.insert(record)
    }


    fun insertSelective(record: OsUser): Int {
        return osUserMapper.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsUser {
        return osUserMapper.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsUser): Int {
        return osUserMapper.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsUser): Int {
        return osUserMapper.updateByPrimaryKey(record)
    }


    fun selectByUsernamePwd(username: String, password: String): OsUser? {
        return osUserMapper.selectByUsernamePwd(username, password)
    }

    fun updateByUserNamePwdSelective(user: OsUser): Int {
        return osUserMapper.updateByUserNamePwdSelective(user)
    }


    fun checkExistUserName(username: String): Boolean = osUserMapper.selectCountByUserName(username) > 0
}
