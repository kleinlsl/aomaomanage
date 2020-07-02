package edu.xja.dao;
/**
 * @description: 商品类别表，数据访问层
 * @date: 2020/6/29 - 19:31
 */

import edu.xja.domain.Type;

import java.util.List;

public interface TypeMapper {
    // TODO: 2020/6/29 通过主键删除商品类别（物理删除）
    int deleteByPrimaryKey(Integer id);

    // TODO: 2020/6/29 添加商品类别
    int insert(Type record);

    // TODO: 2020/6/29 选择性添加商品类别
    int insertSelective(Type record);

    // TODO: 2020/6/29 通过主键查询商品类别
    Type selectByPrimaryKey(Integer id);

    // TODO: 2020/6/29 通过主键选择性更新类别信息
    int updateByPrimaryKeySelective(Type record);

    // TODO: 2020/6/29 通过主键更新全部信息
    int updateByPrimaryKey(Type record);

    // TODO: 2020/6/29 查询全部商品类别
    List<Type> findAll();

    // TODO: 2020/6/30 通过主键删除商品类别信息(逻辑删除)
    int updateDeleteFlagByPrimaryKey(Integer id);

    // TODO: 2020/7/2 通过类别名 ， 模糊查询类别信息
    List<Type> search(String typeName);
}