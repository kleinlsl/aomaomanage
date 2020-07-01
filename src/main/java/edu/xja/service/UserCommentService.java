package edu.xja.service;


import edu.xja.domain.UserComment;

import java.util.List;

/**
 * @project: aomaomanage
 * @description:会员留言表
 * @author:
 * @date: 2020/7/1
 * @version: 1.0
 * @website:
 */
public interface UserCommentService {
    //TODO: 2020/7/1 通过主键删除留言信息（物理删除）
    int deleteByPrimaryKey(Integer id);

    //TODO: 2020/7/1 添加留言信息  会员用户使用
    int insert(UserComment record);

    //TODO: 2020/7/1 选择性添加留言信息
    int insertSelective(UserComment record);

    // TODO: 2020/7/1 通过主键查找留言信息
    UserComment selectByPrimaryKey(Integer id);

    // TODO: 2020/7/1 通过主键选择性修改留言信息
    int updateByPrimaryKeySelective(UserComment record);

    // TODO: 2020/7/1 通过主键修改留言信息（包含留言内容）
    int updateByPrimaryKeyWithBLOBs(UserComment record);

    int updateByPrimaryKey(UserComment record);

    // TODO: 2020/7/1 查找所有留言信息
    List<UserComment> findAll();

    // TODO: 2020/7/1 通过主键删除留言信息（逻辑删除）
    int updateDeleteFlagByPrimaryKey(Integer id);
}
