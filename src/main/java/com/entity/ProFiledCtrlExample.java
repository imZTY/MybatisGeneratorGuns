package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProFiledCtrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProFiledCtrlExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyId like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyId not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andFilednameIsNull() {
            addCriterion("filedName is null");
            return (Criteria) this;
        }

        public Criteria andFilednameIsNotNull() {
            addCriterion("filedName is not null");
            return (Criteria) this;
        }

        public Criteria andFilednameEqualTo(String value) {
            addCriterion("filedName =", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameNotEqualTo(String value) {
            addCriterion("filedName <>", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameGreaterThan(String value) {
            addCriterion("filedName >", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameGreaterThanOrEqualTo(String value) {
            addCriterion("filedName >=", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameLessThan(String value) {
            addCriterion("filedName <", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameLessThanOrEqualTo(String value) {
            addCriterion("filedName <=", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameLike(String value) {
            addCriterion("filedName like", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameNotLike(String value) {
            addCriterion("filedName not like", value, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameIn(List<String> values) {
            addCriterion("filedName in", values, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameNotIn(List<String> values) {
            addCriterion("filedName not in", values, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameBetween(String value1, String value2) {
            addCriterion("filedName between", value1, value2, "filedname");
            return (Criteria) this;
        }

        public Criteria andFilednameNotBetween(String value1, String value2) {
            addCriterion("filedName not between", value1, value2, "filedname");
            return (Criteria) this;
        }

        public Criteria andFiledlabelIsNull() {
            addCriterion("filedLabel is null");
            return (Criteria) this;
        }

        public Criteria andFiledlabelIsNotNull() {
            addCriterion("filedLabel is not null");
            return (Criteria) this;
        }

        public Criteria andFiledlabelEqualTo(String value) {
            addCriterion("filedLabel =", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelNotEqualTo(String value) {
            addCriterion("filedLabel <>", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelGreaterThan(String value) {
            addCriterion("filedLabel >", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelGreaterThanOrEqualTo(String value) {
            addCriterion("filedLabel >=", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelLessThan(String value) {
            addCriterion("filedLabel <", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelLessThanOrEqualTo(String value) {
            addCriterion("filedLabel <=", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelLike(String value) {
            addCriterion("filedLabel like", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelNotLike(String value) {
            addCriterion("filedLabel not like", value, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelIn(List<String> values) {
            addCriterion("filedLabel in", values, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelNotIn(List<String> values) {
            addCriterion("filedLabel not in", values, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelBetween(String value1, String value2) {
            addCriterion("filedLabel between", value1, value2, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andFiledlabelNotBetween(String value1, String value2) {
            addCriterion("filedLabel not between", value1, value2, "filedlabel");
            return (Criteria) this;
        }

        public Criteria andIsfixedIsNull() {
            addCriterion("isFixed is null");
            return (Criteria) this;
        }

        public Criteria andIsfixedIsNotNull() {
            addCriterion("isFixed is not null");
            return (Criteria) this;
        }

        public Criteria andIsfixedEqualTo(String value) {
            addCriterion("isFixed =", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedNotEqualTo(String value) {
            addCriterion("isFixed <>", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedGreaterThan(String value) {
            addCriterion("isFixed >", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedGreaterThanOrEqualTo(String value) {
            addCriterion("isFixed >=", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedLessThan(String value) {
            addCriterion("isFixed <", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedLessThanOrEqualTo(String value) {
            addCriterion("isFixed <=", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedLike(String value) {
            addCriterion("isFixed like", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedNotLike(String value) {
            addCriterion("isFixed not like", value, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedIn(List<String> values) {
            addCriterion("isFixed in", values, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedNotIn(List<String> values) {
            addCriterion("isFixed not in", values, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedBetween(String value1, String value2) {
            addCriterion("isFixed between", value1, value2, "isfixed");
            return (Criteria) this;
        }

        public Criteria andIsfixedNotBetween(String value1, String value2) {
            addCriterion("isFixed not between", value1, value2, "isfixed");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("tips not between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNull() {
            addCriterion("defaultValue is null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIsNotNull() {
            addCriterion("defaultValue is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueEqualTo(String value) {
            addCriterion("defaultValue =", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotEqualTo(String value) {
            addCriterion("defaultValue <>", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThan(String value) {
            addCriterion("defaultValue >", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("defaultValue >=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThan(String value) {
            addCriterion("defaultValue <", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("defaultValue <=", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueLike(String value) {
            addCriterion("defaultValue like", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotLike(String value) {
            addCriterion("defaultValue not like", value, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueIn(List<String> values) {
            addCriterion("defaultValue in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotIn(List<String> values) {
            addCriterion("defaultValue not in", values, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueBetween(String value1, String value2) {
            addCriterion("defaultValue between", value1, value2, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andDefaultvalueNotBetween(String value1, String value2) {
            addCriterion("defaultValue not between", value1, value2, "defaultvalue");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNull() {
            addCriterion("isRequired is null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNotNull() {
            addCriterion("isRequired is not null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredEqualTo(String value) {
            addCriterion("isRequired =", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotEqualTo(String value) {
            addCriterion("isRequired <>", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThan(String value) {
            addCriterion("isRequired >", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThanOrEqualTo(String value) {
            addCriterion("isRequired >=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThan(String value) {
            addCriterion("isRequired <", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThanOrEqualTo(String value) {
            addCriterion("isRequired <=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLike(String value) {
            addCriterion("isRequired like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotLike(String value) {
            addCriterion("isRequired not like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIn(List<String> values) {
            addCriterion("isRequired in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotIn(List<String> values) {
            addCriterion("isRequired not in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredBetween(String value1, String value2) {
            addCriterion("isRequired between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotBetween(String value1, String value2) {
            addCriterion("isRequired not between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIshideIsNull() {
            addCriterion("isHide is null");
            return (Criteria) this;
        }

        public Criteria andIshideIsNotNull() {
            addCriterion("isHide is not null");
            return (Criteria) this;
        }

        public Criteria andIshideEqualTo(String value) {
            addCriterion("isHide =", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotEqualTo(String value) {
            addCriterion("isHide <>", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThan(String value) {
            addCriterion("isHide >", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThanOrEqualTo(String value) {
            addCriterion("isHide >=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThan(String value) {
            addCriterion("isHide <", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThanOrEqualTo(String value) {
            addCriterion("isHide <=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLike(String value) {
            addCriterion("isHide like", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotLike(String value) {
            addCriterion("isHide not like", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideIn(List<String> values) {
            addCriterion("isHide in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotIn(List<String> values) {
            addCriterion("isHide not in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideBetween(String value1, String value2) {
            addCriterion("isHide between", value1, value2, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotBetween(String value1, String value2) {
            addCriterion("isHide not between", value1, value2, "ishide");
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