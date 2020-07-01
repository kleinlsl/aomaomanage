package edu.xja.service.impl;

import edu.xja.dao.OrderInfoMapper;
import edu.xja.domain.OrderInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description:订单表
 * @author:
 * @date: 2020/7/1
 * @version: 1.0
 * @website:
 */
@Service
public class OrderInfoServiceImpl {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    public int deleteByPrimaryKey(Integer id){
        return orderInfoMapper.deleteByPrimaryKey(id);
    }
    public int insert(OrderInfo record){
        return  orderInfoMapper.insert(record);
    }
    public int insertSelective(OrderInfo record){
        return orderInfoMapper.insertSelective(record);
    }
    public OrderInfo selectByPrimaryKey(Integer id){
        return orderInfoMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(OrderInfo record){
        return orderInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderInfo record){
        return orderInfoMapper.updateByPrimaryKey(record);
    }

    public List<OrderInfo> findAll(){
        return orderInfoMapper.findAll();
    }

    public int updateDeleteFlagByPrimaryKey(Integer id){
        return orderInfoMapper.updateDeleteFlagByPrimaryKey(id);
    }
}
