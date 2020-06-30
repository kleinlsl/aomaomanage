package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.UserInfo;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @project: aomaomanage
 * @description: 单元测试：会员信息表数据访问层
 * @author: dell
 * @date: 2020/6/30 - 13:17
 * @version: 1.0
 * @website:
 */
public class UserInfoMapperTest extends BaseTest {
    @Resource
    UserInfoMapper userInfoMapper;
    @Test
    public void deleteByPrimaryKey() {
        int res=userInfoMapper.deleteByPrimaryKey(2);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insert() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("user001");
        userInfo.setPassword("user001");
        userInfo.setRealName("张三");
        userInfo.setNickName("zs");
//        userInfo.setSex("男");
        userInfo.setCreator("admin");
        int res=userInfoMapper.insert(userInfo);
        Assert.assertNotNull(res);
    }

    @Test
    public void insertSelective() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("user002");
        userInfo.setPassword("user002");
        userInfo.setRealName("李四");
        userInfo.setNickName("ls");
//        userInfo.setSex("男");
        userInfo.setCreator("admin");
        int res=userInfoMapper.insertSelective(userInfo);
        Assert.assertNotNull(res);
    }

    @Test
    public void selectByPrimaryKey() {
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(1);
        Assert.assertNotNull(userInfo);
        System.out.println(userInfo);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(3);
//        userInfo.setUserName("user003");
//        userInfo.setPassword("user003");
        userInfo.setDeleteFlag((byte) 1);
        System.out.println(userInfo);
        int res=userInfoMapper.updateByPrimaryKeySelective(userInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(3);
        userInfo.setUserName("user003");
        userInfo.setPassword("user003");
        System.out.println(userInfo);
        int res=userInfoMapper.updateByPrimaryKey(userInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<UserInfo> userInfos = userInfoMapper.findAll();
        Assert.assertNotNull(userInfos);
        for (UserInfo u:userInfos
             ) {
            System.out.println(u);
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = userInfoMapper.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findByUserName() {
        UserInfo userInfo=userInfoMapper.findByUserName("user002");
        Assert.assertNotNull(userInfo);
        System.out.println(userInfo);
    }
}