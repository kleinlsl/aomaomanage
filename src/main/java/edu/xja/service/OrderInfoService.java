package edu.xja.service;

import edu.xja.domain.OrderInfo;

import java.util.List;

/**
 * @project: aomaomanage
 * @description:订单表
 * @author:
 * @date: 2020/7/1
 * @version: 1.0
 * @website:
 */
public interface OrderInfoService {//TODO: 2020/6/30 通过主键删除订单信息（物理删除）
    int deleteByPrimaryKey(Integer id);

    //TODO: 2020/7/1 添加订单信息
    int insert(OrderInfo record);

    //TODO: 2020/7/1 选择性添加订单信息
    int insertSelective(OrderInfo record);

    // TODO: 2020/7/1 通过主键查找订单信息
    OrderInfo selectByPrimaryKey(Integer id);

    // TODO: 2020/7/1 通过主键选择性修改订单信息
    int updateByPrimaryKeySelective(OrderInfo record);

    // TODO: 2020/7/1 通过主键修改订单信息（包含订单内容）
    int updateByPrimaryKey(OrderInfo record);

    // TODO:2020/7/1 查找所有订单信息
    List<OrderInfo> findAll();

    // TODO: 2020/7/1 通过主键删除订单信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);
}
