package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsCommodityReview;

public interface OsCommodityReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsCommodityReview record);

    int insertSelective(OsCommodityReview record);

    OsCommodityReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsCommodityReview record);

    int updateByPrimaryKey(OsCommodityReview record);
}