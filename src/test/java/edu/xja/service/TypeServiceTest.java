package edu.xja.service;

import edu.xja.BaseTest;
import edu.xja.domain.Type;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/6/30 - 15:30
 * @version: 1.0
 * @website:
 */
public class TypeServiceTest extends BaseTest {
    @Resource
    private TypeService typeService;

    @Test
    public void deleteByPrimaryKey() {
        int res = typeService.deleteByPrimaryKey(3);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==0);
    }

    @Test
    public void insert() {
        Type type=new Type();
        type.setName("手机");
        type.setCreator("admin");

        int res = typeService.insert(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        Type type=new Type();
        type.setName("service-冰箱");
        type.setCreator("admin");
        int res=typeService.insertSelective(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        Type type=typeService.selectByPrimaryKey(1);
        System.out.println(type);
        Assert.assertNotNull(type);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Type type=typeService.selectByPrimaryKey(2);
        System.out.println(type);
        type.setDeleteFlag((byte) 1);
        type.setOperator("admin");
        int res=typeService.updateByPrimaryKeySelective(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        Type type=typeService.selectByPrimaryKey(1);
        System.out.println(type);
        type.setDeleteFlag(new Byte((byte) 1));
        type.setOperator("admin");
        int res=typeService.updateByPrimaryKey(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<Type> typeList=typeService.findAll();
        Assert.assertNotNull(typeList);
        if (typeList.size()>0){
            for (Type type :typeList) {
                System.out.println(type);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = typeService.updateDeleteFlagByPrimaryKey(4);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }
}