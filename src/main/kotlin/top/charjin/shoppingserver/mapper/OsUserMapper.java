package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import top.charjin.shoppingserver.entity.OsUser;

public interface OsUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(OsUser record);

    int insertSelective(OsUser record);

    OsUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(OsUser record);

    int updateByPrimaryKey(OsUser record);

    OsUser selectByUsernamePwd(@Param("username") String username, @Param("password") String password);

    int updateByUserNamePwdSelective(OsUser user);
}