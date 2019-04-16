package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProManageHisVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProManageHisVersionExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proId is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proId is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("proId =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("proId <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("proId >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("proId >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("proId <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("proId <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("proId like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("proId not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("proId in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("proId not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("proId between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("proId not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNull() {
            addCriterion("products_id is null");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNotNull() {
            addCriterion("products_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductsIdEqualTo(String value) {
            addCriterion("products_id =", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotEqualTo(String value) {
            addCriterion("products_id <>", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThan(String value) {
            addCriterion("products_id >", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThanOrEqualTo(String value) {
            addCriterion("products_id >=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThan(String value) {
            addCriterion("products_id <", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThanOrEqualTo(String value) {
            addCriterion("products_id <=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLike(String value) {
            addCriterion("products_id like", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotLike(String value) {
            addCriterion("products_id not like", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdIn(List<String> values) {
            addCriterion("products_id in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotIn(List<String> values) {
            addCriterion("products_id not in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdBetween(String value1, String value2) {
            addCriterion("products_id between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotBetween(String value1, String value2) {
            addCriterion("products_id not between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andTypeSourceIsNull() {
            addCriterion("type_source is null");
            return (Criteria) this;
        }

        public Criteria andTypeSourceIsNotNull() {
            addCriterion("type_source is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSourceEqualTo(String value) {
            addCriterion("type_source =", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceNotEqualTo(String value) {
            addCriterion("type_source <>", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceGreaterThan(String value) {
            addCriterion("type_source >", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceGreaterThanOrEqualTo(String value) {
            addCriterion("type_source >=", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceLessThan(String value) {
            addCriterion("type_source <", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceLessThanOrEqualTo(String value) {
            addCriterion("type_source <=", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceLike(String value) {
            addCriterion("type_source like", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceNotLike(String value) {
            addCriterion("type_source not like", value, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceIn(List<String> values) {
            addCriterion("type_source in", values, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceNotIn(List<String> values) {
            addCriterion("type_source not in", values, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceBetween(String value1, String value2) {
            addCriterion("type_source between", value1, value2, "typeSource");
            return (Criteria) this;
        }

        public Criteria andTypeSourceNotBetween(String value1, String value2) {
            addCriterion("type_source not between", value1, value2, "typeSource");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("catalog like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("catalog not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNull() {
            addCriterion("groups_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNotNull() {
            addCriterion("groups_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdEqualTo(String value) {
            addCriterion("groups_id =", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotEqualTo(String value) {
            addCriterion("groups_id <>", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThan(String value) {
            addCriterion("groups_id >", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThanOrEqualTo(String value) {
            addCriterion("groups_id >=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThan(String value) {
            addCriterion("groups_id <", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThanOrEqualTo(String value) {
            addCriterion("groups_id <=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLike(String value) {
            addCriterion("groups_id like", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotLike(String value) {
            addCriterion("groups_id not like", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIn(List<String> values) {
            addCriterion("groups_id in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotIn(List<String> values) {
            addCriterion("groups_id not in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdBetween(String value1, String value2) {
            addCriterion("groups_id between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotBetween(String value1, String value2) {
            addCriterion("groups_id not between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdIsNull() {
            addCriterion("subaccount_id is null");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdIsNotNull() {
            addCriterion("subaccount_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdEqualTo(String value) {
            addCriterion("subaccount_id =", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdNotEqualTo(String value) {
            addCriterion("subaccount_id <>", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdGreaterThan(String value) {
            addCriterion("subaccount_id >", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("subaccount_id >=", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdLessThan(String value) {
            addCriterion("subaccount_id <", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdLessThanOrEqualTo(String value) {
            addCriterion("subaccount_id <=", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdLike(String value) {
            addCriterion("subaccount_id like", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdNotLike(String value) {
            addCriterion("subaccount_id not like", value, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdIn(List<String> values) {
            addCriterion("subaccount_id in", values, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdNotIn(List<String> values) {
            addCriterion("subaccount_id not in", values, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdBetween(String value1, String value2) {
            addCriterion("subaccount_id between", value1, value2, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andSubaccountIdNotBetween(String value1, String value2) {
            addCriterion("subaccount_id not between", value1, value2, "subaccountId");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagIsNull() {
            addCriterion("hotsale_flag is null");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagIsNotNull() {
            addCriterion("hotsale_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagEqualTo(String value) {
            addCriterion("hotsale_flag =", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagNotEqualTo(String value) {
            addCriterion("hotsale_flag <>", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagGreaterThan(String value) {
            addCriterion("hotsale_flag >", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagGreaterThanOrEqualTo(String value) {
            addCriterion("hotsale_flag >=", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagLessThan(String value) {
            addCriterion("hotsale_flag <", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagLessThanOrEqualTo(String value) {
            addCriterion("hotsale_flag <=", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagLike(String value) {
            addCriterion("hotsale_flag like", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagNotLike(String value) {
            addCriterion("hotsale_flag not like", value, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagIn(List<String> values) {
            addCriterion("hotsale_flag in", values, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagNotIn(List<String> values) {
            addCriterion("hotsale_flag not in", values, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagBetween(String value1, String value2) {
            addCriterion("hotsale_flag between", value1, value2, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andHotsaleFlagNotBetween(String value1, String value2) {
            addCriterion("hotsale_flag not between", value1, value2, "hotsaleFlag");
            return (Criteria) this;
        }

        public Criteria andAttachkeyIsNull() {
            addCriterion("attachKey is null");
            return (Criteria) this;
        }

        public Criteria andAttachkeyIsNotNull() {
            addCriterion("attachKey is not null");
            return (Criteria) this;
        }

        public Criteria andAttachkeyEqualTo(String value) {
            addCriterion("attachKey =", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyNotEqualTo(String value) {
            addCriterion("attachKey <>", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyGreaterThan(String value) {
            addCriterion("attachKey >", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyGreaterThanOrEqualTo(String value) {
            addCriterion("attachKey >=", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyLessThan(String value) {
            addCriterion("attachKey <", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyLessThanOrEqualTo(String value) {
            addCriterion("attachKey <=", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyLike(String value) {
            addCriterion("attachKey like", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyNotLike(String value) {
            addCriterion("attachKey not like", value, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyIn(List<String> values) {
            addCriterion("attachKey in", values, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyNotIn(List<String> values) {
            addCriterion("attachKey not in", values, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyBetween(String value1, String value2) {
            addCriterion("attachKey between", value1, value2, "attachkey");
            return (Criteria) this;
        }

        public Criteria andAttachkeyNotBetween(String value1, String value2) {
            addCriterion("attachKey not between", value1, value2, "attachkey");
            return (Criteria) this;
        }

        public Criteria andCustomsnoIsNull() {
            addCriterion("customsNo is null");
            return (Criteria) this;
        }

        public Criteria andCustomsnoIsNotNull() {
            addCriterion("customsNo is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsnoEqualTo(String value) {
            addCriterion("customsNo =", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoNotEqualTo(String value) {
            addCriterion("customsNo <>", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoGreaterThan(String value) {
            addCriterion("customsNo >", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoGreaterThanOrEqualTo(String value) {
            addCriterion("customsNo >=", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoLessThan(String value) {
            addCriterion("customsNo <", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoLessThanOrEqualTo(String value) {
            addCriterion("customsNo <=", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoLike(String value) {
            addCriterion("customsNo like", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoNotLike(String value) {
            addCriterion("customsNo not like", value, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoIn(List<String> values) {
            addCriterion("customsNo in", values, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoNotIn(List<String> values) {
            addCriterion("customsNo not in", values, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoBetween(String value1, String value2) {
            addCriterion("customsNo between", value1, value2, "customsno");
            return (Criteria) this;
        }

        public Criteria andCustomsnoNotBetween(String value1, String value2) {
            addCriterion("customsNo not between", value1, value2, "customsno");
            return (Criteria) this;
        }

        public Criteria andTaxcostIsNull() {
            addCriterion("taxCost is null");
            return (Criteria) this;
        }

        public Criteria andTaxcostIsNotNull() {
            addCriterion("taxCost is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcostEqualTo(Float value) {
            addCriterion("taxCost =", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotEqualTo(Float value) {
            addCriterion("taxCost <>", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostGreaterThan(Float value) {
            addCriterion("taxCost >", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostGreaterThanOrEqualTo(Float value) {
            addCriterion("taxCost >=", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostLessThan(Float value) {
            addCriterion("taxCost <", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostLessThanOrEqualTo(Float value) {
            addCriterion("taxCost <=", value, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostIn(List<Float> values) {
            addCriterion("taxCost in", values, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotIn(List<Float> values) {
            addCriterion("taxCost not in", values, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostBetween(Float value1, Float value2) {
            addCriterion("taxCost between", value1, value2, "taxcost");
            return (Criteria) this;
        }

        public Criteria andTaxcostNotBetween(Float value1, Float value2) {
            addCriterion("taxCost not between", value1, value2, "taxcost");
            return (Criteria) this;
        }

        public Criteria andCostquaunitIsNull() {
            addCriterion("costQuaUnit is null");
            return (Criteria) this;
        }

        public Criteria andCostquaunitIsNotNull() {
            addCriterion("costQuaUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCostquaunitEqualTo(String value) {
            addCriterion("costQuaUnit =", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitNotEqualTo(String value) {
            addCriterion("costQuaUnit <>", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitGreaterThan(String value) {
            addCriterion("costQuaUnit >", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitGreaterThanOrEqualTo(String value) {
            addCriterion("costQuaUnit >=", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitLessThan(String value) {
            addCriterion("costQuaUnit <", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitLessThanOrEqualTo(String value) {
            addCriterion("costQuaUnit <=", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitLike(String value) {
            addCriterion("costQuaUnit like", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitNotLike(String value) {
            addCriterion("costQuaUnit not like", value, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitIn(List<String> values) {
            addCriterion("costQuaUnit in", values, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitNotIn(List<String> values) {
            addCriterion("costQuaUnit not in", values, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitBetween(String value1, String value2) {
            addCriterion("costQuaUnit between", value1, value2, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostquaunitNotBetween(String value1, String value2) {
            addCriterion("costQuaUnit not between", value1, value2, "costquaunit");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyIsNull() {
            addCriterion("costCurrency is null");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyIsNotNull() {
            addCriterion("costCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyEqualTo(String value) {
            addCriterion("costCurrency =", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyNotEqualTo(String value) {
            addCriterion("costCurrency <>", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyGreaterThan(String value) {
            addCriterion("costCurrency >", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("costCurrency >=", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyLessThan(String value) {
            addCriterion("costCurrency <", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyLessThanOrEqualTo(String value) {
            addCriterion("costCurrency <=", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyLike(String value) {
            addCriterion("costCurrency like", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyNotLike(String value) {
            addCriterion("costCurrency not like", value, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyIn(List<String> values) {
            addCriterion("costCurrency in", values, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyNotIn(List<String> values) {
            addCriterion("costCurrency not in", values, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyBetween(String value1, String value2) {
            addCriterion("costCurrency between", value1, value2, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andCostcurrencyNotBetween(String value1, String value2) {
            addCriterion("costCurrency not between", value1, value2, "costcurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyIsNull() {
            addCriterion("offShoreCurrency is null");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyIsNotNull() {
            addCriterion("offShoreCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyEqualTo(String value) {
            addCriterion("offShoreCurrency =", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyNotEqualTo(String value) {
            addCriterion("offShoreCurrency <>", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyGreaterThan(String value) {
            addCriterion("offShoreCurrency >", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("offShoreCurrency >=", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyLessThan(String value) {
            addCriterion("offShoreCurrency <", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyLessThanOrEqualTo(String value) {
            addCriterion("offShoreCurrency <=", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyLike(String value) {
            addCriterion("offShoreCurrency like", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyNotLike(String value) {
            addCriterion("offShoreCurrency not like", value, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyIn(List<String> values) {
            addCriterion("offShoreCurrency in", values, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyNotIn(List<String> values) {
            addCriterion("offShoreCurrency not in", values, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyBetween(String value1, String value2) {
            addCriterion("offShoreCurrency between", value1, value2, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorecurrencyNotBetween(String value1, String value2) {
            addCriterion("offShoreCurrency not between", value1, value2, "offshorecurrency");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitIsNull() {
            addCriterion("offShoreQuaUnit is null");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitIsNotNull() {
            addCriterion("offShoreQuaUnit is not null");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitEqualTo(String value) {
            addCriterion("offShoreQuaUnit =", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitNotEqualTo(String value) {
            addCriterion("offShoreQuaUnit <>", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitGreaterThan(String value) {
            addCriterion("offShoreQuaUnit >", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitGreaterThanOrEqualTo(String value) {
            addCriterion("offShoreQuaUnit >=", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitLessThan(String value) {
            addCriterion("offShoreQuaUnit <", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitLessThanOrEqualTo(String value) {
            addCriterion("offShoreQuaUnit <=", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitLike(String value) {
            addCriterion("offShoreQuaUnit like", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitNotLike(String value) {
            addCriterion("offShoreQuaUnit not like", value, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitIn(List<String> values) {
            addCriterion("offShoreQuaUnit in", values, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitNotIn(List<String> values) {
            addCriterion("offShoreQuaUnit not in", values, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitBetween(String value1, String value2) {
            addCriterion("offShoreQuaUnit between", value1, value2, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshorequaunitNotBetween(String value1, String value2) {
            addCriterion("offShoreQuaUnit not between", value1, value2, "offshorequaunit");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceIsNull() {
            addCriterion("offShoreMinPrice is null");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceIsNotNull() {
            addCriterion("offShoreMinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceEqualTo(Float value) {
            addCriterion("offShoreMinPrice =", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceNotEqualTo(Float value) {
            addCriterion("offShoreMinPrice <>", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceGreaterThan(Float value) {
            addCriterion("offShoreMinPrice >", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("offShoreMinPrice >=", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceLessThan(Float value) {
            addCriterion("offShoreMinPrice <", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceLessThanOrEqualTo(Float value) {
            addCriterion("offShoreMinPrice <=", value, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceIn(List<Float> values) {
            addCriterion("offShoreMinPrice in", values, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceNotIn(List<Float> values) {
            addCriterion("offShoreMinPrice not in", values, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceBetween(Float value1, Float value2) {
            addCriterion("offShoreMinPrice between", value1, value2, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoreminpriceNotBetween(Float value1, Float value2) {
            addCriterion("offShoreMinPrice not between", value1, value2, "offshoreminprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceIsNull() {
            addCriterion("offShoreMaxPrice is null");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceIsNotNull() {
            addCriterion("offShoreMaxPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceEqualTo(Float value) {
            addCriterion("offShoreMaxPrice =", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceNotEqualTo(Float value) {
            addCriterion("offShoreMaxPrice <>", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceGreaterThan(Float value) {
            addCriterion("offShoreMaxPrice >", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("offShoreMaxPrice >=", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceLessThan(Float value) {
            addCriterion("offShoreMaxPrice <", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceLessThanOrEqualTo(Float value) {
            addCriterion("offShoreMaxPrice <=", value, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceIn(List<Float> values) {
            addCriterion("offShoreMaxPrice in", values, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceNotIn(List<Float> values) {
            addCriterion("offShoreMaxPrice not in", values, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceBetween(Float value1, Float value2) {
            addCriterion("offShoreMaxPrice between", value1, value2, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andOffshoremaxpriceNotBetween(Float value1, Float value2) {
            addCriterion("offShoreMaxPrice not between", value1, value2, "offshoremaxprice");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityIsNull() {
            addCriterion("minOrderQuantity is null");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityIsNotNull() {
            addCriterion("minOrderQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityEqualTo(Float value) {
            addCriterion("minOrderQuantity =", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityNotEqualTo(Float value) {
            addCriterion("minOrderQuantity <>", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityGreaterThan(Float value) {
            addCriterion("minOrderQuantity >", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("minOrderQuantity >=", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityLessThan(Float value) {
            addCriterion("minOrderQuantity <", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityLessThanOrEqualTo(Float value) {
            addCriterion("minOrderQuantity <=", value, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityIn(List<Float> values) {
            addCriterion("minOrderQuantity in", values, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityNotIn(List<Float> values) {
            addCriterion("minOrderQuantity not in", values, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityBetween(Float value1, Float value2) {
            addCriterion("minOrderQuantity between", value1, value2, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderquantityNotBetween(Float value1, Float value2) {
            addCriterion("minOrderQuantity not between", value1, value2, "minorderquantity");
            return (Criteria) this;
        }

        public Criteria andMinorderunitIsNull() {
            addCriterion("minOrderUnit is null");
            return (Criteria) this;
        }

        public Criteria andMinorderunitIsNotNull() {
            addCriterion("minOrderUnit is not null");
            return (Criteria) this;
        }

        public Criteria andMinorderunitEqualTo(String value) {
            addCriterion("minOrderUnit =", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitNotEqualTo(String value) {
            addCriterion("minOrderUnit <>", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitGreaterThan(String value) {
            addCriterion("minOrderUnit >", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitGreaterThanOrEqualTo(String value) {
            addCriterion("minOrderUnit >=", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitLessThan(String value) {
            addCriterion("minOrderUnit <", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitLessThanOrEqualTo(String value) {
            addCriterion("minOrderUnit <=", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitLike(String value) {
            addCriterion("minOrderUnit like", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitNotLike(String value) {
            addCriterion("minOrderUnit not like", value, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitIn(List<String> values) {
            addCriterion("minOrderUnit in", values, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitNotIn(List<String> values) {
            addCriterion("minOrderUnit not in", values, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitBetween(String value1, String value2) {
            addCriterion("minOrderUnit between", value1, value2, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andMinorderunitNotBetween(String value1, String value2) {
            addCriterion("minOrderUnit not between", value1, value2, "minorderunit");
            return (Criteria) this;
        }

        public Criteria andPageunitIsNull() {
            addCriterion("pageUnit is null");
            return (Criteria) this;
        }

        public Criteria andPageunitIsNotNull() {
            addCriterion("pageUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPageunitEqualTo(String value) {
            addCriterion("pageUnit =", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitNotEqualTo(String value) {
            addCriterion("pageUnit <>", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitGreaterThan(String value) {
            addCriterion("pageUnit >", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitGreaterThanOrEqualTo(String value) {
            addCriterion("pageUnit >=", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitLessThan(String value) {
            addCriterion("pageUnit <", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitLessThanOrEqualTo(String value) {
            addCriterion("pageUnit <=", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitLike(String value) {
            addCriterion("pageUnit like", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitNotLike(String value) {
            addCriterion("pageUnit not like", value, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitIn(List<String> values) {
            addCriterion("pageUnit in", values, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitNotIn(List<String> values) {
            addCriterion("pageUnit not in", values, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitBetween(String value1, String value2) {
            addCriterion("pageUnit between", value1, value2, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPageunitNotBetween(String value1, String value2) {
            addCriterion("pageUnit not between", value1, value2, "pageunit");
            return (Criteria) this;
        }

        public Criteria andPerpagenumIsNull() {
            addCriterion("perPageNum is null");
            return (Criteria) this;
        }

        public Criteria andPerpagenumIsNotNull() {
            addCriterion("perPageNum is not null");
            return (Criteria) this;
        }

        public Criteria andPerpagenumEqualTo(Float value) {
            addCriterion("perPageNum =", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumNotEqualTo(Float value) {
            addCriterion("perPageNum <>", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumGreaterThan(Float value) {
            addCriterion("perPageNum >", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumGreaterThanOrEqualTo(Float value) {
            addCriterion("perPageNum >=", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumLessThan(Float value) {
            addCriterion("perPageNum <", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumLessThanOrEqualTo(Float value) {
            addCriterion("perPageNum <=", value, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumIn(List<Float> values) {
            addCriterion("perPageNum in", values, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumNotIn(List<Float> values) {
            addCriterion("perPageNum not in", values, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumBetween(Float value1, Float value2) {
            addCriterion("perPageNum between", value1, value2, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpagenumNotBetween(Float value1, Float value2) {
            addCriterion("perPageNum not between", value1, value2, "perpagenum");
            return (Criteria) this;
        }

        public Criteria andPerpageIsNull() {
            addCriterion("perPage is null");
            return (Criteria) this;
        }

        public Criteria andPerpageIsNotNull() {
            addCriterion("perPage is not null");
            return (Criteria) this;
        }

        public Criteria andPerpageEqualTo(Float value) {
            addCriterion("perPage =", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageNotEqualTo(Float value) {
            addCriterion("perPage <>", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageGreaterThan(Float value) {
            addCriterion("perPage >", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageGreaterThanOrEqualTo(Float value) {
            addCriterion("perPage >=", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageLessThan(Float value) {
            addCriterion("perPage <", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageLessThanOrEqualTo(Float value) {
            addCriterion("perPage <=", value, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageIn(List<Float> values) {
            addCriterion("perPage in", values, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageNotIn(List<Float> values) {
            addCriterion("perPage not in", values, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageBetween(Float value1, Float value2) {
            addCriterion("perPage between", value1, value2, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerpageNotBetween(Float value1, Float value2) {
            addCriterion("perPage not between", value1, value2, "perpage");
            return (Criteria) this;
        }

        public Criteria andPerweightIsNull() {
            addCriterion("perWeight is null");
            return (Criteria) this;
        }

        public Criteria andPerweightIsNotNull() {
            addCriterion("perWeight is not null");
            return (Criteria) this;
        }

        public Criteria andPerweightEqualTo(Float value) {
            addCriterion("perWeight =", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightNotEqualTo(Float value) {
            addCriterion("perWeight <>", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightGreaterThan(Float value) {
            addCriterion("perWeight >", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightGreaterThanOrEqualTo(Float value) {
            addCriterion("perWeight >=", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightLessThan(Float value) {
            addCriterion("perWeight <", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightLessThanOrEqualTo(Float value) {
            addCriterion("perWeight <=", value, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightIn(List<Float> values) {
            addCriterion("perWeight in", values, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightNotIn(List<Float> values) {
            addCriterion("perWeight not in", values, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightBetween(Float value1, Float value2) {
            addCriterion("perWeight between", value1, value2, "perweight");
            return (Criteria) this;
        }

        public Criteria andPerweightNotBetween(Float value1, Float value2) {
            addCriterion("perWeight not between", value1, value2, "perweight");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionIsNull() {
            addCriterion("pageDescription is null");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionIsNotNull() {
            addCriterion("pageDescription is not null");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionEqualTo(String value) {
            addCriterion("pageDescription =", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionNotEqualTo(String value) {
            addCriterion("pageDescription <>", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionGreaterThan(String value) {
            addCriterion("pageDescription >", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pageDescription >=", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionLessThan(String value) {
            addCriterion("pageDescription <", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionLessThanOrEqualTo(String value) {
            addCriterion("pageDescription <=", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionLike(String value) {
            addCriterion("pageDescription like", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionNotLike(String value) {
            addCriterion("pageDescription not like", value, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionIn(List<String> values) {
            addCriterion("pageDescription in", values, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionNotIn(List<String> values) {
            addCriterion("pageDescription not in", values, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionBetween(String value1, String value2) {
            addCriterion("pageDescription between", value1, value2, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andPagedescriptionNotBetween(String value1, String value2) {
            addCriterion("pageDescription not between", value1, value2, "pagedescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionIsNull() {
            addCriterion("proDescription is null");
            return (Criteria) this;
        }

        public Criteria andProdescriptionIsNotNull() {
            addCriterion("proDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProdescriptionEqualTo(String value) {
            addCriterion("proDescription =", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionNotEqualTo(String value) {
            addCriterion("proDescription <>", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionGreaterThan(String value) {
            addCriterion("proDescription >", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("proDescription >=", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionLessThan(String value) {
            addCriterion("proDescription <", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionLessThanOrEqualTo(String value) {
            addCriterion("proDescription <=", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionLike(String value) {
            addCriterion("proDescription like", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionNotLike(String value) {
            addCriterion("proDescription not like", value, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionIn(List<String> values) {
            addCriterion("proDescription in", values, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionNotIn(List<String> values) {
            addCriterion("proDescription not in", values, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionBetween(String value1, String value2) {
            addCriterion("proDescription between", value1, value2, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProdescriptionNotBetween(String value1, String value2) {
            addCriterion("proDescription not between", value1, value2, "prodescription");
            return (Criteria) this;
        }

        public Criteria andProurlIsNull() {
            addCriterion("proUrl is null");
            return (Criteria) this;
        }

        public Criteria andProurlIsNotNull() {
            addCriterion("proUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProurlEqualTo(String value) {
            addCriterion("proUrl =", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlNotEqualTo(String value) {
            addCriterion("proUrl <>", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlGreaterThan(String value) {
            addCriterion("proUrl >", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlGreaterThanOrEqualTo(String value) {
            addCriterion("proUrl >=", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlLessThan(String value) {
            addCriterion("proUrl <", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlLessThanOrEqualTo(String value) {
            addCriterion("proUrl <=", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlLike(String value) {
            addCriterion("proUrl like", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlNotLike(String value) {
            addCriterion("proUrl not like", value, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlIn(List<String> values) {
            addCriterion("proUrl in", values, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlNotIn(List<String> values) {
            addCriterion("proUrl not in", values, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlBetween(String value1, String value2) {
            addCriterion("proUrl between", value1, value2, "prourl");
            return (Criteria) this;
        }

        public Criteria andProurlNotBetween(String value1, String value2) {
            addCriterion("proUrl not between", value1, value2, "prourl");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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