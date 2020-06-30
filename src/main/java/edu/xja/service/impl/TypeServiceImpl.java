package edu.xja.service.impl;

import edu.xja.dao.TypeMapper;
import edu.xja.domain.Type;
import edu.xja.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 业务层实现类：商品类型
 * @author: dell
 * @date: 2020/6/30 - 15:26
 * @version: 1.0
 * @website:
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    public int deleteByPrimaryKey(Integer id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    public int insert(Type record) {
        return typeMapper.insert(record);
    }

    public int insertSelective(Type record) {
        return typeMapper.insertSelective(record);
    }

    public Type selectByPrimaryKey(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Type record) {
        return typeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

    public List<Type> findAll() {
        return typeMapper.findAll();
    }

    public int updateDeleteFlagByPrimaryKey(Integer id) {
        return typeMapper.updateDeleteFlagByPrimaryKey(id);
    }
}
