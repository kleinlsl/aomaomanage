package edu.xja.dao;

import edu.xja.domain.Admin;

/**
 * @description: 管理员表，数据访问层
 * @date: 2020/7/4
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
}