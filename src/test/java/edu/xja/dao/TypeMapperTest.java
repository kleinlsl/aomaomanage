package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.Type;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;



/**
 * @project: aomaomanage
 * @description: 单元测试：商品类型表数据访问层
 * @author: dell
 * @date: 2020/6/29 - 19:42
 * @version: 1.0
 * @website:
 */
public class TypeMapperTest extends BaseTest {
    @Resource
    private TypeMapper typeMapper;

    @Test
    public void deleteByPrimaryKey() {
        int res = typeMapper.deleteByPrimaryKey(3);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==0);
    }

    @Test
    public void insert() {
        Type type=new Type();
        type.setName("电视");
        type.setCreator("admin");

        int res = typeMapper.insert(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void insertSelective() {
        Type type=new Type();
        type.setName("冰箱");
        type.setCreator("admin");
        int res=typeMapper.insertSelective(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void selectByPrimaryKey() {
        Type type=typeMapper.selectByPrimaryKey(1);
        System.out.println(type);
        Assert.assertNotNull(type);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Type type=typeMapper.selectByPrimaryKey(2);
        System.out.println(type);
        type.setDeleteFlag((byte) 1);
        type.setOperator("admin");
        int res=typeMapper.updateByPrimaryKeySelective(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void updateByPrimaryKey() {
        Type type=typeMapper.selectByPrimaryKey(1);
        System.out.println(type);
        type.setDeleteFlag(new Byte((byte) 1));
        type.setOperator("admin");
        int res=typeMapper.updateByPrimaryKey(type);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void findAll() {
        List<Type> typeList=typeMapper.findAll();
        Assert.assertNotNull(typeList);
        if (typeList.size()>0){
            for (Type type :typeList) {
                System.out.println(type);
            }
        }
    }

    @Test
    public void updateDeleteFlagByPrimaryKey() {
        int res = typeMapper.updateDeleteFlagByPrimaryKey(1);
        Assert.assertNotNull(res);
        Assert.assertTrue(res==1);
    }

    @Test
    public void search() {
        List<Type> typeList=typeMapper.search("");
        Assert.assertNotNull(typeList);
        for (Type t:typeList
             ) {
            System.out.println(t);
        }
    }
}