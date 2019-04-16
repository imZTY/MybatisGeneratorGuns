package com.entity;

import java.io.Serializable;
import java.util.Date;

public class ProManage implements Serializable {
    private String id;

    private String productsId;

    private String companyId;

    private String typeSource;

    private String proNo;

    private String name;

    private String catalog;

    private String model;

    private String reason;

    private String keyword;

    private String start;

    private String state;

    private String groupsId;

    private String subaccountId;

    private String img;

    private String hotsaleFlag;

    private String customsNo;

    private Float taxCost;

    private String costQuaUnit;

    private String costCurrency;

    private String offShoreCurrency;

    private String offShoreQuaUnit;

    private Float offShoreMinPrice;

    private Float offShoreMaxPrice;

    private Float minOrderQuantity;

    private String minOrderUnit;

    private String pageUnit;

    private Float perPageNum;

    private Float perPage;

    private Float perWeight;

    private String pgDescription;

    private String proDescription;

    private String proUrl;

    private String attachKey;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId == null ? null : productsId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getTypeSource() {
        return typeSource;
    }

    public void setTypeSource(String typeSource) {
        this.typeSource = typeSource == null ? null : typeSource.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(String groupsId) {
        this.groupsId = groupsId == null ? null : groupsId.trim();
    }

    public String getSubaccountId() {
        return subaccountId;
    }

    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId == null ? null : subaccountId.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getHotsaleFlag() {
        return hotsaleFlag;
    }

    public void setHotsaleFlag(String hotsaleFlag) {
        this.hotsaleFlag = hotsaleFlag == null ? null : hotsaleFlag.trim();
    }

    public String getCustomsNo() {
        return customsNo;
    }

    public void setCustomsNo(String customsNo) {
        this.customsNo = customsNo == null ? null : customsNo.trim();
    }

    public Float getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(Float taxCost) {
        this.taxCost = taxCost;
    }

    public String getCostQuaUnit() {
        return costQuaUnit;
    }

    public void setCostQuaUnit(String costQuaUnit) {
        this.costQuaUnit = costQuaUnit == null ? null : costQuaUnit.trim();
    }

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency == null ? null : costCurrency.trim();
    }

    public String getOffShoreCurrency() {
        return offShoreCurrency;
    }

    public void setOffShoreCurrency(String offShoreCurrency) {
        this.offShoreCurrency = offShoreCurrency == null ? null : offShoreCurrency.trim();
    }

    public String getOffShoreQuaUnit() {
        return offShoreQuaUnit;
    }

    public void setOffShoreQuaUnit(String offShoreQuaUnit) {
        this.offShoreQuaUnit = offShoreQuaUnit == null ? null : offShoreQuaUnit.trim();
    }

    public Float getOffShoreMinPrice() {
        return offShoreMinPrice;
    }

    public void setOffShoreMinPrice(Float offShoreMinPrice) {
        this.offShoreMinPrice = offShoreMinPrice;
    }

    public Float getOffShoreMaxPrice() {
        return offShoreMaxPrice;
    }

    public void setOffShoreMaxPrice(Float offShoreMaxPrice) {
        this.offShoreMaxPrice = offShoreMaxPrice;
    }

    public Float getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(Float minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public String getMinOrderUnit() {
        return minOrderUnit;
    }

    public void setMinOrderUnit(String minOrderUnit) {
        this.minOrderUnit = minOrderUnit == null ? null : minOrderUnit.trim();
    }

    public String getPageUnit() {
        return pageUnit;
    }

    public void setPageUnit(String pageUnit) {
        this.pageUnit = pageUnit == null ? null : pageUnit.trim();
    }

    public Float getPerPageNum() {
        return perPageNum;
    }

    public void setPerPageNum(Float perPageNum) {
        this.perPageNum = perPageNum;
    }

    public Float getPerPage() {
        return perPage;
    }

    public void setPerPage(Float perPage) {
        this.perPage = perPage;
    }

    public Float getPerWeight() {
        return perWeight;
    }

    public void setPerWeight(Float perWeight) {
        this.perWeight = perWeight;
    }

    public String getPgDescription() {
        return pgDescription;
    }

    public void setPgDescription(String pgDescription) {
        this.pgDescription = pgDescription == null ? null : pgDescription.trim();
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription == null ? null : proDescription.trim();
    }

    public String getProUrl() {
        return proUrl;
    }

    public void setProUrl(String proUrl) {
        this.proUrl = proUrl == null ? null : proUrl.trim();
    }

    public String getAttachKey() {
        return attachKey;
    }

    public void setAttachKey(String attachKey) {
        this.attachKey = attachKey == null ? null : attachKey.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}