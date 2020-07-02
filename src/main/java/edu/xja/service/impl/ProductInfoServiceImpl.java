package edu.xja.service.impl;

import edu.xja.dao.ProductInfoMapper;
import edu.xja.domain.ProductInfo;
import edu.xja.domain.Type;
import edu.xja.service.ProductInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/6/30 - 15:45
 * @version: 1.0
 * @website:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Resource
    private ProductInfoMapper productInfoMapper;
    public int deleteByPrimaryKey(Integer id) {
        return productInfoMapper.deleteByPrimaryKey(id);
    }

    public int insert(ProductInfo record) {
        return productInfoMapper.insert(record);
    }

    public int insertSelective(ProductInfo record) {
        return productInfoMapper.insertSelective(record);
    }

    public ProductInfo selectByPrimaryKey(Integer id) {
        return productInfoMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ProductInfo record) {
        return productInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(ProductInfo record) {
        return productInfoMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(ProductInfo record) {
        return productInfoMapper.updateByPrimaryKey(record);
    }

    public List<ProductInfo> findAll() {
        return productInfoMapper.findAll();
    }

    public int updateDeleteFlagByPrimaryKey(Integer id) {
        return productInfoMapper.updateDeleteFlagByPrimaryKey(id);
    }

    public List<ProductInfo> search(String productName) {
        return productInfoMapper.search(productName);
    }
}
