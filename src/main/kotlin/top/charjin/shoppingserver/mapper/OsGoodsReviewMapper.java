package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsGoodsReview;

public interface OsGoodsReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsGoodsReview record);

    int insertSelective(OsGoodsReview record);

    OsGoodsReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsGoodsReview record);

    int updateByPrimaryKey(OsGoodsReview record);
}