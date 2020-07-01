package edu.xja.dao;

import edu.xja.domain.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {

    //TODO: 2020/6/30 通过主键删除订单明细信息（物理删除）
    int deleteByPrimaryKey(Integer id);

    //TODO: 2020/6/30 添加订单明细信息
    int insert(OrderDetail record);

    //TODO: 2020/6/30 选择性添加订单明细信息
    int insertSelective(OrderDetail record);

    // TODO: 2020/6/30 通过主键查找订单明细信息
    OrderDetail selectByPrimaryKey(Integer id);

    // TODO: 2020/6/30 通过主键选择性修改订单明细信息
    int updateByPrimaryKeySelective(OrderDetail record);

    // TODO: 2020/6/30 通过主键修改订单明细信息（包含订单内容）
    int updateByPrimaryKey(OrderDetail record);

    // TODO: 2020/6/30 查找所有订单明细信息
    List<OrderDetail> findAll();

    // TODO: 2020/6/30 通过主键删除订单明细信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);
}