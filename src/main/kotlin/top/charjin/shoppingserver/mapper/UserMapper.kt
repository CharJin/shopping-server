package top.charjin.shoppingserver.mapper

import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Repository
import top.charjin.shoppingserver.entity.UserModel

@Repository
interface UserMapper {
    fun queryUserByName(@Param("username") username: String?): UserModel

    fun deleteByPrimaryKey(id: Int?): Int

    fun insert(user: UserModel): Int

    fun insertSelective(user: UserModel): Int

    fun selectByPrimaryKey(id: Int?): UserModel

    fun updateByPrimaryKeySelective(user: UserModel): Int

    fun updateByPrimaryKey(user: UserModel): Int
}