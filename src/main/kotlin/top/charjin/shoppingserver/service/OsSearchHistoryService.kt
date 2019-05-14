package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsSearchHistory
import top.charjin.shoppingserver.mapper.OsSearchHistoryMapper
import javax.annotation.Resource

@Service
class OsSearchHistoryService {

    @Resource
    private val osSearchHistoryMapper: OsSearchHistoryMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osSearchHistoryMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsSearchHistory): Int {
        return osSearchHistoryMapper!!.insert(record)
    }


    fun insertSelective(record: OsSearchHistory): Int {
        return osSearchHistoryMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsSearchHistory {
        return osSearchHistoryMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsSearchHistory): Int {
        return osSearchHistoryMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsSearchHistory): Int {
        return osSearchHistoryMapper!!.updateByPrimaryKey(record)
    }

}
