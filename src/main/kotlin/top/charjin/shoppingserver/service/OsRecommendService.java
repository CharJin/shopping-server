package top.charjin.shoppingserver.service;

import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;
import top.charjin.shoppingserver.entity.OsRecommend;
import top.charjin.shoppingserver.mapper.OsRecommendMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OsRecommendService {

    @Resource
    private OsRecommendMapper osRecommendMapper;


    public int deleteByPrimaryKey(Integer id) {
        return osRecommendMapper.deleteByPrimaryKey(id);
    }


    public int insert(OsRecommend record) {
        return osRecommendMapper.insert(record);
    }


    public int insertSelective(OsRecommend record) {
        return osRecommendMapper.insertSelective(record);
    }


    public OsRecommend selectByPrimaryKey(Integer id) {
        return osRecommendMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(OsRecommend record) {
        return osRecommendMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OsRecommend record) {
        return osRecommendMapper.updateByPrimaryKey(record);
    }

    @Nullable
    public List<OsRecommend> selectRandomly() {
        return osRecommendMapper.selectRandomly();
    }
}
