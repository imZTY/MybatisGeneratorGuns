package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProManagePropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProManagePropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProManageIdIsNull() {
            addCriterion("pro_manage_id is null");
            return (Criteria) this;
        }

        public Criteria andProManageIdIsNotNull() {
            addCriterion("pro_manage_id is not null");
            return (Criteria) this;
        }

        public Criteria andProManageIdEqualTo(String value) {
            addCriterion("pro_manage_id =", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdNotEqualTo(String value) {
            addCriterion("pro_manage_id <>", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdGreaterThan(String value) {
            addCriterion("pro_manage_id >", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_manage_id >=", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdLessThan(String value) {
            addCriterion("pro_manage_id <", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdLessThanOrEqualTo(String value) {
            addCriterion("pro_manage_id <=", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdLike(String value) {
            addCriterion("pro_manage_id like", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdNotLike(String value) {
            addCriterion("pro_manage_id not like", value, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdIn(List<String> values) {
            addCriterion("pro_manage_id in", values, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdNotIn(List<String> values) {
            addCriterion("pro_manage_id not in", values, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdBetween(String value1, String value2) {
            addCriterion("pro_manage_id between", value1, value2, "proManageId");
            return (Criteria) this;
        }

        public Criteria andProManageIdNotBetween(String value1, String value2) {
            addCriterion("pro_manage_id not between", value1, value2, "proManageId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(String value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(String value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(String value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(String value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(String value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(String value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLike(String value) {
            addCriterion("min_price like", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotLike(String value) {
            addCriterion("min_price not like", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<String> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<String> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(String value1, String value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(String value1, String value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNull() {
            addCriterion("top_price is null");
            return (Criteria) this;
        }

        public Criteria andTopPriceIsNotNull() {
            addCriterion("top_price is not null");
            return (Criteria) this;
        }

        public Criteria andTopPriceEqualTo(String value) {
            addCriterion("top_price =", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotEqualTo(String value) {
            addCriterion("top_price <>", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThan(String value) {
            addCriterion("top_price >", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceGreaterThanOrEqualTo(String value) {
            addCriterion("top_price >=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThan(String value) {
            addCriterion("top_price <", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLessThanOrEqualTo(String value) {
            addCriterion("top_price <=", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceLike(String value) {
            addCriterion("top_price like", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotLike(String value) {
            addCriterion("top_price not like", value, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceIn(List<String> values) {
            addCriterion("top_price in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotIn(List<String> values) {
            addCriterion("top_price not in", values, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceBetween(String value1, String value2) {
            addCriterion("top_price between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andTopPriceNotBetween(String value1, String value2) {
            addCriterion("top_price not between", value1, value2, "topPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderIsNull() {
            addCriterion("min_order is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderIsNotNull() {
            addCriterion("min_order is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderEqualTo(String value) {
            addCriterion("min_order =", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderNotEqualTo(String value) {
            addCriterion("min_order <>", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderGreaterThan(String value) {
            addCriterion("min_order >", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderGreaterThanOrEqualTo(String value) {
            addCriterion("min_order >=", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderLessThan(String value) {
            addCriterion("min_order <", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderLessThanOrEqualTo(String value) {
            addCriterion("min_order <=", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderLike(String value) {
            addCriterion("min_order like", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderNotLike(String value) {
            addCriterion("min_order not like", value, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderIn(List<String> values) {
            addCriterion("min_order in", values, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderNotIn(List<String> values) {
            addCriterion("min_order not in", values, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderBetween(String value1, String value2) {
            addCriterion("min_order between", value1, value2, "minOrder");
            return (Criteria) this;
        }

        public Criteria andMinOrderNotBetween(String value1, String value2) {
            addCriterion("min_order not between", value1, value2, "minOrder");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNull() {
            addCriterion("pro_unit is null");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNotNull() {
            addCriterion("pro_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProUnitEqualTo(String value) {
            addCriterion("pro_unit =", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotEqualTo(String value) {
            addCriterion("pro_unit <>", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThan(String value) {
            addCriterion("pro_unit >", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThanOrEqualTo(String value) {
            addCriterion("pro_unit >=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThan(String value) {
            addCriterion("pro_unit <", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThanOrEqualTo(String value) {
            addCriterion("pro_unit <=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLike(String value) {
            addCriterion("pro_unit like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotLike(String value) {
            addCriterion("pro_unit not like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitIn(List<String> values) {
            addCriterion("pro_unit in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotIn(List<String> values) {
            addCriterion("pro_unit not in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitBetween(String value1, String value2) {
            addCriterion("pro_unit between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotBetween(String value1, String value2) {
            addCriterion("pro_unit not between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(String value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(String value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(String value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(String value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(String value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLike(String value) {
            addCriterion("attr_id like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotLike(String value) {
            addCriterion("attr_id not like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<String> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<String> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(String value1, String value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(String value1, String value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(String value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(String value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(String value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(String value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(String value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(String value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLike(String value) {
            addCriterion("stock like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotLike(String value) {
            addCriterion("stock not like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<String> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<String> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(String value1, String value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(String value1, String value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andSizeLongIsNull() {
            addCriterion("size_long is null");
            return (Criteria) this;
        }

        public Criteria andSizeLongIsNotNull() {
            addCriterion("size_long is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLongEqualTo(String value) {
            addCriterion("size_long =", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongNotEqualTo(String value) {
            addCriterion("size_long <>", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongGreaterThan(String value) {
            addCriterion("size_long >", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongGreaterThanOrEqualTo(String value) {
            addCriterion("size_long >=", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongLessThan(String value) {
            addCriterion("size_long <", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongLessThanOrEqualTo(String value) {
            addCriterion("size_long <=", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongLike(String value) {
            addCriterion("size_long like", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongNotLike(String value) {
            addCriterion("size_long not like", value, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongIn(List<String> values) {
            addCriterion("size_long in", values, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongNotIn(List<String> values) {
            addCriterion("size_long not in", values, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongBetween(String value1, String value2) {
            addCriterion("size_long between", value1, value2, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeLongNotBetween(String value1, String value2) {
            addCriterion("size_long not between", value1, value2, "sizeLong");
            return (Criteria) this;
        }

        public Criteria andSizeWideIsNull() {
            addCriterion("size_wide is null");
            return (Criteria) this;
        }

        public Criteria andSizeWideIsNotNull() {
            addCriterion("size_wide is not null");
            return (Criteria) this;
        }

        public Criteria andSizeWideEqualTo(String value) {
            addCriterion("size_wide =", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideNotEqualTo(String value) {
            addCriterion("size_wide <>", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideGreaterThan(String value) {
            addCriterion("size_wide >", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideGreaterThanOrEqualTo(String value) {
            addCriterion("size_wide >=", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideLessThan(String value) {
            addCriterion("size_wide <", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideLessThanOrEqualTo(String value) {
            addCriterion("size_wide <=", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideLike(String value) {
            addCriterion("size_wide like", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideNotLike(String value) {
            addCriterion("size_wide not like", value, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideIn(List<String> values) {
            addCriterion("size_wide in", values, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideNotIn(List<String> values) {
            addCriterion("size_wide not in", values, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideBetween(String value1, String value2) {
            addCriterion("size_wide between", value1, value2, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeWideNotBetween(String value1, String value2) {
            addCriterion("size_wide not between", value1, value2, "sizeWide");
            return (Criteria) this;
        }

        public Criteria andSizeHighIsNull() {
            addCriterion("size_high is null");
            return (Criteria) this;
        }

        public Criteria andSizeHighIsNotNull() {
            addCriterion("size_high is not null");
            return (Criteria) this;
        }

        public Criteria andSizeHighEqualTo(String value) {
            addCriterion("size_high =", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighNotEqualTo(String value) {
            addCriterion("size_high <>", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighGreaterThan(String value) {
            addCriterion("size_high >", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighGreaterThanOrEqualTo(String value) {
            addCriterion("size_high >=", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighLessThan(String value) {
            addCriterion("size_high <", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighLessThanOrEqualTo(String value) {
            addCriterion("size_high <=", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighLike(String value) {
            addCriterion("size_high like", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighNotLike(String value) {
            addCriterion("size_high not like", value, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighIn(List<String> values) {
            addCriterion("size_high in", values, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighNotIn(List<String> values) {
            addCriterion("size_high not in", values, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighBetween(String value1, String value2) {
            addCriterion("size_high between", value1, value2, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andSizeHighNotBetween(String value1, String value2) {
            addCriterion("size_high not between", value1, value2, "sizeHigh");
            return (Criteria) this;
        }

        public Criteria andUnitSizeIsNull() {
            addCriterion("unit_size is null");
            return (Criteria) this;
        }

        public Criteria andUnitSizeIsNotNull() {
            addCriterion("unit_size is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSizeEqualTo(String value) {
            addCriterion("unit_size =", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeNotEqualTo(String value) {
            addCriterion("unit_size <>", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeGreaterThan(String value) {
            addCriterion("unit_size >", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_size >=", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeLessThan(String value) {
            addCriterion("unit_size <", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeLessThanOrEqualTo(String value) {
            addCriterion("unit_size <=", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeLike(String value) {
            addCriterion("unit_size like", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeNotLike(String value) {
            addCriterion("unit_size not like", value, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeIn(List<String> values) {
            addCriterion("unit_size in", values, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeNotIn(List<String> values) {
            addCriterion("unit_size not in", values, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeBetween(String value1, String value2) {
            addCriterion("unit_size between", value1, value2, "unitSize");
            return (Criteria) this;
        }

        public Criteria andUnitSizeNotBetween(String value1, String value2) {
            addCriterion("unit_size not between", value1, value2, "unitSize");
            return (Criteria) this;
        }

        public Criteria andWeightNumIsNull() {
            addCriterion("weight_num is null");
            return (Criteria) this;
        }

        public Criteria andWeightNumIsNotNull() {
            addCriterion("weight_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeightNumEqualTo(String value) {
            addCriterion("weight_num =", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotEqualTo(String value) {
            addCriterion("weight_num <>", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumGreaterThan(String value) {
            addCriterion("weight_num >", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumGreaterThanOrEqualTo(String value) {
            addCriterion("weight_num >=", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLessThan(String value) {
            addCriterion("weight_num <", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLessThanOrEqualTo(String value) {
            addCriterion("weight_num <=", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumLike(String value) {
            addCriterion("weight_num like", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotLike(String value) {
            addCriterion("weight_num not like", value, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumIn(List<String> values) {
            addCriterion("weight_num in", values, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotIn(List<String> values) {
            addCriterion("weight_num not in", values, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumBetween(String value1, String value2) {
            addCriterion("weight_num between", value1, value2, "weightNum");
            return (Criteria) this;
        }

        public Criteria andWeightNumNotBetween(String value1, String value2) {
            addCriterion("weight_num not between", value1, value2, "weightNum");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNull() {
            addCriterion("unit_weight is null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNotNull() {
            addCriterion("unit_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightEqualTo(String value) {
            addCriterion("unit_weight =", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotEqualTo(String value) {
            addCriterion("unit_weight <>", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThan(String value) {
            addCriterion("unit_weight >", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThanOrEqualTo(String value) {
            addCriterion("unit_weight >=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThan(String value) {
            addCriterion("unit_weight <", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThanOrEqualTo(String value) {
            addCriterion("unit_weight <=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLike(String value) {
            addCriterion("unit_weight like", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotLike(String value) {
            addCriterion("unit_weight not like", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIn(List<String> values) {
            addCriterion("unit_weight in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotIn(List<String> values) {
            addCriterion("unit_weight not in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightBetween(String value1, String value2) {
            addCriterion("unit_weight between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotBetween(String value1, String value2) {
            addCriterion("unit_weight not between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andOriginCountryIsNull() {
            addCriterion("origin_country is null");
            return (Criteria) this;
        }

        public Criteria andOriginCountryIsNotNull() {
            addCriterion("origin_country is not null");
            return (Criteria) this;
        }

        public Criteria andOriginCountryEqualTo(String value) {
            addCriterion("origin_country =", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryNotEqualTo(String value) {
            addCriterion("origin_country <>", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryGreaterThan(String value) {
            addCriterion("origin_country >", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryGreaterThanOrEqualTo(String value) {
            addCriterion("origin_country >=", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryLessThan(String value) {
            addCriterion("origin_country <", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryLessThanOrEqualTo(String value) {
            addCriterion("origin_country <=", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryLike(String value) {
            addCriterion("origin_country like", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryNotLike(String value) {
            addCriterion("origin_country not like", value, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryIn(List<String> values) {
            addCriterion("origin_country in", values, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryNotIn(List<String> values) {
            addCriterion("origin_country not in", values, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryBetween(String value1, String value2) {
            addCriterion("origin_country between", value1, value2, "originCountry");
            return (Criteria) this;
        }

        public Criteria andOriginCountryNotBetween(String value1, String value2) {
            addCriterion("origin_country not between", value1, value2, "originCountry");
            return (Criteria) this;
        }

        public Criteria andCertificationsIsNull() {
            addCriterion("certifications is null");
            return (Criteria) this;
        }

        public Criteria andCertificationsIsNotNull() {
            addCriterion("certifications is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationsEqualTo(String value) {
            addCriterion("certifications =", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsNotEqualTo(String value) {
            addCriterion("certifications <>", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsGreaterThan(String value) {
            addCriterion("certifications >", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsGreaterThanOrEqualTo(String value) {
            addCriterion("certifications >=", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsLessThan(String value) {
            addCriterion("certifications <", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsLessThanOrEqualTo(String value) {
            addCriterion("certifications <=", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsLike(String value) {
            addCriterion("certifications like", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsNotLike(String value) {
            addCriterion("certifications not like", value, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsIn(List<String> values) {
            addCriterion("certifications in", values, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsNotIn(List<String> values) {
            addCriterion("certifications not in", values, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsBetween(String value1, String value2) {
            addCriterion("certifications between", value1, value2, "certifications");
            return (Criteria) this;
        }

        public Criteria andCertificationsNotBetween(String value1, String value2) {
            addCriterion("certifications not between", value1, value2, "certifications");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("market like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("market not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andHotPeriodIsNull() {
            addCriterion("hot_period is null");
            return (Criteria) this;
        }

        public Criteria andHotPeriodIsNotNull() {
            addCriterion("hot_period is not null");
            return (Criteria) this;
        }

        public Criteria andHotPeriodEqualTo(String value) {
            addCriterion("hot_period =", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodNotEqualTo(String value) {
            addCriterion("hot_period <>", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodGreaterThan(String value) {
            addCriterion("hot_period >", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("hot_period >=", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodLessThan(String value) {
            addCriterion("hot_period <", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodLessThanOrEqualTo(String value) {
            addCriterion("hot_period <=", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodLike(String value) {
            addCriterion("hot_period like", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodNotLike(String value) {
            addCriterion("hot_period not like", value, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodIn(List<String> values) {
            addCriterion("hot_period in", values, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodNotIn(List<String> values) {
            addCriterion("hot_period not in", values, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodBetween(String value1, String value2) {
            addCriterion("hot_period between", value1, value2, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andHotPeriodNotBetween(String value1, String value2) {
            addCriterion("hot_period not between", value1, value2, "hotPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodIsNull() {
            addCriterion("low_period is null");
            return (Criteria) this;
        }

        public Criteria andLowPeriodIsNotNull() {
            addCriterion("low_period is not null");
            return (Criteria) this;
        }

        public Criteria andLowPeriodEqualTo(String value) {
            addCriterion("low_period =", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodNotEqualTo(String value) {
            addCriterion("low_period <>", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodGreaterThan(String value) {
            addCriterion("low_period >", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("low_period >=", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodLessThan(String value) {
            addCriterion("low_period <", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodLessThanOrEqualTo(String value) {
            addCriterion("low_period <=", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodLike(String value) {
            addCriterion("low_period like", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodNotLike(String value) {
            addCriterion("low_period not like", value, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodIn(List<String> values) {
            addCriterion("low_period in", values, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodNotIn(List<String> values) {
            addCriterion("low_period not in", values, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodBetween(String value1, String value2) {
            addCriterion("low_period between", value1, value2, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andLowPeriodNotBetween(String value1, String value2) {
            addCriterion("low_period not between", value1, value2, "lowPeriod");
            return (Criteria) this;
        }

        public Criteria andProductiveIsNull() {
            addCriterion("productive is null");
            return (Criteria) this;
        }

        public Criteria andProductiveIsNotNull() {
            addCriterion("productive is not null");
            return (Criteria) this;
        }

        public Criteria andProductiveEqualTo(String value) {
            addCriterion("productive =", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveNotEqualTo(String value) {
            addCriterion("productive <>", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveGreaterThan(String value) {
            addCriterion("productive >", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveGreaterThanOrEqualTo(String value) {
            addCriterion("productive >=", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveLessThan(String value) {
            addCriterion("productive <", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveLessThanOrEqualTo(String value) {
            addCriterion("productive <=", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveLike(String value) {
            addCriterion("productive like", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveNotLike(String value) {
            addCriterion("productive not like", value, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveIn(List<String> values) {
            addCriterion("productive in", values, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveNotIn(List<String> values) {
            addCriterion("productive not in", values, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveBetween(String value1, String value2) {
            addCriterion("productive between", value1, value2, "productive");
            return (Criteria) this;
        }

        public Criteria andProductiveNotBetween(String value1, String value2) {
            addCriterion("productive not between", value1, value2, "productive");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}