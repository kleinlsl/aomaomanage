package edu.xja.service;

import edu.xja.domain.UserInfo;

import java.util.List;

/**
 * @project: aomaomanage
 * @description: 业务层：会员信息表
 * @author: dell
 * @date: 2020/6/30 - 14:20
 * @version: 1.0
 * @website:
 */
public interface UserInfoService {
    // TODO: 2020/6/30 通过主键删除会员信息(物理删除)
    int deleteByPrimaryKey(Integer id);

    // TODO: 2020/6/30 添加会员信息
    int insert(UserInfo record);

    // TODO: 2020/6/30 选择性添加会员信息
    int insertSelective(UserInfo record);

    // TODO: 2020/6/30 通过主键查找会员信息
    UserInfo selectByPrimaryKey(Integer id);

    // TODO: 2020/6/30 通过主键选择性更新会员信息
    int updateByPrimaryKeySelective(UserInfo record);

    // TODO: 2020/6/30 通过主键更新会员信息
    int updateByPrimaryKey(UserInfo record);

    // TODO: 2020/6/30 查找所有会员信息
    List<UserInfo> findAll();

    // TODO: 2020/6/30 通过登录名查找用户
    UserInfo findByUserName(String username);

    // TODO: 2020/6/30 通过主键删除会员信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);
}
