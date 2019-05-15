package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.charjin.shoppingserver.entity.OsUser;

public interface OsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsUser record);

    int insertSelective(OsUser record);

    OsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsUser record);

    int updateByPrimaryKey(OsUser record);

    @Select({"select * from os_user where username = #{username} and password = #{password}"})
    OsUser selectByUsernamePwd(@Param("username") String username, @Param("password") String password);

    int updateByUserNamePwdSelective(OsUser user);
}