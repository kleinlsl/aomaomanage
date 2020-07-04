package edu.xja.service.impl;

import edu.xja.dao.AdminMapper;
import edu.xja.domain.Admin;
import edu.xja.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/7/3 - 22:55
 * @version: 1.0
 * @website:
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    public Admin selectByAccountAndPass(String adminAccount, String adminPass) {
        return adminMapper.selectByAccountAndPass(adminAccount,adminPass);
    }
}
