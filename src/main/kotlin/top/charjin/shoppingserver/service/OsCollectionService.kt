package top.charjin.shoppingserver.service

import org.springframework.stereotype.Service
import top.charjin.shoppingserver.entity.OsCollection
import top.charjin.shoppingserver.mapper.OsCollectionMapper
import javax.annotation.Resource

@Service
class OsCollectionService {

    @Resource
    private val osCollectionMapper: OsCollectionMapper? = null


    fun deleteByPrimaryKey(id: Int?): Int {
        return osCollectionMapper!!.deleteByPrimaryKey(id)
    }


    fun insert(record: OsCollection): Int {
        return osCollectionMapper!!.insert(record)
    }


    fun insertSelective(record: OsCollection): Int {
        return osCollectionMapper!!.insertSelective(record)
    }


    fun selectByPrimaryKey(id: Int?): OsCollection {
        return osCollectionMapper!!.selectByPrimaryKey(id)
    }


    fun updateByPrimaryKeySelective(record: OsCollection): Int {
        return osCollectionMapper!!.updateByPrimaryKeySelective(record)
    }


    fun updateByPrimaryKey(record: OsCollection): Int {
        return osCollectionMapper!!.updateByPrimaryKey(record)
    }

}
