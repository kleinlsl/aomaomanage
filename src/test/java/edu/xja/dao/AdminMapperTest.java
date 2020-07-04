package edu.xja.dao;

import edu.xja.BaseTest;
import edu.xja.domain.Admin;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/7/3 - 22:45
 * @version: 1.0
 * @website:
 */
public class AdminMapperTest extends BaseTest {
    @Resource
    private AdminMapper adminMapper;
    @Test
    public void selectByAccountAndPass() {
        Admin admin=adminMapper.selectByAccountAndPass("admin","ad");
        Assert.assertNull(admin);
        admin=adminMapper.selectByAccountAndPass("admin","admin");
        System.out.println(admin);
        Assert.assertNotNull(admin);
    }
}