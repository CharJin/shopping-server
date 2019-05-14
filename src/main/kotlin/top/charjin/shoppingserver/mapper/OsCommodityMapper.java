package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsCommodity;

public interface OsCommodityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsCommodity record);

    int insertSelective(OsCommodity record);

    OsCommodity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsCommodity record);

    int updateByPrimaryKey(OsCommodity record);
}