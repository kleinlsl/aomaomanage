package edu.xja.domain;

import lombok.Data;

import java.util.Date;
@Data
public class ProductInfo {
    private Integer id;

    private String code;

    private String name;

    private Integer tId;

    private Integer num;

    private Long price;

    private Integer status;

    private Date createTime;

    private String creator;

    private Date operateTime;

    private String operator;

    private Byte deleteFlag;

    private String intro;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code == null ? null : code.trim();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name == null ? null : name.trim();
//    }
//
//    public Integer gettId() {
//        return tId;
//    }
//
//    public void settId(Integer tId) {
//        this.tId = tId;
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
//    public Long getPrice() {
//        return price;
//    }
//
//    public void setPrice(Long price) {
//        this.price = price;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
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
//
//    public String getIntro() {
//        return intro;
//    }
//
//    public void setIntro(String intro) {
//        this.intro = intro == null ? null : intro.trim();
//    }
}