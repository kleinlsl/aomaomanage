package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.UserComment;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;


public class UserCommentMapperTest extends BaseTest {

    @Resource
    private UserCommentMapper userCommentMapper;

    @Test
    public void deleteByPrimaryKey() {
        int res=userCommentMapper.deleteByPrimaryKey(1);
        Assert.assertTrue(res==0);
        Assert.assertNotNull(res);
    }

    @Test
    public void insert() {
        UserComment userComment=new UserComment();
        userComment.setCommentDetail("测试信息1");
        userComment.setCreator("admin");
        userComment.setUId(1);

        int ress=userCommentMapper.insert(userComment);
        Assert.assertNotNull(ress);
        Assert.assertTrue(ress==1);

    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void findAll() {
        List<UserComment> userCommentList=userCommentMapper.findAll();
        Assert.assertNotNull(userCommentList);
        if(userCommentList.size()>0){
            for (UserComment use:userCommentList
            ) {
                System.out.println(use);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = userCommentMapper.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }
}