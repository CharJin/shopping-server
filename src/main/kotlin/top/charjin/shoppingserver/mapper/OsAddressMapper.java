package top.charjin.shoppingserver.mapper;

import top.charjin.shoppingserver.entity.OsAddress;

import java.util.List;

public interface OsAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(OsAddress record);

    int insertSelective(OsAddress record);

    OsAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(OsAddress record);

    int updateByPrimaryKey(OsAddress record);

    List<OsAddress> getAllAddressByUserId(Integer userId);
}