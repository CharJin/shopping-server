package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsPayBusiness;

public interface OsPayBusinessMapper {
    int deleteByPrimaryKey(Integer payId);

    int insert(OsPayBusiness record);

    int insertSelective(OsPayBusiness record);

    OsPayBusiness selectByPrimaryKey(Integer payId);

    int updateByPrimaryKeySelective(OsPayBusiness record);

    int updateByPrimaryKey(OsPayBusiness record);
}