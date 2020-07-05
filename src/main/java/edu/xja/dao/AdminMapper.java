package edu.xja.dao;

import edu.xja.domain.Admin;
/**
 * @project: aomaomanage
 * @description: 控制层：管理员
 * @author: dell
 * @date: 2020/7/4 - 22:38
 * @version: 1.0
 * @website:
 */
public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);


    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    //修改管理员密码
    int updateByPrimaryKey(Admin record);

    //查询管理员是否存在
    Admin selectByAccountAndPass(String adminAccount,String adminPass);

    Admin selectByAccount(String adminAccount);
}