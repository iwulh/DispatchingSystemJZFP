package com.yhzhcs.dispatchingsystemjzfp.bean;

import java.io.Serializable;

/**
 * Auto-generated: 2018-01-30 15:52:27
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Datas implements Serializable{

    private String content;
    private String createdBy;
    private Createddate createdDate;
    private String departmentId;
    private String departmentName;
    private int enabledFlag;
    private String id;
    private String imgPath;
    private String lastUpdatedBy;
    private String lastUpdatedDate;
    private String massageType;
    private String phone;
    private String place;
    private String plantArea;
    private double price;
    private String produceType;
    private String ramake;
    private String title;
    private String variety;

    public String getContent() {
        return content;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Createddate getCreatedDate() {
        return createdDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getEnabledFlag() {
        return enabledFlag;
    }

    public String getId() {
        return id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public String getMassageType() {
        return massageType;
    }

    public String getPhone() {
        return phone;
    }

    public String getPlace() {
        return place;
    }

    public String getPlantArea() {
        return plantArea;
    }

    public double getPrice() {
        return price;
    }

    public String getProduceType() {
        return produceType;
    }

    public String getRamake() {
        return ramake;
    }

    public String getTitle() {
        return title;
    }

    public String getVariety() {
        return variety;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Createddate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEnabledFlag(int enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void setMassageType(String massageType) {
        this.massageType = massageType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPlantArea(String plantArea) {
        this.plantArea = plantArea;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduceType(String produceType) {
        this.produceType = produceType;
    }

    public void setRamake(String ramake) {
        this.ramake = ramake;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "content='" + content + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", enabledFlag=" + enabledFlag +
                ", id='" + id + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", massageType='" + massageType + '\'' +
                ", phone='" + phone + '\'' +
                ", place='" + place + '\'' +
                ", plantArea='" + plantArea + '\'' +
                ", price=" + price +
                ", produceType='" + produceType + '\'' +
                ", ramake='" + ramake + '\'' +
                ", title='" + title + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}