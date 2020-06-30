package edu.xja.service;

import edu.xja.BaseTest;
import edu.xja.dao.UserInfoMapper;
import edu.xja.domain.UserInfo;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/6/30 - 14:29
 * @version: 1.0
 * @website:
 */
public class UserInfoServiceTest extends BaseTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void deleteByPrimaryKey() {
        int res=userInfoService.deleteByPrimaryKey(2);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==0);
    }

    @Test
    public void insert() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("service-user001");
        userInfo.setPassword("service-user001");
        userInfo.setRealName("service-张三");
        userInfo.setNickName("service-zs");
        userInfo.setCreator("admin");
        int res=userInfoService.insert(userInfo);
        Assert.assertNotNull(res);
    }

    @Test
    public void insertSelective() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("service-user002");
        userInfo.setPassword("service-user002");
        userInfo.setRealName("service-李四");
        userInfo.setNickName("service-ls");
//        userInfo.setSex("男");
        userInfo.setCreator("admin");
        int res=userInfoService.insertSelective(userInfo);
        Assert.assertNotNull(res);
    }

    @Test
    public void selectByPrimaryKey() {
        UserInfo userInfo=userInfoService.selectByPrimaryKey(4);
        Assert.assertNotNull(userInfo);
        System.out.println(userInfo);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        UserInfo userInfo=userInfoService.selectByPrimaryKey(4);
//        userInfo.setUserName("user003");
//        userInfo.setPassword("user003");
        userInfo.setDeleteFlag((byte) 1);
        System.out.println(userInfo);
        int res=userInfoService.updateByPrimaryKeySelective(userInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        UserInfo userInfo=userInfoService.selectByPrimaryKey(4);
        userInfo.setUserName("service-user003");
        userInfo.setPassword("service-user003");
        System.out.println(userInfo);
        int res=userInfoService.updateByPrimaryKey(userInfo);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<UserInfo> userInfos = userInfoService.findAll();
        Assert.assertNotNull(userInfos);
        for (UserInfo u:userInfos
        ) {
            System.out.println(u);
        }
    }

    @Test
    public void findByUserName() {
        UserInfo userInfo=userInfoService.findByUserName("user002");
        Assert.assertNotNull(userInfo);
        System.out.println(userInfo);
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = userInfoService.updateDeleteFlagByPrimaryKey(5);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }
}