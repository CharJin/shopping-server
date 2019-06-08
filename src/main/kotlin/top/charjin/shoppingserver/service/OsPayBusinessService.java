package top.charjin.shoppingserver.service;

import org.springframework.stereotype.Service;
import top.charjin.shoppingserver.entity.OsPayBusiness;
import top.charjin.shoppingserver.mapper.OsPayBusinessMapper;

import javax.annotation.Resource;

@Service
public class OsPayBusinessService {

    @Resource
    private OsPayBusinessMapper osPayBusinessMapper;


    public int deleteByPrimaryKey(Integer payId) {
        return osPayBusinessMapper.deleteByPrimaryKey(payId);
    }


    public int insert(OsPayBusiness record) {
        return osPayBusinessMapper.insert(record);
    }


    public int insertSelective(OsPayBusiness record) {
        return osPayBusinessMapper.insertSelective(record);
    }


    public OsPayBusiness selectByPrimaryKey(Integer payId) {
        return osPayBusinessMapper.selectByPrimaryKey(payId);
    }


    public int updateByPrimaryKeySelective(OsPayBusiness record) {
        return osPayBusinessMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OsPayBusiness record) {
        return osPayBusinessMapper.updateByPrimaryKey(record);
    }

}
