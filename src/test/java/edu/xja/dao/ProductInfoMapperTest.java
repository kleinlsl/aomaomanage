package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.ProductInfo;
import edu.xja.domain.Type;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @project: aomaomanage
 * @description: 单元测试：商品信息表数据访问层
 * @author: dell
 * @date: 2020/6/29 - 22:09
 * @version: 1.0
 * @website:
 */
public class ProductInfoMapperTest extends BaseTest {

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Test
    public void deleteByPrimaryKey() {
        int res=productInfoMapper.deleteByPrimaryKey(5);
        Assert.assertTrue(res==0);
        Assert.assertNotNull(res);
    }

    @Test
    public void insert() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCode("product001");
        productInfo.setName("海尔电视");
        productInfo.setTId(1);
        productInfo.setNum(10);
        productInfo.setPrice((long) 1999.0);
        productInfo.setCreator("admin");

        int res=productInfoMapper.insert(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCode("product003");
        productInfo.setName("海尔电视003");
        productInfo.setTId(1);
        productInfo.setNum(10);
        productInfo.setPrice((long) 1999.0);
        productInfo.setCreator("admin");

        int res=productInfoMapper.insertSelective(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        ProductInfo productInfo=productInfoMapper.selectByPrimaryKey(4);
        System.out.println(productInfo);
        Assert.assertNotNull(productInfo);
//        productInfo=productInfo.
    }

    @Test
    public void updateByPrimaryKeySelective() {
        ProductInfo productInfo=productInfoMapper.selectByPrimaryKey(4);
        productInfo.setCode("product004");
        productInfo.setName("海尔电视004");
//        productInfo.setTId(1);
//        productInfo.setNum(10);
//        productInfo.setPrice((long) 1999.0);
//        productInfo.setCreator("admin");
        int res=productInfoMapper.updateByPrimaryKeySelective(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
        ProductInfo productInfo=productInfoMapper.selectByPrimaryKey(4);
        System.out.println(productInfo);
//        productInfo.setCode("product004");
//        productInfo.setName("海尔电视004");
        productInfo.setIntro("this is product004!!!");
        int res=productInfoMapper.updateByPrimaryKeyWithBLOBs(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        ProductInfo productInfo=productInfoMapper.selectByPrimaryKey(4);
        productInfo.setDeleteFlag((byte) 1);
        int res=productInfoMapper.updateByPrimaryKey(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<ProductInfo> productInfoList=productInfoMapper.findAll();
        Assert.assertNotNull(productInfoList);
        if(productInfoList.size()>0){
            for (ProductInfo pro:productInfoList
                 ) {
                System.out.println(pro);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = productInfoMapper.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void search() {
        List<ProductInfo> typeList=productInfoMapper.search("");
        Assert.assertNotNull(typeList);
        for (ProductInfo t:typeList
        ) {
            System.out.println(t);
        }
    }
}