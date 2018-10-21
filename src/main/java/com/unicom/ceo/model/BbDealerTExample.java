package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BbDealerTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbDealerTExample() {
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

        public Criteria andDealer_idIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealer_idIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_idEqualTo(String value) {
            addCriterion("dealer_id =", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idNotEqualTo(String value) {
            addCriterion("dealer_id <>", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idGreaterThan(String value) {
            addCriterion("dealer_id >", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_id >=", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idLessThan(String value) {
            addCriterion("dealer_id <", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idLessThanOrEqualTo(String value) {
            addCriterion("dealer_id <=", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idLike(String value) {
            addCriterion("dealer_id like", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idNotLike(String value) {
            addCriterion("dealer_id not like", value, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idIn(List<String> values) {
            addCriterion("dealer_id in", values, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idNotIn(List<String> values) {
            addCriterion("dealer_id not in", values, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idBetween(String value1, String value2) {
            addCriterion("dealer_id between", value1, value2, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_idNotBetween(String value1, String value2) {
            addCriterion("dealer_id not between", value1, value2, "dealer_id");
            return (Criteria) this;
        }

        public Criteria andDealer_nameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealer_nameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_nameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameLike(String value) {
            addCriterion("dealer_name like", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andDealer_nameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealer_name");
            return (Criteria) this;
        }

        public Criteria andCeo_idIsNull() {
            addCriterion("ceo_id is null");
            return (Criteria) this;
        }

        public Criteria andCeo_idIsNotNull() {
            addCriterion("ceo_id is not null");
            return (Criteria) this;
        }

        public Criteria andCeo_idEqualTo(String value) {
            addCriterion("ceo_id =", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idNotEqualTo(String value) {
            addCriterion("ceo_id <>", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idGreaterThan(String value) {
            addCriterion("ceo_id >", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idGreaterThanOrEqualTo(String value) {
            addCriterion("ceo_id >=", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idLessThan(String value) {
            addCriterion("ceo_id <", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idLessThanOrEqualTo(String value) {
            addCriterion("ceo_id <=", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idLike(String value) {
            addCriterion("ceo_id like", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idNotLike(String value) {
            addCriterion("ceo_id not like", value, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idIn(List<String> values) {
            addCriterion("ceo_id in", values, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idNotIn(List<String> values) {
            addCriterion("ceo_id not in", values, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idBetween(String value1, String value2) {
            addCriterion("ceo_id between", value1, value2, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andCeo_idNotBetween(String value1, String value2) {
            addCriterion("ceo_id not between", value1, value2, "ceo_id");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andDealer_addressIsNull() {
            addCriterion("dealer_address is null");
            return (Criteria) this;
        }

        public Criteria andDealer_addressIsNotNull() {
            addCriterion("dealer_address is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_addressEqualTo(String value) {
            addCriterion("dealer_address =", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressNotEqualTo(String value) {
            addCriterion("dealer_address <>", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressGreaterThan(String value) {
            addCriterion("dealer_address >", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_address >=", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressLessThan(String value) {
            addCriterion("dealer_address <", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressLessThanOrEqualTo(String value) {
            addCriterion("dealer_address <=", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressLike(String value) {
            addCriterion("dealer_address like", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressNotLike(String value) {
            addCriterion("dealer_address not like", value, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressIn(List<String> values) {
            addCriterion("dealer_address in", values, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressNotIn(List<String> values) {
            addCriterion("dealer_address not in", values, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressBetween(String value1, String value2) {
            addCriterion("dealer_address between", value1, value2, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_addressNotBetween(String value1, String value2) {
            addCriterion("dealer_address not between", value1, value2, "dealer_address");
            return (Criteria) this;
        }

        public Criteria andDealer_costIsNull() {
            addCriterion("dealer_cost is null");
            return (Criteria) this;
        }

        public Criteria andDealer_costIsNotNull() {
            addCriterion("dealer_cost is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_costEqualTo(Long value) {
            addCriterion("dealer_cost =", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costNotEqualTo(Long value) {
            addCriterion("dealer_cost <>", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costGreaterThan(Long value) {
            addCriterion("dealer_cost >", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_cost >=", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costLessThan(Long value) {
            addCriterion("dealer_cost <", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costLessThanOrEqualTo(Long value) {
            addCriterion("dealer_cost <=", value, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costIn(List<Long> values) {
            addCriterion("dealer_cost in", values, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costNotIn(List<Long> values) {
            addCriterion("dealer_cost not in", values, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costBetween(Long value1, Long value2) {
            addCriterion("dealer_cost between", value1, value2, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_costNotBetween(Long value1, Long value2) {
            addCriterion("dealer_cost not between", value1, value2, "dealer_cost");
            return (Criteria) this;
        }

        public Criteria andDealer_stateIsNull() {
            addCriterion("dealer_state is null");
            return (Criteria) this;
        }

        public Criteria andDealer_stateIsNotNull() {
            addCriterion("dealer_state is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_stateEqualTo(String value) {
            addCriterion("dealer_state =", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateNotEqualTo(String value) {
            addCriterion("dealer_state <>", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateGreaterThan(String value) {
            addCriterion("dealer_state >", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_state >=", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateLessThan(String value) {
            addCriterion("dealer_state <", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateLessThanOrEqualTo(String value) {
            addCriterion("dealer_state <=", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateLike(String value) {
            addCriterion("dealer_state like", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateNotLike(String value) {
            addCriterion("dealer_state not like", value, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateIn(List<String> values) {
            addCriterion("dealer_state in", values, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateNotIn(List<String> values) {
            addCriterion("dealer_state not in", values, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateBetween(String value1, String value2) {
            addCriterion("dealer_state between", value1, value2, "dealer_state");
            return (Criteria) this;
        }

        public Criteria andDealer_stateNotBetween(String value1, String value2) {
            addCriterion("dealer_state not between", value1, value2, "dealer_state");
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