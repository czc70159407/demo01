package com.offcn.pojo;

import java.util.ArrayList;
import java.util.List;

public class MobileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMobilenumIsNull() {
            addCriterion("mobilenum is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumIsNotNull() {
            addCriterion("mobilenum is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumEqualTo(Integer value) {
            addCriterion("mobilenum =", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumNotEqualTo(Integer value) {
            addCriterion("mobilenum <>", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumGreaterThan(Integer value) {
            addCriterion("mobilenum >", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobilenum >=", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumLessThan(Integer value) {
            addCriterion("mobilenum <", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumLessThanOrEqualTo(Integer value) {
            addCriterion("mobilenum <=", value, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumIn(List<Integer> values) {
            addCriterion("mobilenum in", values, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumNotIn(List<Integer> values) {
            addCriterion("mobilenum not in", values, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumBetween(Integer value1, Integer value2) {
            addCriterion("mobilenum between", value1, value2, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobilenumNotBetween(Integer value1, Integer value2) {
            addCriterion("mobilenum not between", value1, value2, "mobilenum");
            return (Criteria) this;
        }

        public Criteria andMobileareaIsNull() {
            addCriterion("mobilearea is null");
            return (Criteria) this;
        }

        public Criteria andMobileareaIsNotNull() {
            addCriterion("mobilearea is not null");
            return (Criteria) this;
        }

        public Criteria andMobileareaEqualTo(String value) {
            addCriterion("mobilearea =", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotEqualTo(String value) {
            addCriterion("mobilearea <>", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaGreaterThan(String value) {
            addCriterion("mobilearea >", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaGreaterThanOrEqualTo(String value) {
            addCriterion("mobilearea >=", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLessThan(String value) {
            addCriterion("mobilearea <", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLessThanOrEqualTo(String value) {
            addCriterion("mobilearea <=", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLike(String value) {
            addCriterion("mobilearea like", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotLike(String value) {
            addCriterion("mobilearea not like", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaIn(List<String> values) {
            addCriterion("mobilearea in", values, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotIn(List<String> values) {
            addCriterion("mobilearea not in", values, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaBetween(String value1, String value2) {
            addCriterion("mobilearea between", value1, value2, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotBetween(String value1, String value2) {
            addCriterion("mobilearea not between", value1, value2, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNull() {
            addCriterion("mobiletype is null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNotNull() {
            addCriterion("mobiletype is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeEqualTo(String value) {
            addCriterion("mobiletype =", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotEqualTo(String value) {
            addCriterion("mobiletype <>", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThan(String value) {
            addCriterion("mobiletype >", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("mobiletype >=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThan(String value) {
            addCriterion("mobiletype <", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThanOrEqualTo(String value) {
            addCriterion("mobiletype <=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLike(String value) {
            addCriterion("mobiletype like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotLike(String value) {
            addCriterion("mobiletype not like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIn(List<String> values) {
            addCriterion("mobiletype in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotIn(List<String> values) {
            addCriterion("mobiletype not in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeBetween(String value1, String value2) {
            addCriterion("mobiletype between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotBetween(String value1, String value2) {
            addCriterion("mobiletype not between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areacode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areacode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
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