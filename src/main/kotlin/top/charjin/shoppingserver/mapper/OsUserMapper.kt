package top.charjin.shoppingserver.mapper

import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import top.charjin.shoppingserver.entity.OsUser

interface OsUserMapper {
    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(record: OsUser): Int

    fun insertSelective(record: OsUser): Int

    fun selectByPrimaryKey(id: Int?): OsUser

    fun updateByPrimaryKeySelective(record: OsUser): Int

    fun updateByPrimaryKey(record: OsUser): Int

    @Select("select * from os_user where username = #{username} and password = #{password}")
    fun selectByUsernamePwd(@Param("username") username: String, @Param("password") password: String): OsUser

    fun updateByUserNamePwdSelective(user: OsUser): Int
}