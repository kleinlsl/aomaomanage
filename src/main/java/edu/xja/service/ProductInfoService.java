package edu.xja.service;

import edu.xja.domain.ProductInfo;

import java.util.List;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/6/30 - 15:44
 * @version: 1.0
 * @website:
 */
public interface ProductInfoService {
    // TODO: 2020/6/29 通过主键删除商品信息（物理删除）
    int deleteByPrimaryKey(Integer id);

    // TODO: 2020/6/29 添加商品信息
    int insert(ProductInfo record);

    // TODO: 2020/6/29 选择性添加商品信息
    int insertSelective(ProductInfo record);

    // TODO: 2020/6/29 通过主键查找商品信息
    ProductInfo selectByPrimaryKey(Integer id);

    // TODO: 2020/6/29 通过主键选择性更新商品信息
    int updateByPrimaryKeySelective(ProductInfo record);

    // TODO: 2020/6/29 通过主键更新商品信息（包含商品描述）
    int updateByPrimaryKeyWithBLOBs(ProductInfo record);

    // TODO: 2020/6/29 通过主键更新商品信息（不包含商品描述）
    int updateByPrimaryKey(ProductInfo record);

    // TODO: 2020/6/29 查找所有商品信息
    List<ProductInfo> findAll();

    // TODO: 2020/6/30 通过主键删除商品信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);

    // TODO: 2020/7/2 通过商品名 ， 模糊查询商品信息
    List<ProductInfo> search(String productName);

}
