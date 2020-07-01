package edu.xja.service.impl;

import edu.xja.dao.UserCommentMapper;
import edu.xja.domain.UserComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description:会员留言表
 * @author:
 * @date: 2020/7/1
 * @version: 1.0
 * @website:
 */
@Service
public class UserCommentImpl {

    @Resource
    private UserCommentMapper userCommentMapper;
    public int deleteByPrimaryKey(Integer id){
        return userCommentMapper.deleteByPrimaryKey(id);
    }
    public int insert(UserComment record){
        return userCommentMapper.insert(record);
    }
    public UserComment selectByPrimaryKey(Integer id){
        return userCommentMapper.selectByPrimaryKey(id);
    }

    public List<UserComment> findAll() {
        return userCommentMapper.findAll();
    }
    public int updateDeleteFlagByPrimaryKey(Integer id){
        return userCommentMapper.updateDeleteFlagByPrimaryKey(id);
    }
}
