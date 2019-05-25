package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
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

    @Update("update os_cart set number = #{number} where user_id = #{userId} and goods_id = #{goodsId}")
    int updateGoodsNum(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId, @Param("number") Integer number);
}