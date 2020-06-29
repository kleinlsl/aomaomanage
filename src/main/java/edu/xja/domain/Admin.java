package edu.xja.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Admin {
    private Integer id;

    private String adminAccount;

    private String adminPass;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Byte deleteFlag;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAdminAccount() {
//        return adminAccount;
//    }
//
//    public void setAdminAccount(String adminAccount) {
//        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
//    }
//
//    public String getAdminPass() {
//        return adminPass;
//    }
//
//    public void setAdminPass(String adminPass) {
//        this.adminPass = adminPass == null ? null : adminPass.trim();
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public String getCreator() {
//        return creator;
//    }
//
//    public void setCreator(String creator) {
//        this.creator = creator == null ? null : creator.trim();
//    }
//
//    public Date getOperateTime() {
//        return operateTime;
//    }
//
//    public void setOperateTime(Date operateTime) {
//        this.operateTime = operateTime;
//    }
//
//    public String getOperator() {
//        return operator;
//    }
//
//    public void setOperator(String operator) {
//        this.operator = operator == null ? null : operator.trim();
//    }
//
//    public Byte getDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(Byte deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }
}