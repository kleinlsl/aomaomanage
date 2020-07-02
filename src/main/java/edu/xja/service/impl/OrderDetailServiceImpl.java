package edu.xja.service.impl;

import edu.xja.dao.OrderDetailMapper;
import edu.xja.dao.OrderInfoMapper;
import edu.xja.domain.OrderDetail;
import edu.xja.domain.OrderInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description:订单明细表
 * @author:
 * @date: 2020/7/2
 * @version: 1.0
 * @website:
 */
public class OrderDetailServiceImpl {

    @Resource
    private OrderDetailMapper orderDetailMapper;
    public int deleteByPrimaryKey(Integer id){
        return orderDetailMapper.deleteByPrimaryKey(id);
    }
    public int insert(OrderDetail record){
        return  orderDetailMapper.insert(record);
    }
    public int insertSelective(OrderDetail record){
        return orderDetailMapper.insertSelective(record);
    }
    public OrderDetail selectByPrimaryKey(Integer id){
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(OrderDetail record){
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderDetail record){
        return orderDetailMapper.updateByPrimaryKey(record);
    }

    public List<OrderDetail> findAll(){
        return orderDetailMapper.findAll();
    }

    public int updateDeleteFlagByPrimaryKey(Integer id){
        return orderDetailMapper.updateDeleteFlagByPrimaryKey(id);}
}

