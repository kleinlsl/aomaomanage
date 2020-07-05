package edu.xja.service;

import edu.xja.domain.Admin;

/**
 * @project: aomaomanage
 * @description:
 * @author: dell
 * @date: 2020/7/3 - 22:54
 * @version: 1.0
 * @website:
 */
public interface AdminService {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin selectByAccountAndPass(String adminAccount, String adminPass);

    Admin selectByAccount(String adminAccount);
}
