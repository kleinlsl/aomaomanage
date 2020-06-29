package edu.xja.domain;

import lombok.Data;

import java.util.Date;
@Data
public class OrderDetail {
    private Integer id;

    private Integer oId;

    private Integer pId;

    private Integer num;

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
//    public Integer getoId() {
//        return oId;
//    }
//
//    public void setoId(Integer oId) {
//        this.oId = oId;
//    }
//
//    public Integer getpId() {
//        return pId;
//    }
//
//    public void setpId(Integer pId) {
//        this.pId = pId;
//    }
//
//    public Integer getNum() {
//        return num;
//    }
//
//    public void setNum(Integer num) {
//        this.num = num;
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