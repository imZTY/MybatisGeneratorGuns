package com.entity;

import java.io.Serializable;
import java.util.Date;

public class ProManageHisVersion implements Serializable {
    private String id;

    private String proid;

    private String productsId;

    private String companyId;

    private String typeSource;

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

    private String attachkey;

    private String customsno;

    private Float taxcost;

    private String costquaunit;

    private String costcurrency;

    private String offshorecurrency;

    private String offshorequaunit;

    private Float offshoreminprice;

    private Float offshoremaxprice;

    private Float minorderquantity;

    private String minorderunit;

    private String pageunit;

    private Float perpagenum;

    private Float perpage;

    private Float perweight;

    private String pagedescription;

    private String prodescription;

    private String prourl;

    private Integer version;

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

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
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

    public String getAttachkey() {
        return attachkey;
    }

    public void setAttachkey(String attachkey) {
        this.attachkey = attachkey == null ? null : attachkey.trim();
    }

    public String getCustomsno() {
        return customsno;
    }

    public void setCustomsno(String customsno) {
        this.customsno = customsno == null ? null : customsno.trim();
    }

    public Float getTaxcost() {
        return taxcost;
    }

    public void setTaxcost(Float taxcost) {
        this.taxcost = taxcost;
    }

    public String getCostquaunit() {
        return costquaunit;
    }

    public void setCostquaunit(String costquaunit) {
        this.costquaunit = costquaunit == null ? null : costquaunit.trim();
    }

    public String getCostcurrency() {
        return costcurrency;
    }

    public void setCostcurrency(String costcurrency) {
        this.costcurrency = costcurrency == null ? null : costcurrency.trim();
    }

    public String getOffshorecurrency() {
        return offshorecurrency;
    }

    public void setOffshorecurrency(String offshorecurrency) {
        this.offshorecurrency = offshorecurrency == null ? null : offshorecurrency.trim();
    }

    public String getOffshorequaunit() {
        return offshorequaunit;
    }

    public void setOffshorequaunit(String offshorequaunit) {
        this.offshorequaunit = offshorequaunit == null ? null : offshorequaunit.trim();
    }

    public Float getOffshoreminprice() {
        return offshoreminprice;
    }

    public void setOffshoreminprice(Float offshoreminprice) {
        this.offshoreminprice = offshoreminprice;
    }

    public Float getOffshoremaxprice() {
        return offshoremaxprice;
    }

    public void setOffshoremaxprice(Float offshoremaxprice) {
        this.offshoremaxprice = offshoremaxprice;
    }

    public Float getMinorderquantity() {
        return minorderquantity;
    }

    public void setMinorderquantity(Float minorderquantity) {
        this.minorderquantity = minorderquantity;
    }

    public String getMinorderunit() {
        return minorderunit;
    }

    public void setMinorderunit(String minorderunit) {
        this.minorderunit = minorderunit == null ? null : minorderunit.trim();
    }

    public String getPageunit() {
        return pageunit;
    }

    public void setPageunit(String pageunit) {
        this.pageunit = pageunit == null ? null : pageunit.trim();
    }

    public Float getPerpagenum() {
        return perpagenum;
    }

    public void setPerpagenum(Float perpagenum) {
        this.perpagenum = perpagenum;
    }

    public Float getPerpage() {
        return perpage;
    }

    public void setPerpage(Float perpage) {
        this.perpage = perpage;
    }

    public Float getPerweight() {
        return perweight;
    }

    public void setPerweight(Float perweight) {
        this.perweight = perweight;
    }

    public String getPagedescription() {
        return pagedescription;
    }

    public void setPagedescription(String pagedescription) {
        this.pagedescription = pagedescription == null ? null : pagedescription.trim();
    }

    public String getProdescription() {
        return prodescription;
    }

    public void setProdescription(String prodescription) {
        this.prodescription = prodescription == null ? null : prodescription.trim();
    }

    public String getProurl() {
        return prourl;
    }

    public void setProurl(String prourl) {
        this.prourl = prourl == null ? null : prourl.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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