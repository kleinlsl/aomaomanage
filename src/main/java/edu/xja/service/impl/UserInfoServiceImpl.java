package edu.xja.service.impl;

import edu.xja.dao.UserInfoMapper;
import edu.xja.domain.UserInfo;
import edu.xja.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: aomaomanage
 * @description: 业务层实现类：会员信息
 * @author: dell
 * @date: 2020/6/30 - 14:25
 * @version: 1.0
 * @website:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    public int deleteByPrimaryKey(Integer id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    public UserInfo selectByPrimaryKey(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }

    public UserInfo findByUserName(String username) {
        return userInfoMapper.findByUserName(username);
    }

    public int updateDeleteFlagByPrimaryKey(Integer id) {
        return userInfoMapper.updateDeleteFlagByPrimaryKey(id);
    }
}
