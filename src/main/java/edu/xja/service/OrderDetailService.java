package edu.xja.service;

import edu.xja.domain.OrderDetail;
import edu.xja.domain.OrderInfo;

import java.util.List;

public interface OrderDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    List<OrderDetail> findAll();

    int updateDeleteFlagByPrimaryKey(Integer id);


}
