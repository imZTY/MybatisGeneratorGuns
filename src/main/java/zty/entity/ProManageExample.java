package zty.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProManageExample() {
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

        public Criteria andProNoIsNull() {
            addCriterion("pro_no is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("pro_no is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("pro_no =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("pro_no <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("pro_no >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_no >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("pro_no <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("pro_no <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("pro_no like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("pro_no not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("pro_no in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("pro_no not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("pro_no between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("pro_no not between", value1, value2, "proNo");
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

        public Criteria andCustomsNoIsNull() {
            addCriterion("customs_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomsNoIsNotNull() {
            addCriterion("customs_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsNoEqualTo(String value) {
            addCriterion("customs_no =", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoNotEqualTo(String value) {
            addCriterion("customs_no <>", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoGreaterThan(String value) {
            addCriterion("customs_no >", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoGreaterThanOrEqualTo(String value) {
            addCriterion("customs_no >=", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoLessThan(String value) {
            addCriterion("customs_no <", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoLessThanOrEqualTo(String value) {
            addCriterion("customs_no <=", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoLike(String value) {
            addCriterion("customs_no like", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoNotLike(String value) {
            addCriterion("customs_no not like", value, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoIn(List<String> values) {
            addCriterion("customs_no in", values, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoNotIn(List<String> values) {
            addCriterion("customs_no not in", values, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoBetween(String value1, String value2) {
            addCriterion("customs_no between", value1, value2, "customsNo");
            return (Criteria) this;
        }

        public Criteria andCustomsNoNotBetween(String value1, String value2) {
            addCriterion("customs_no not between", value1, value2, "customsNo");
            return (Criteria) this;
        }

        public Criteria andTaxCostIsNull() {
            addCriterion("tax_cost is null");
            return (Criteria) this;
        }

        public Criteria andTaxCostIsNotNull() {
            addCriterion("tax_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCostEqualTo(Float value) {
            addCriterion("tax_cost =", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostNotEqualTo(Float value) {
            addCriterion("tax_cost <>", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostGreaterThan(Float value) {
            addCriterion("tax_cost >", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostGreaterThanOrEqualTo(Float value) {
            addCriterion("tax_cost >=", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostLessThan(Float value) {
            addCriterion("tax_cost <", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostLessThanOrEqualTo(Float value) {
            addCriterion("tax_cost <=", value, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostIn(List<Float> values) {
            addCriterion("tax_cost in", values, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostNotIn(List<Float> values) {
            addCriterion("tax_cost not in", values, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostBetween(Float value1, Float value2) {
            addCriterion("tax_cost between", value1, value2, "taxCost");
            return (Criteria) this;
        }

        public Criteria andTaxCostNotBetween(Float value1, Float value2) {
            addCriterion("tax_cost not between", value1, value2, "taxCost");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitIsNull() {
            addCriterion("cost_qua_unit is null");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitIsNotNull() {
            addCriterion("cost_qua_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitEqualTo(String value) {
            addCriterion("cost_qua_unit =", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitNotEqualTo(String value) {
            addCriterion("cost_qua_unit <>", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitGreaterThan(String value) {
            addCriterion("cost_qua_unit >", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitGreaterThanOrEqualTo(String value) {
            addCriterion("cost_qua_unit >=", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitLessThan(String value) {
            addCriterion("cost_qua_unit <", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitLessThanOrEqualTo(String value) {
            addCriterion("cost_qua_unit <=", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitLike(String value) {
            addCriterion("cost_qua_unit like", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitNotLike(String value) {
            addCriterion("cost_qua_unit not like", value, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitIn(List<String> values) {
            addCriterion("cost_qua_unit in", values, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitNotIn(List<String> values) {
            addCriterion("cost_qua_unit not in", values, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitBetween(String value1, String value2) {
            addCriterion("cost_qua_unit between", value1, value2, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostQuaUnitNotBetween(String value1, String value2) {
            addCriterion("cost_qua_unit not between", value1, value2, "costQuaUnit");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyIsNull() {
            addCriterion("cost_currency is null");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyIsNotNull() {
            addCriterion("cost_currency is not null");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyEqualTo(String value) {
            addCriterion("cost_currency =", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyNotEqualTo(String value) {
            addCriterion("cost_currency <>", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyGreaterThan(String value) {
            addCriterion("cost_currency >", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("cost_currency >=", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyLessThan(String value) {
            addCriterion("cost_currency <", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyLessThanOrEqualTo(String value) {
            addCriterion("cost_currency <=", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyLike(String value) {
            addCriterion("cost_currency like", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyNotLike(String value) {
            addCriterion("cost_currency not like", value, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyIn(List<String> values) {
            addCriterion("cost_currency in", values, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyNotIn(List<String> values) {
            addCriterion("cost_currency not in", values, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyBetween(String value1, String value2) {
            addCriterion("cost_currency between", value1, value2, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andCostCurrencyNotBetween(String value1, String value2) {
            addCriterion("cost_currency not between", value1, value2, "costCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyIsNull() {
            addCriterion("off_shore_currency is null");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyIsNotNull() {
            addCriterion("off_shore_currency is not null");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyEqualTo(String value) {
            addCriterion("off_shore_currency =", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyNotEqualTo(String value) {
            addCriterion("off_shore_currency <>", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyGreaterThan(String value) {
            addCriterion("off_shore_currency >", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("off_shore_currency >=", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyLessThan(String value) {
            addCriterion("off_shore_currency <", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyLessThanOrEqualTo(String value) {
            addCriterion("off_shore_currency <=", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyLike(String value) {
            addCriterion("off_shore_currency like", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyNotLike(String value) {
            addCriterion("off_shore_currency not like", value, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyIn(List<String> values) {
            addCriterion("off_shore_currency in", values, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyNotIn(List<String> values) {
            addCriterion("off_shore_currency not in", values, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyBetween(String value1, String value2) {
            addCriterion("off_shore_currency between", value1, value2, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreCurrencyNotBetween(String value1, String value2) {
            addCriterion("off_shore_currency not between", value1, value2, "offShoreCurrency");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitIsNull() {
            addCriterion("off_shore_qua_unit is null");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitIsNotNull() {
            addCriterion("off_shore_qua_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitEqualTo(String value) {
            addCriterion("off_shore_qua_unit =", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitNotEqualTo(String value) {
            addCriterion("off_shore_qua_unit <>", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitGreaterThan(String value) {
            addCriterion("off_shore_qua_unit >", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitGreaterThanOrEqualTo(String value) {
            addCriterion("off_shore_qua_unit >=", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitLessThan(String value) {
            addCriterion("off_shore_qua_unit <", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitLessThanOrEqualTo(String value) {
            addCriterion("off_shore_qua_unit <=", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitLike(String value) {
            addCriterion("off_shore_qua_unit like", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitNotLike(String value) {
            addCriterion("off_shore_qua_unit not like", value, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitIn(List<String> values) {
            addCriterion("off_shore_qua_unit in", values, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitNotIn(List<String> values) {
            addCriterion("off_shore_qua_unit not in", values, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitBetween(String value1, String value2) {
            addCriterion("off_shore_qua_unit between", value1, value2, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreQuaUnitNotBetween(String value1, String value2) {
            addCriterion("off_shore_qua_unit not between", value1, value2, "offShoreQuaUnit");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceIsNull() {
            addCriterion("off_shore_min_price is null");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceIsNotNull() {
            addCriterion("off_shore_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceEqualTo(Float value) {
            addCriterion("off_shore_min_price =", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceNotEqualTo(Float value) {
            addCriterion("off_shore_min_price <>", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceGreaterThan(Float value) {
            addCriterion("off_shore_min_price >", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("off_shore_min_price >=", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceLessThan(Float value) {
            addCriterion("off_shore_min_price <", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceLessThanOrEqualTo(Float value) {
            addCriterion("off_shore_min_price <=", value, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceIn(List<Float> values) {
            addCriterion("off_shore_min_price in", values, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceNotIn(List<Float> values) {
            addCriterion("off_shore_min_price not in", values, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceBetween(Float value1, Float value2) {
            addCriterion("off_shore_min_price between", value1, value2, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMinPriceNotBetween(Float value1, Float value2) {
            addCriterion("off_shore_min_price not between", value1, value2, "offShoreMinPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceIsNull() {
            addCriterion("off_shore_max_price is null");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceIsNotNull() {
            addCriterion("off_shore_max_price is not null");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceEqualTo(Float value) {
            addCriterion("off_shore_max_price =", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceNotEqualTo(Float value) {
            addCriterion("off_shore_max_price <>", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceGreaterThan(Float value) {
            addCriterion("off_shore_max_price >", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("off_shore_max_price >=", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceLessThan(Float value) {
            addCriterion("off_shore_max_price <", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceLessThanOrEqualTo(Float value) {
            addCriterion("off_shore_max_price <=", value, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceIn(List<Float> values) {
            addCriterion("off_shore_max_price in", values, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceNotIn(List<Float> values) {
            addCriterion("off_shore_max_price not in", values, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceBetween(Float value1, Float value2) {
            addCriterion("off_shore_max_price between", value1, value2, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andOffShoreMaxPriceNotBetween(Float value1, Float value2) {
            addCriterion("off_shore_max_price not between", value1, value2, "offShoreMaxPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIsNull() {
            addCriterion("min_order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIsNotNull() {
            addCriterion("min_order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityEqualTo(Float value) {
            addCriterion("min_order_quantity =", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotEqualTo(Float value) {
            addCriterion("min_order_quantity <>", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityGreaterThan(Float value) {
            addCriterion("min_order_quantity >", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityGreaterThanOrEqualTo(Float value) {
            addCriterion("min_order_quantity >=", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityLessThan(Float value) {
            addCriterion("min_order_quantity <", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityLessThanOrEqualTo(Float value) {
            addCriterion("min_order_quantity <=", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIn(List<Float> values) {
            addCriterion("min_order_quantity in", values, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotIn(List<Float> values) {
            addCriterion("min_order_quantity not in", values, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityBetween(Float value1, Float value2) {
            addCriterion("min_order_quantity between", value1, value2, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotBetween(Float value1, Float value2) {
            addCriterion("min_order_quantity not between", value1, value2, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitIsNull() {
            addCriterion("min_order_unit is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitIsNotNull() {
            addCriterion("min_order_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitEqualTo(String value) {
            addCriterion("min_order_unit =", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitNotEqualTo(String value) {
            addCriterion("min_order_unit <>", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitGreaterThan(String value) {
            addCriterion("min_order_unit >", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitGreaterThanOrEqualTo(String value) {
            addCriterion("min_order_unit >=", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitLessThan(String value) {
            addCriterion("min_order_unit <", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitLessThanOrEqualTo(String value) {
            addCriterion("min_order_unit <=", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitLike(String value) {
            addCriterion("min_order_unit like", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitNotLike(String value) {
            addCriterion("min_order_unit not like", value, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitIn(List<String> values) {
            addCriterion("min_order_unit in", values, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitNotIn(List<String> values) {
            addCriterion("min_order_unit not in", values, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitBetween(String value1, String value2) {
            addCriterion("min_order_unit between", value1, value2, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andMinOrderUnitNotBetween(String value1, String value2) {
            addCriterion("min_order_unit not between", value1, value2, "minOrderUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitIsNull() {
            addCriterion("page_unit is null");
            return (Criteria) this;
        }

        public Criteria andPageUnitIsNotNull() {
            addCriterion("page_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPageUnitEqualTo(String value) {
            addCriterion("page_unit =", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitNotEqualTo(String value) {
            addCriterion("page_unit <>", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitGreaterThan(String value) {
            addCriterion("page_unit >", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitGreaterThanOrEqualTo(String value) {
            addCriterion("page_unit >=", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitLessThan(String value) {
            addCriterion("page_unit <", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitLessThanOrEqualTo(String value) {
            addCriterion("page_unit <=", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitLike(String value) {
            addCriterion("page_unit like", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitNotLike(String value) {
            addCriterion("page_unit not like", value, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitIn(List<String> values) {
            addCriterion("page_unit in", values, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitNotIn(List<String> values) {
            addCriterion("page_unit not in", values, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitBetween(String value1, String value2) {
            addCriterion("page_unit between", value1, value2, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPageUnitNotBetween(String value1, String value2) {
            addCriterion("page_unit not between", value1, value2, "pageUnit");
            return (Criteria) this;
        }

        public Criteria andPerPageNumIsNull() {
            addCriterion("per_page_num is null");
            return (Criteria) this;
        }

        public Criteria andPerPageNumIsNotNull() {
            addCriterion("per_page_num is not null");
            return (Criteria) this;
        }

        public Criteria andPerPageNumEqualTo(Float value) {
            addCriterion("per_page_num =", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumNotEqualTo(Float value) {
            addCriterion("per_page_num <>", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumGreaterThan(Float value) {
            addCriterion("per_page_num >", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumGreaterThanOrEqualTo(Float value) {
            addCriterion("per_page_num >=", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumLessThan(Float value) {
            addCriterion("per_page_num <", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumLessThanOrEqualTo(Float value) {
            addCriterion("per_page_num <=", value, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumIn(List<Float> values) {
            addCriterion("per_page_num in", values, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumNotIn(List<Float> values) {
            addCriterion("per_page_num not in", values, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumBetween(Float value1, Float value2) {
            addCriterion("per_page_num between", value1, value2, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageNumNotBetween(Float value1, Float value2) {
            addCriterion("per_page_num not between", value1, value2, "perPageNum");
            return (Criteria) this;
        }

        public Criteria andPerPageIsNull() {
            addCriterion("per_page is null");
            return (Criteria) this;
        }

        public Criteria andPerPageIsNotNull() {
            addCriterion("per_page is not null");
            return (Criteria) this;
        }

        public Criteria andPerPageEqualTo(Float value) {
            addCriterion("per_page =", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageNotEqualTo(Float value) {
            addCriterion("per_page <>", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageGreaterThan(Float value) {
            addCriterion("per_page >", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageGreaterThanOrEqualTo(Float value) {
            addCriterion("per_page >=", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageLessThan(Float value) {
            addCriterion("per_page <", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageLessThanOrEqualTo(Float value) {
            addCriterion("per_page <=", value, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageIn(List<Float> values) {
            addCriterion("per_page in", values, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageNotIn(List<Float> values) {
            addCriterion("per_page not in", values, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageBetween(Float value1, Float value2) {
            addCriterion("per_page between", value1, value2, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerPageNotBetween(Float value1, Float value2) {
            addCriterion("per_page not between", value1, value2, "perPage");
            return (Criteria) this;
        }

        public Criteria andPerWeightIsNull() {
            addCriterion("per_weight is null");
            return (Criteria) this;
        }

        public Criteria andPerWeightIsNotNull() {
            addCriterion("per_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPerWeightEqualTo(Float value) {
            addCriterion("per_weight =", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotEqualTo(Float value) {
            addCriterion("per_weight <>", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightGreaterThan(Float value) {
            addCriterion("per_weight >", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("per_weight >=", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightLessThan(Float value) {
            addCriterion("per_weight <", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightLessThanOrEqualTo(Float value) {
            addCriterion("per_weight <=", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightIn(List<Float> values) {
            addCriterion("per_weight in", values, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotIn(List<Float> values) {
            addCriterion("per_weight not in", values, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightBetween(Float value1, Float value2) {
            addCriterion("per_weight between", value1, value2, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotBetween(Float value1, Float value2) {
            addCriterion("per_weight not between", value1, value2, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionIsNull() {
            addCriterion("pg_description is null");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionIsNotNull() {
            addCriterion("pg_description is not null");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionEqualTo(String value) {
            addCriterion("pg_description =", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionNotEqualTo(String value) {
            addCriterion("pg_description <>", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionGreaterThan(String value) {
            addCriterion("pg_description >", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pg_description >=", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionLessThan(String value) {
            addCriterion("pg_description <", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("pg_description <=", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionLike(String value) {
            addCriterion("pg_description like", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionNotLike(String value) {
            addCriterion("pg_description not like", value, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionIn(List<String> values) {
            addCriterion("pg_description in", values, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionNotIn(List<String> values) {
            addCriterion("pg_description not in", values, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionBetween(String value1, String value2) {
            addCriterion("pg_description between", value1, value2, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andPgDescriptionNotBetween(String value1, String value2) {
            addCriterion("pg_description not between", value1, value2, "pgDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIsNull() {
            addCriterion("pro_description is null");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIsNotNull() {
            addCriterion("pro_description is not null");
            return (Criteria) this;
        }

        public Criteria andProDescriptionEqualTo(String value) {
            addCriterion("pro_description =", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotEqualTo(String value) {
            addCriterion("pro_description <>", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionGreaterThan(String value) {
            addCriterion("pro_description >", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pro_description >=", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLessThan(String value) {
            addCriterion("pro_description <", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLessThanOrEqualTo(String value) {
            addCriterion("pro_description <=", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLike(String value) {
            addCriterion("pro_description like", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotLike(String value) {
            addCriterion("pro_description not like", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIn(List<String> values) {
            addCriterion("pro_description in", values, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotIn(List<String> values) {
            addCriterion("pro_description not in", values, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionBetween(String value1, String value2) {
            addCriterion("pro_description between", value1, value2, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotBetween(String value1, String value2) {
            addCriterion("pro_description not between", value1, value2, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProUrlIsNull() {
            addCriterion("pro_url is null");
            return (Criteria) this;
        }

        public Criteria andProUrlIsNotNull() {
            addCriterion("pro_url is not null");
            return (Criteria) this;
        }

        public Criteria andProUrlEqualTo(String value) {
            addCriterion("pro_url =", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlNotEqualTo(String value) {
            addCriterion("pro_url <>", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlGreaterThan(String value) {
            addCriterion("pro_url >", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pro_url >=", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlLessThan(String value) {
            addCriterion("pro_url <", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlLessThanOrEqualTo(String value) {
            addCriterion("pro_url <=", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlLike(String value) {
            addCriterion("pro_url like", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlNotLike(String value) {
            addCriterion("pro_url not like", value, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlIn(List<String> values) {
            addCriterion("pro_url in", values, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlNotIn(List<String> values) {
            addCriterion("pro_url not in", values, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlBetween(String value1, String value2) {
            addCriterion("pro_url between", value1, value2, "proUrl");
            return (Criteria) this;
        }

        public Criteria andProUrlNotBetween(String value1, String value2) {
            addCriterion("pro_url not between", value1, value2, "proUrl");
            return (Criteria) this;
        }

        public Criteria andAttachKeyIsNull() {
            addCriterion("attach_key is null");
            return (Criteria) this;
        }

        public Criteria andAttachKeyIsNotNull() {
            addCriterion("attach_key is not null");
            return (Criteria) this;
        }

        public Criteria andAttachKeyEqualTo(String value) {
            addCriterion("attach_key =", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyNotEqualTo(String value) {
            addCriterion("attach_key <>", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyGreaterThan(String value) {
            addCriterion("attach_key >", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyGreaterThanOrEqualTo(String value) {
            addCriterion("attach_key >=", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyLessThan(String value) {
            addCriterion("attach_key <", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyLessThanOrEqualTo(String value) {
            addCriterion("attach_key <=", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyLike(String value) {
            addCriterion("attach_key like", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyNotLike(String value) {
            addCriterion("attach_key not like", value, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyIn(List<String> values) {
            addCriterion("attach_key in", values, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyNotIn(List<String> values) {
            addCriterion("attach_key not in", values, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyBetween(String value1, String value2) {
            addCriterion("attach_key between", value1, value2, "attachKey");
            return (Criteria) this;
        }

        public Criteria andAttachKeyNotBetween(String value1, String value2) {
            addCriterion("attach_key not between", value1, value2, "attachKey");
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