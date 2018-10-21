package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BbBillTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbBillTExample() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andFee_dateIsNull() {
            addCriterion("fee_date is null");
            return (Criteria) this;
        }

        public Criteria andFee_dateIsNotNull() {
            addCriterion("fee_date is not null");
            return (Criteria) this;
        }

        public Criteria andFee_dateEqualTo(String value) {
            addCriterion("fee_date =", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateNotEqualTo(String value) {
            addCriterion("fee_date <>", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateGreaterThan(String value) {
            addCriterion("fee_date >", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateGreaterThanOrEqualTo(String value) {
            addCriterion("fee_date >=", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateLessThan(String value) {
            addCriterion("fee_date <", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateLessThanOrEqualTo(String value) {
            addCriterion("fee_date <=", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateLike(String value) {
            addCriterion("fee_date like", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateNotLike(String value) {
            addCriterion("fee_date not like", value, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateIn(List<String> values) {
            addCriterion("fee_date in", values, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateNotIn(List<String> values) {
            addCriterion("fee_date not in", values, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateBetween(String value1, String value2) {
            addCriterion("fee_date between", value1, value2, "fee_date");
            return (Criteria) this;
        }

        public Criteria andFee_dateNotBetween(String value1, String value2) {
            addCriterion("fee_date not between", value1, value2, "fee_date");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andCell_idIsNull() {
            addCriterion("cell_id is null");
            return (Criteria) this;
        }

        public Criteria andCell_idIsNotNull() {
            addCriterion("cell_id is not null");
            return (Criteria) this;
        }

        public Criteria andCell_idEqualTo(String value) {
            addCriterion("cell_id =", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idNotEqualTo(String value) {
            addCriterion("cell_id <>", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idGreaterThan(String value) {
            addCriterion("cell_id >", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idGreaterThanOrEqualTo(String value) {
            addCriterion("cell_id >=", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idLessThan(String value) {
            addCriterion("cell_id <", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idLessThanOrEqualTo(String value) {
            addCriterion("cell_id <=", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idLike(String value) {
            addCriterion("cell_id like", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idNotLike(String value) {
            addCriterion("cell_id not like", value, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idIn(List<String> values) {
            addCriterion("cell_id in", values, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idNotIn(List<String> values) {
            addCriterion("cell_id not in", values, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idBetween(String value1, String value2) {
            addCriterion("cell_id between", value1, value2, "cell_id");
            return (Criteria) this;
        }

        public Criteria andCell_idNotBetween(String value1, String value2) {
            addCriterion("cell_id not between", value1, value2, "cell_id");
            return (Criteria) this;
        }

        public Criteria andDischargeIsNull() {
            addCriterion("discharge is null");
            return (Criteria) this;
        }

        public Criteria andDischargeIsNotNull() {
            addCriterion("discharge is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeEqualTo(String value) {
            addCriterion("discharge =", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeNotEqualTo(String value) {
            addCriterion("discharge <>", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeGreaterThan(String value) {
            addCriterion("discharge >", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("discharge >=", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeLessThan(String value) {
            addCriterion("discharge <", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeLessThanOrEqualTo(String value) {
            addCriterion("discharge <=", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeLike(String value) {
            addCriterion("discharge like", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeNotLike(String value) {
            addCriterion("discharge not like", value, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeIn(List<String> values) {
            addCriterion("discharge in", values, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeNotIn(List<String> values) {
            addCriterion("discharge not in", values, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeBetween(String value1, String value2) {
            addCriterion("discharge between", value1, value2, "discharge");
            return (Criteria) this;
        }

        public Criteria andDischargeNotBetween(String value1, String value2) {
            addCriterion("discharge not between", value1, value2, "discharge");
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

        public Criteria andUser_statusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUser_statusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUser_statusEqualTo(String value) {
            addCriterion("user_status =", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusNotEqualTo(String value) {
            addCriterion("user_status <>", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusGreaterThan(String value) {
            addCriterion("user_status >", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusGreaterThanOrEqualTo(String value) {
            addCriterion("user_status >=", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusLessThan(String value) {
            addCriterion("user_status <", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusLessThanOrEqualTo(String value) {
            addCriterion("user_status <=", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusLike(String value) {
            addCriterion("user_status like", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusNotLike(String value) {
            addCriterion("user_status not like", value, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusIn(List<String> values) {
            addCriterion("user_status in", values, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusNotIn(List<String> values) {
            addCriterion("user_status not in", values, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusBetween(String value1, String value2) {
            addCriterion("user_status between", value1, value2, "user_status");
            return (Criteria) this;
        }

        public Criteria andUser_statusNotBetween(String value1, String value2) {
            addCriterion("user_status not between", value1, value2, "user_status");
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