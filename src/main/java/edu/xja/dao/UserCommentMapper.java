package edu.xja.dao;

import edu.xja.domain.UserComment;

import java.util.List;

///**
// * @description: 会员留言表，数据访问层
// * @date: 2020/6/30 - 17.59
// */
public interface UserCommentMapper {

    //TODO: 2020/6/30 通过主键删除留言信息（物理删除）
    int deleteByPrimaryKey(Integer id);

    //TODO: 2020/6/30 添加留言信息  会员用户使用
    int insert(UserComment record);

    //TODO: 2020/6/30 选择性添加留言信息
    int insertSelective(UserComment record);

    // TODO: 2020/6/30 通过主键查找留言信息
    UserComment selectByPrimaryKey(Integer id);

    // TODO: 2020/6/30 通过主键选择性修改留言信息
    int updateByPrimaryKeySelective(UserComment record);

    // TODO: 2020/6/30 通过主键修改留言信息（包含留言内容）
    int updateByPrimaryKeyWithBLOBs(UserComment record);

    int updateByPrimaryKey(UserComment record);

    // TODO: 2020/6/30 查找所有留言信息
    List<UserComment> findAll();

    // TODO: 2020/6/30 通过主键删除留言信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);
}