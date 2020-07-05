package edu.xja.dao;

import edu.xja.domain.UserInfo;

import java.util.List;

///**
// * @description: 会员信息表，数据访问层
// * @date: 2020/6/30 - 10:42
// */
public interface UserInfoMapper {
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