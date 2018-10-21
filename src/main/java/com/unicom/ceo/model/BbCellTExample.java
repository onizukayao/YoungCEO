package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BbCellTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbCellTExample() {
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

        public Criteria andCell_nameIsNull() {
            addCriterion("cell_name is null");
            return (Criteria) this;
        }

        public Criteria andCell_nameIsNotNull() {
            addCriterion("cell_name is not null");
            return (Criteria) this;
        }

        public Criteria andCell_nameEqualTo(String value) {
            addCriterion("cell_name =", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameNotEqualTo(String value) {
            addCriterion("cell_name <>", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameGreaterThan(String value) {
            addCriterion("cell_name >", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cell_name >=", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameLessThan(String value) {
            addCriterion("cell_name <", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameLessThanOrEqualTo(String value) {
            addCriterion("cell_name <=", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameLike(String value) {
            addCriterion("cell_name like", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameNotLike(String value) {
            addCriterion("cell_name not like", value, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameIn(List<String> values) {
            addCriterion("cell_name in", values, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameNotIn(List<String> values) {
            addCriterion("cell_name not in", values, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameBetween(String value1, String value2) {
            addCriterion("cell_name between", value1, value2, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_nameNotBetween(String value1, String value2) {
            addCriterion("cell_name not between", value1, value2, "cell_name");
            return (Criteria) this;
        }

        public Criteria andCell_kindIsNull() {
            addCriterion("cell_kind is null");
            return (Criteria) this;
        }

        public Criteria andCell_kindIsNotNull() {
            addCriterion("cell_kind is not null");
            return (Criteria) this;
        }

        public Criteria andCell_kindEqualTo(String value) {
            addCriterion("cell_kind =", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindNotEqualTo(String value) {
            addCriterion("cell_kind <>", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindGreaterThan(String value) {
            addCriterion("cell_kind >", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindGreaterThanOrEqualTo(String value) {
            addCriterion("cell_kind >=", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindLessThan(String value) {
            addCriterion("cell_kind <", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindLessThanOrEqualTo(String value) {
            addCriterion("cell_kind <=", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindLike(String value) {
            addCriterion("cell_kind like", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindNotLike(String value) {
            addCriterion("cell_kind not like", value, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindIn(List<String> values) {
            addCriterion("cell_kind in", values, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindNotIn(List<String> values) {
            addCriterion("cell_kind not in", values, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindBetween(String value1, String value2) {
            addCriterion("cell_kind between", value1, value2, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andCell_kindNotBetween(String value1, String value2) {
            addCriterion("cell_kind not between", value1, value2, "cell_kind");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andLacIsNull() {
            addCriterion("lac is null");
            return (Criteria) this;
        }

        public Criteria andLacIsNotNull() {
            addCriterion("lac is not null");
            return (Criteria) this;
        }

        public Criteria andLacEqualTo(String value) {
            addCriterion("lac =", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotEqualTo(String value) {
            addCriterion("lac <>", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThan(String value) {
            addCriterion("lac >", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacGreaterThanOrEqualTo(String value) {
            addCriterion("lac >=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThan(String value) {
            addCriterion("lac <", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLessThanOrEqualTo(String value) {
            addCriterion("lac <=", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacLike(String value) {
            addCriterion("lac like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotLike(String value) {
            addCriterion("lac not like", value, "lac");
            return (Criteria) this;
        }

        public Criteria andLacIn(List<String> values) {
            addCriterion("lac in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotIn(List<String> values) {
            addCriterion("lac not in", values, "lac");
            return (Criteria) this;
        }

        public Criteria andLacBetween(String value1, String value2) {
            addCriterion("lac between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andLacNotBetween(String value1, String value2) {
            addCriterion("lac not between", value1, value2, "lac");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("ci is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("ci is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(String value) {
            addCriterion("ci =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(String value) {
            addCriterion("ci <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(String value) {
            addCriterion("ci >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(String value) {
            addCriterion("ci >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(String value) {
            addCriterion("ci <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(String value) {
            addCriterion("ci <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLike(String value) {
            addCriterion("ci like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotLike(String value) {
            addCriterion("ci not like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<String> values) {
            addCriterion("ci in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<String> values) {
            addCriterion("ci not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(String value1, String value2) {
            addCriterion("ci between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(String value1, String value2) {
            addCriterion("ci not between", value1, value2, "ci");
            return (Criteria) this;
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

        public Criteria andCell_statusIsNull() {
            addCriterion("cell_status is null");
            return (Criteria) this;
        }

        public Criteria andCell_statusIsNotNull() {
            addCriterion("cell_status is not null");
            return (Criteria) this;
        }

        public Criteria andCell_statusEqualTo(String value) {
            addCriterion("cell_status =", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusNotEqualTo(String value) {
            addCriterion("cell_status <>", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusGreaterThan(String value) {
            addCriterion("cell_status >", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusGreaterThanOrEqualTo(String value) {
            addCriterion("cell_status >=", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusLessThan(String value) {
            addCriterion("cell_status <", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusLessThanOrEqualTo(String value) {
            addCriterion("cell_status <=", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusLike(String value) {
            addCriterion("cell_status like", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusNotLike(String value) {
            addCriterion("cell_status not like", value, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusIn(List<String> values) {
            addCriterion("cell_status in", values, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusNotIn(List<String> values) {
            addCriterion("cell_status not in", values, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusBetween(String value1, String value2) {
            addCriterion("cell_status between", value1, value2, "cell_status");
            return (Criteria) this;
        }

        public Criteria andCell_statusNotBetween(String value1, String value2) {
            addCriterion("cell_status not between", value1, value2, "cell_status");
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