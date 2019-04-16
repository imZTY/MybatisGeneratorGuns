package com.entity;

import java.io.Serializable;
import java.util.Date;

public class ProManageProperty implements Serializable {
    private String id;

    private String proManageId;

    private String price;

    private String volume;

    private String minPrice;

    private String topPrice;

    private String minOrder;

    private String proUnit;

    private String title;

    private String attrId;

    private String stock;

    private String brandName;

    private String sizeLong;

    private String sizeWide;

    private String sizeHigh;

    private String unitSize;

    private String weightNum;

    private String unitWeight;

    private String originCountry;

    private String certifications;

    private String port;

    private String payway;

    private String market;

    private String hotPeriod;

    private String lowPeriod;

    private String productive;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private String delFlag;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProManageId() {
        return proManageId;
    }

    public void setProManageId(String proManageId) {
        this.proManageId = proManageId == null ? null : proManageId.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice == null ? null : minPrice.trim();
    }

    public String getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(String topPrice) {
        this.topPrice = topPrice == null ? null : topPrice.trim();
    }

    public String getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(String minOrder) {
        this.minOrder = minOrder == null ? null : minOrder.trim();
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit == null ? null : proUnit.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId == null ? null : attrId.trim();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getSizeLong() {
        return sizeLong;
    }

    public void setSizeLong(String sizeLong) {
        this.sizeLong = sizeLong == null ? null : sizeLong.trim();
    }

    public String getSizeWide() {
        return sizeWide;
    }

    public void setSizeWide(String sizeWide) {
        this.sizeWide = sizeWide == null ? null : sizeWide.trim();
    }

    public String getSizeHigh() {
        return sizeHigh;
    }

    public void setSizeHigh(String sizeHigh) {
        this.sizeHigh = sizeHigh == null ? null : sizeHigh.trim();
    }

    public String getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(String unitSize) {
        this.unitSize = unitSize == null ? null : unitSize.trim();
    }

    public String getWeightNum() {
        return weightNum;
    }

    public void setWeightNum(String weightNum) {
        this.weightNum = weightNum == null ? null : weightNum.trim();
    }

    public String getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(String unitWeight) {
        this.unitWeight = unitWeight == null ? null : unitWeight.trim();
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry == null ? null : originCountry.trim();
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications == null ? null : certifications.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market == null ? null : market.trim();
    }

    public String getHotPeriod() {
        return hotPeriod;
    }

    public void setHotPeriod(String hotPeriod) {
        this.hotPeriod = hotPeriod == null ? null : hotPeriod.trim();
    }

    public String getLowPeriod() {
        return lowPeriod;
    }

    public void setLowPeriod(String lowPeriod) {
        this.lowPeriod = lowPeriod == null ? null : lowPeriod.trim();
    }

    public String getProductive() {
        return productive;
    }

    public void setProductive(String productive) {
        this.productive = productive == null ? null : productive.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}