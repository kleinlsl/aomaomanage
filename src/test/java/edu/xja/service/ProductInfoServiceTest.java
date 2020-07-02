package edu.xja.service;

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
 * @description:
 * @author: dell
 * @date: 2020/6/30 - 15:53
 * @version: 1.0
 * @website:
 */
public class ProductInfoServiceTest extends BaseTest {
    @Resource
    private ProductInfoService productInfoService;

    @Test
    public void deleteByPrimaryKey() {
        int res=productInfoService.deleteByPrimaryKey(5);
        Assert.assertTrue(res==0);
        Assert.assertNotNull(res);
    }

    @Test
    public void insert() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCode("service-product001");
        productInfo.setName("service-海尔电视");
        productInfo.setTId(1);
        productInfo.setNum(10);
        productInfo.setPrice((long) 1999.0);
        productInfo.setCreator("admin");

        int res=productInfoService.insert(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setCode("service-product003");
        productInfo.setName("service-海尔电视003");
        productInfo.setTId(1);
        productInfo.setNum(10);
        productInfo.setPrice((long) 1999.0);
        productInfo.setCreator("admin");

        int res=productInfoService.insertSelective(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        ProductInfo productInfo=productInfoService.selectByPrimaryKey(4);
        System.out.println(productInfo);
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        ProductInfo productInfo=productInfoService.selectByPrimaryKey(5);
        productInfo.setCode("service-product004");
        productInfo.setName("service-海尔电视004");
//        productInfo.setTId(1);
//        productInfo.setNum(10);
//        productInfo.setPrice((long) 1999.0);
//        productInfo.setCreator("admin");
        int res=productInfoService.updateByPrimaryKeySelective(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
        ProductInfo productInfo=productInfoService.selectByPrimaryKey(5);
        System.out.println(productInfo);
//        productInfo.setCode("product004");
//        productInfo.setName("海尔电视004");
        productInfo.setIntro("this is service-product004!!!");
        int res=productInfoService.updateByPrimaryKeyWithBLOBs(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        ProductInfo productInfo=productInfoService.selectByPrimaryKey(5);
        productInfo.setDeleteFlag((byte) 1);
        int res=productInfoService.updateByPrimaryKey(productInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<ProductInfo> productInfoList=productInfoService.findAll();
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
        int res = productInfoService.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void search() {
        List<ProductInfo> typeList=productInfoService.search("");
        Assert.assertNotNull(typeList);
        for (ProductInfo t:typeList
        ) {
            System.out.println(t);
        }
    }
}