package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbProjectsInfoTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbProjectsInfoTExample() {
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

        public Criteria andProject_idIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProject_idIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProject_idEqualTo(String value) {
            addCriterion("project_id =", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotEqualTo(String value) {
            addCriterion("project_id <>", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idGreaterThan(String value) {
            addCriterion("project_id >", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idLessThan(String value) {
            addCriterion("project_id <", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idLike(String value) {
            addCriterion("project_id like", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotLike(String value) {
            addCriterion("project_id not like", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idIn(List<String> values) {
            addCriterion("project_id in", values, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotIn(List<String> values) {
            addCriterion("project_id not in", values, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "project_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idIsNull() {
            addCriterion("invest_id is null");
            return (Criteria) this;
        }

        public Criteria andInvest_idIsNotNull() {
            addCriterion("invest_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvest_idEqualTo(String value) {
            addCriterion("invest_id =", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idNotEqualTo(String value) {
            addCriterion("invest_id <>", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idGreaterThan(String value) {
            addCriterion("invest_id >", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idGreaterThanOrEqualTo(String value) {
            addCriterion("invest_id >=", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idLessThan(String value) {
            addCriterion("invest_id <", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idLessThanOrEqualTo(String value) {
            addCriterion("invest_id <=", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idLike(String value) {
            addCriterion("invest_id like", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idNotLike(String value) {
            addCriterion("invest_id not like", value, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idIn(List<String> values) {
            addCriterion("invest_id in", values, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idNotIn(List<String> values) {
            addCriterion("invest_id not in", values, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idBetween(String value1, String value2) {
            addCriterion("invest_id between", value1, value2, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_idNotBetween(String value1, String value2) {
            addCriterion("invest_id not between", value1, value2, "invest_id");
            return (Criteria) this;
        }

        public Criteria andInvest_nameIsNull() {
            addCriterion("invest_name is null");
            return (Criteria) this;
        }

        public Criteria andInvest_nameIsNotNull() {
            addCriterion("invest_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvest_nameEqualTo(String value) {
            addCriterion("invest_name =", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameNotEqualTo(String value) {
            addCriterion("invest_name <>", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameGreaterThan(String value) {
            addCriterion("invest_name >", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameGreaterThanOrEqualTo(String value) {
            addCriterion("invest_name >=", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameLessThan(String value) {
            addCriterion("invest_name <", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameLessThanOrEqualTo(String value) {
            addCriterion("invest_name <=", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameLike(String value) {
            addCriterion("invest_name like", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameNotLike(String value) {
            addCriterion("invest_name not like", value, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameIn(List<String> values) {
            addCriterion("invest_name in", values, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameNotIn(List<String> values) {
            addCriterion("invest_name not in", values, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameBetween(String value1, String value2) {
            addCriterion("invest_name between", value1, value2, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_nameNotBetween(String value1, String value2) {
            addCriterion("invest_name not between", value1, value2, "invest_name");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsIsNull() {
            addCriterion("invest_amounts is null");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsIsNotNull() {
            addCriterion("invest_amounts is not null");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsEqualTo(String value) {
            addCriterion("invest_amounts =", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsNotEqualTo(String value) {
            addCriterion("invest_amounts <>", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsGreaterThan(String value) {
            addCriterion("invest_amounts >", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsGreaterThanOrEqualTo(String value) {
            addCriterion("invest_amounts >=", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsLessThan(String value) {
            addCriterion("invest_amounts <", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsLessThanOrEqualTo(String value) {
            addCriterion("invest_amounts <=", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsLike(String value) {
            addCriterion("invest_amounts like", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsNotLike(String value) {
            addCriterion("invest_amounts not like", value, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsIn(List<String> values) {
            addCriterion("invest_amounts in", values, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsNotIn(List<String> values) {
            addCriterion("invest_amounts not in", values, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsBetween(String value1, String value2) {
            addCriterion("invest_amounts between", value1, value2, "invest_amounts");
            return (Criteria) this;
        }

        public Criteria andInvest_amountsNotBetween(String value1, String value2) {
            addCriterion("invest_amounts not between", value1, value2, "invest_amounts");
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

        public Criteria andProject_addressIsNull() {
            addCriterion("project_address is null");
            return (Criteria) this;
        }

        public Criteria andProject_addressIsNotNull() {
            addCriterion("project_address is not null");
            return (Criteria) this;
        }

        public Criteria andProject_addressEqualTo(String value) {
            addCriterion("project_address =", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressNotEqualTo(String value) {
            addCriterion("project_address <>", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressGreaterThan(String value) {
            addCriterion("project_address >", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressGreaterThanOrEqualTo(String value) {
            addCriterion("project_address >=", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressLessThan(String value) {
            addCriterion("project_address <", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressLessThanOrEqualTo(String value) {
            addCriterion("project_address <=", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressLike(String value) {
            addCriterion("project_address like", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressNotLike(String value) {
            addCriterion("project_address not like", value, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressIn(List<String> values) {
            addCriterion("project_address in", values, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressNotIn(List<String> values) {
            addCriterion("project_address not in", values, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressBetween(String value1, String value2) {
            addCriterion("project_address between", value1, value2, "project_address");
            return (Criteria) this;
        }

        public Criteria andProject_addressNotBetween(String value1, String value2) {
            addCriterion("project_address not between", value1, value2, "project_address");
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

        public Criteria andProject_statusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProject_statusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProject_statusEqualTo(String value) {
            addCriterion("project_status =", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusNotEqualTo(String value) {
            addCriterion("project_status <>", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusGreaterThan(String value) {
            addCriterion("project_status >", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusGreaterThanOrEqualTo(String value) {
            addCriterion("project_status >=", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusLessThan(String value) {
            addCriterion("project_status <", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusLessThanOrEqualTo(String value) {
            addCriterion("project_status <=", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusLike(String value) {
            addCriterion("project_status like", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusNotLike(String value) {
            addCriterion("project_status not like", value, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusIn(List<String> values) {
            addCriterion("project_status in", values, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusNotIn(List<String> values) {
            addCriterion("project_status not in", values, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusBetween(String value1, String value2) {
            addCriterion("project_status between", value1, value2, "project_status");
            return (Criteria) this;
        }

        public Criteria andProject_statusNotBetween(String value1, String value2) {
            addCriterion("project_status not between", value1, value2, "project_status");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portIsNull() {
            addCriterion("new_fixed_port is null");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portIsNotNull() {
            addCriterion("new_fixed_port is not null");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portEqualTo(Integer value) {
            addCriterion("new_fixed_port =", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portNotEqualTo(Integer value) {
            addCriterion("new_fixed_port <>", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portGreaterThan(Integer value) {
            addCriterion("new_fixed_port >", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_fixed_port >=", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portLessThan(Integer value) {
            addCriterion("new_fixed_port <", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portLessThanOrEqualTo(Integer value) {
            addCriterion("new_fixed_port <=", value, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portIn(List<Integer> values) {
            addCriterion("new_fixed_port in", values, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portNotIn(List<Integer> values) {
            addCriterion("new_fixed_port not in", values, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portBetween(Integer value1, Integer value2) {
            addCriterion("new_fixed_port between", value1, value2, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andNew_fixed_portNotBetween(Integer value1, Integer value2) {
            addCriterion("new_fixed_port not between", value1, value2, "new_fixed_port");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
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