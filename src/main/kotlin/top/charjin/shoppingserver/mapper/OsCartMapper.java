package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import top.charjin.shoppingserver.entity.OsCart;

public interface OsCartMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

    int insert(OsCart record);

    int insertSelective(OsCart record);

    OsCart selectByPrimaryKey(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

    int updateByPrimaryKeySelective(OsCart record);

    int updateByPrimaryKey(OsCart record);

    int deleteByPrimaryKey(Integer id);

    OsCart selectByPrimaryKey(Integer id);

}