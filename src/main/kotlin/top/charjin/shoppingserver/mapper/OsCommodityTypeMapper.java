package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsCommodityType;

public interface OsCommodityTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OsCommodityType record);

    int insertSelective(OsCommodityType record);

    OsCommodityType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OsCommodityType record);

    int updateByPrimaryKey(OsCommodityType record);
}