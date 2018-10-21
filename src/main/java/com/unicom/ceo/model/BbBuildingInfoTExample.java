package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BbBuildingInfoTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbBuildingInfoTExample() {
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

        public Criteria andBuilding_noIsNull() {
            addCriterion("building_no is null");
            return (Criteria) this;
        }

        public Criteria andBuilding_noIsNotNull() {
            addCriterion("building_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuilding_noEqualTo(String value) {
            addCriterion("building_no =", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noNotEqualTo(String value) {
            addCriterion("building_no <>", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noGreaterThan(String value) {
            addCriterion("building_no >", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noGreaterThanOrEqualTo(String value) {
            addCriterion("building_no >=", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noLessThan(String value) {
            addCriterion("building_no <", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noLessThanOrEqualTo(String value) {
            addCriterion("building_no <=", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noLike(String value) {
            addCriterion("building_no like", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noNotLike(String value) {
            addCriterion("building_no not like", value, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noIn(List<String> values) {
            addCriterion("building_no in", values, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noNotIn(List<String> values) {
            addCriterion("building_no not in", values, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noBetween(String value1, String value2) {
            addCriterion("building_no between", value1, value2, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_noNotBetween(String value1, String value2) {
            addCriterion("building_no not between", value1, value2, "building_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameEqualTo(String value) {
            addCriterion("building_name =", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameGreaterThan(String value) {
            addCriterion("building_name >", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameLessThan(String value) {
            addCriterion("building_name <", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameLike(String value) {
            addCriterion("building_name like", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameNotLike(String value) {
            addCriterion("building_name not like", value, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameIn(List<String> values) {
            addCriterion("building_name in", values, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_nameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "building_name");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressIsNull() {
            addCriterion("building_address is null");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressIsNotNull() {
            addCriterion("building_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressEqualTo(String value) {
            addCriterion("building_address =", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressNotEqualTo(String value) {
            addCriterion("building_address <>", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressGreaterThan(String value) {
            addCriterion("building_address >", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressGreaterThanOrEqualTo(String value) {
            addCriterion("building_address >=", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressLessThan(String value) {
            addCriterion("building_address <", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressLessThanOrEqualTo(String value) {
            addCriterion("building_address <=", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressLike(String value) {
            addCriterion("building_address like", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressNotLike(String value) {
            addCriterion("building_address not like", value, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressIn(List<String> values) {
            addCriterion("building_address in", values, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressNotIn(List<String> values) {
            addCriterion("building_address not in", values, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressBetween(String value1, String value2) {
            addCriterion("building_address between", value1, value2, "building_address");
            return (Criteria) this;
        }

        public Criteria andBuilding_addressNotBetween(String value1, String value2) {
            addCriterion("building_address not between", value1, value2, "building_address");
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

        public Criteria andFixed_portIsNull() {
            addCriterion("fixed_port is null");
            return (Criteria) this;
        }

        public Criteria andFixed_portIsNotNull() {
            addCriterion("fixed_port is not null");
            return (Criteria) this;
        }

        public Criteria andFixed_portEqualTo(Integer value) {
            addCriterion("fixed_port =", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portNotEqualTo(Integer value) {
            addCriterion("fixed_port <>", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portGreaterThan(Integer value) {
            addCriterion("fixed_port >", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portGreaterThanOrEqualTo(Integer value) {
            addCriterion("fixed_port >=", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portLessThan(Integer value) {
            addCriterion("fixed_port <", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portLessThanOrEqualTo(Integer value) {
            addCriterion("fixed_port <=", value, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portIn(List<Integer> values) {
            addCriterion("fixed_port in", values, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portNotIn(List<Integer> values) {
            addCriterion("fixed_port not in", values, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portBetween(Integer value1, Integer value2) {
            addCriterion("fixed_port between", value1, value2, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andFixed_portNotBetween(Integer value1, Integer value2) {
            addCriterion("fixed_port not between", value1, value2, "fixed_port");
            return (Criteria) this;
        }

        public Criteria andUse_portIsNull() {
            addCriterion("use_port is null");
            return (Criteria) this;
        }

        public Criteria andUse_portIsNotNull() {
            addCriterion("use_port is not null");
            return (Criteria) this;
        }

        public Criteria andUse_portEqualTo(Integer value) {
            addCriterion("use_port =", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portNotEqualTo(Integer value) {
            addCriterion("use_port <>", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portGreaterThan(Integer value) {
            addCriterion("use_port >", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_port >=", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portLessThan(Integer value) {
            addCriterion("use_port <", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portLessThanOrEqualTo(Integer value) {
            addCriterion("use_port <=", value, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portIn(List<Integer> values) {
            addCriterion("use_port in", values, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portNotIn(List<Integer> values) {
            addCriterion("use_port not in", values, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portBetween(Integer value1, Integer value2) {
            addCriterion("use_port between", value1, value2, "use_port");
            return (Criteria) this;
        }

        public Criteria andUse_portNotBetween(Integer value1, Integer value2) {
            addCriterion("use_port not between", value1, value2, "use_port");
            return (Criteria) this;
        }

        public Criteria andDealer_noIsNull() {
            addCriterion("dealer_no is null");
            return (Criteria) this;
        }

        public Criteria andDealer_noIsNotNull() {
            addCriterion("dealer_no is not null");
            return (Criteria) this;
        }

        public Criteria andDealer_noEqualTo(String value) {
            addCriterion("dealer_no =", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noNotEqualTo(String value) {
            addCriterion("dealer_no <>", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noGreaterThan(String value) {
            addCriterion("dealer_no >", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_no >=", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noLessThan(String value) {
            addCriterion("dealer_no <", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noLessThanOrEqualTo(String value) {
            addCriterion("dealer_no <=", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noLike(String value) {
            addCriterion("dealer_no like", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noNotLike(String value) {
            addCriterion("dealer_no not like", value, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noIn(List<String> values) {
            addCriterion("dealer_no in", values, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noNotIn(List<String> values) {
            addCriterion("dealer_no not in", values, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noBetween(String value1, String value2) {
            addCriterion("dealer_no between", value1, value2, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andDealer_noNotBetween(String value1, String value2) {
            addCriterion("dealer_no not between", value1, value2, "dealer_no");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusIsNull() {
            addCriterion("building_status is null");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusIsNotNull() {
            addCriterion("building_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusEqualTo(String value) {
            addCriterion("building_status =", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusNotEqualTo(String value) {
            addCriterion("building_status <>", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusGreaterThan(String value) {
            addCriterion("building_status >", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusGreaterThanOrEqualTo(String value) {
            addCriterion("building_status >=", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusLessThan(String value) {
            addCriterion("building_status <", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusLessThanOrEqualTo(String value) {
            addCriterion("building_status <=", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusLike(String value) {
            addCriterion("building_status like", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusNotLike(String value) {
            addCriterion("building_status not like", value, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusIn(List<String> values) {
            addCriterion("building_status in", values, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusNotIn(List<String> values) {
            addCriterion("building_status not in", values, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusBetween(String value1, String value2) {
            addCriterion("building_status between", value1, value2, "building_status");
            return (Criteria) this;
        }

        public Criteria andBuilding_statusNotBetween(String value1, String value2) {
            addCriterion("building_status not between", value1, value2, "building_status");
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