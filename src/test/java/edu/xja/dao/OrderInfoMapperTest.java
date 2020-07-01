package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.OrderInfo;
import edu.xja.domain.ProductInfo;
import edu.xja.domain.UserComment;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class OrderInfoMapperTest extends BaseTest {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    @Test
    public void deleteByPrimaryKey() {
        int res=orderInfoMapper.deleteByPrimaryKey(1);
        Assert.assertTrue(res==0);
        Assert.assertNotNull(res);
    }

    @Test
    public void insert() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setCreator("admin");
        orderInfo.setUId(1);
        orderInfo.setOrderPrice(BigDecimal.valueOf(100));

        int res=orderInfoMapper.insert(orderInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setCreator("admin");
        orderInfo.setUId(2);
        orderInfo.setOrderPrice(BigDecimal.valueOf(1000));

        int res=orderInfoMapper.insertSelective(orderInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        OrderInfo orderInfo=orderInfoMapper.selectByPrimaryKey(1);
        System.out.println(orderInfo);
        Assert.assertNotNull(orderInfo);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        OrderInfo orderInfo=orderInfoMapper.selectByPrimaryKey(2);
        orderInfo.setOrderPrice(BigDecimal.valueOf(10000));
        orderInfo.setOrdeStatus("订单成功");
        int res=orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        OrderInfo orderInfo=orderInfoMapper.selectByPrimaryKey(2);
        orderInfo.setDeleteFlag((byte) 1);
        int res=orderInfoMapper.updateByPrimaryKey(orderInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<OrderInfo> orderInfoList=orderInfoMapper.findAll();
        Assert.assertNotNull(orderInfoList);
        if(orderInfoList.size()>0){
            for (OrderInfo ord:orderInfoList
            ) {
                System.out.println(ord);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = orderInfoMapper.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }
}