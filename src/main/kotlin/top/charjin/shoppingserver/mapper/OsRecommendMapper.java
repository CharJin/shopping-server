package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsRecommend;

import java.util.List;

public interface OsRecommendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsRecommend record);

    int insertSelective(OsRecommend record);

    OsRecommend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsRecommend record);

    int updateByPrimaryKey(OsRecommend record);

    List<OsRecommend> selectRandomly();
}