package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.OrderDetail;
import edu.xja.domain.OrderInfo;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class OrderDetailMapperTest extends BaseTest {

    @Resource
    private OrderDetailMapper orderDetailMapper;
    @Test
    public void deleteByPrimaryKey() {
        int res=orderDetailMapper.deleteByPrimaryKey(1);
        Assert.assertTrue(res==0);
        Assert.assertNotNull(res);
    }

    @Test
    public void insert() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setCreator("admin");
        orderDetail.setNum(100);
        orderDetail.setOId(1);
        orderDetail.setPId(1);

        int res=orderDetailMapper.insert(orderDetail);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setCreator("admin");
        orderDetail.setNum(200);
        orderDetail.setOId(2);
        orderDetail.setPId(2);

        int res=orderDetailMapper.insert(orderDetail);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        OrderDetail orderDetail=orderDetailMapper.selectByPrimaryKey(2);
        System.out.println(orderDetail);
        Assert.assertNotNull(orderDetail);
    }


    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
        OrderDetail orderDetail=orderDetailMapper.selectByPrimaryKey(2);
        orderDetail.setDeleteFlag((byte) 1);
        int res=orderDetailMapper.updateByPrimaryKey(orderDetail);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<OrderDetail> orderDetailList=orderDetailMapper.findAll();
        Assert.assertNotNull(orderDetailList);
        if(orderDetailList.size()>0){
            for (OrderDetail ord:orderDetailList
            ) {
                System.out.println(ord);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = orderDetailMapper.updateDeleteFlagByPrimaryKey(2);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }
}