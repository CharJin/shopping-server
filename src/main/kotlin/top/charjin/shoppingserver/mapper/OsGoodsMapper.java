package top.charjin.shoppingserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.jetbrains.annotations.Nullable;
import top.charjin.shoppingserver.entity.OsGoods;
import top.charjin.shoppingserver.model.OsGoodsModel;

import java.util.List;

public interface OsGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsGoods record);

    int insertSelective(OsGoods record);

    OsGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsGoods record);

    int updateByPrimaryKey(OsGoods record);

    List<OsGoodsModel> selectGoodsByShopId(@Param("userId") int userId, @Param("shopId") int shopId);


    List<OsGoods> selectAllGoods();

    List<OsGoods> getGoodsByKey(@Nullable String key);


    List<OsGoods> getAllGoodsByShopId(@Param("shopId") int shopId);
}