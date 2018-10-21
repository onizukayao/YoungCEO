package com.unicom.ceo.model;

import java.util.ArrayList;
import java.util.List;

public class BbUserTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbUserTExample() {
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

        public Criteria andService_kindIsNull() {
            addCriterion("service_kind is null");
            return (Criteria) this;
        }

        public Criteria andService_kindIsNotNull() {
            addCriterion("service_kind is not null");
            return (Criteria) this;
        }

        public Criteria andService_kindEqualTo(String value) {
            addCriterion("service_kind =", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindNotEqualTo(String value) {
            addCriterion("service_kind <>", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindGreaterThan(String value) {
            addCriterion("service_kind >", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindGreaterThanOrEqualTo(String value) {
            addCriterion("service_kind >=", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindLessThan(String value) {
            addCriterion("service_kind <", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindLessThanOrEqualTo(String value) {
            addCriterion("service_kind <=", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindLike(String value) {
            addCriterion("service_kind like", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindNotLike(String value) {
            addCriterion("service_kind not like", value, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindIn(List<String> values) {
            addCriterion("service_kind in", values, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindNotIn(List<String> values) {
            addCriterion("service_kind not in", values, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindBetween(String value1, String value2) {
            addCriterion("service_kind between", value1, value2, "service_kind");
            return (Criteria) this;
        }

        public Criteria andService_kindNotBetween(String value1, String value2) {
            addCriterion("service_kind not between", value1, value2, "service_kind");
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

        public Criteria andPspt_idIsNull() {
            addCriterion("pspt_id is null");
            return (Criteria) this;
        }

        public Criteria andPspt_idIsNotNull() {
            addCriterion("pspt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPspt_idEqualTo(String value) {
            addCriterion("pspt_id =", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idNotEqualTo(String value) {
            addCriterion("pspt_id <>", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idGreaterThan(String value) {
            addCriterion("pspt_id >", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idGreaterThanOrEqualTo(String value) {
            addCriterion("pspt_id >=", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idLessThan(String value) {
            addCriterion("pspt_id <", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idLessThanOrEqualTo(String value) {
            addCriterion("pspt_id <=", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idLike(String value) {
            addCriterion("pspt_id like", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idNotLike(String value) {
            addCriterion("pspt_id not like", value, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idIn(List<String> values) {
            addCriterion("pspt_id in", values, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idNotIn(List<String> values) {
            addCriterion("pspt_id not in", values, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idBetween(String value1, String value2) {
            addCriterion("pspt_id between", value1, value2, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andPspt_idNotBetween(String value1, String value2) {
            addCriterion("pspt_id not between", value1, value2, "pspt_id");
            return (Criteria) this;
        }

        public Criteria andUser_prodIsNull() {
            addCriterion("user_prod is null");
            return (Criteria) this;
        }

        public Criteria andUser_prodIsNotNull() {
            addCriterion("user_prod is not null");
            return (Criteria) this;
        }

        public Criteria andUser_prodEqualTo(String value) {
            addCriterion("user_prod =", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodNotEqualTo(String value) {
            addCriterion("user_prod <>", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodGreaterThan(String value) {
            addCriterion("user_prod >", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodGreaterThanOrEqualTo(String value) {
            addCriterion("user_prod >=", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodLessThan(String value) {
            addCriterion("user_prod <", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodLessThanOrEqualTo(String value) {
            addCriterion("user_prod <=", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodLike(String value) {
            addCriterion("user_prod like", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodNotLike(String value) {
            addCriterion("user_prod not like", value, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodIn(List<String> values) {
            addCriterion("user_prod in", values, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodNotIn(List<String> values) {
            addCriterion("user_prod not in", values, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodBetween(String value1, String value2) {
            addCriterion("user_prod between", value1, value2, "user_prod");
            return (Criteria) this;
        }

        public Criteria andUser_prodNotBetween(String value1, String value2) {
            addCriterion("user_prod not between", value1, value2, "user_prod");
            return (Criteria) this;
        }

        public Criteria andIn_dateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andIn_dateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andIn_dateEqualTo(String value) {
            addCriterion("in_date =", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateNotEqualTo(String value) {
            addCriterion("in_date <>", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateGreaterThan(String value) {
            addCriterion("in_date >", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateGreaterThanOrEqualTo(String value) {
            addCriterion("in_date >=", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateLessThan(String value) {
            addCriterion("in_date <", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateLessThanOrEqualTo(String value) {
            addCriterion("in_date <=", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateLike(String value) {
            addCriterion("in_date like", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateNotLike(String value) {
            addCriterion("in_date not like", value, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateIn(List<String> values) {
            addCriterion("in_date in", values, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateNotIn(List<String> values) {
            addCriterion("in_date not in", values, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateBetween(String value1, String value2) {
            addCriterion("in_date between", value1, value2, "in_date");
            return (Criteria) this;
        }

        public Criteria andIn_dateNotBetween(String value1, String value2) {
            addCriterion("in_date not between", value1, value2, "in_date");
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

        public Criteria andCeo_personIsNull() {
            addCriterion("ceo_person is null");
            return (Criteria) this;
        }

        public Criteria andCeo_personIsNotNull() {
            addCriterion("ceo_person is not null");
            return (Criteria) this;
        }

        public Criteria andCeo_personEqualTo(String value) {
            addCriterion("ceo_person =", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personNotEqualTo(String value) {
            addCriterion("ceo_person <>", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personGreaterThan(String value) {
            addCriterion("ceo_person >", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personGreaterThanOrEqualTo(String value) {
            addCriterion("ceo_person >=", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personLessThan(String value) {
            addCriterion("ceo_person <", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personLessThanOrEqualTo(String value) {
            addCriterion("ceo_person <=", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personLike(String value) {
            addCriterion("ceo_person like", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personNotLike(String value) {
            addCriterion("ceo_person not like", value, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personIn(List<String> values) {
            addCriterion("ceo_person in", values, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personNotIn(List<String> values) {
            addCriterion("ceo_person not in", values, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personBetween(String value1, String value2) {
            addCriterion("ceo_person between", value1, value2, "ceo_person");
            return (Criteria) this;
        }

        public Criteria andCeo_personNotBetween(String value1, String value2) {
            addCriterion("ceo_person not between", value1, value2, "ceo_person");
            return (Criteria) this;
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