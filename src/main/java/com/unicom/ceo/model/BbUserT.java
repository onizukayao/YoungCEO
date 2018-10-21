package com.unicom.ceo.model;

public class BbUserT {
    private String user_id;

    private String service_kind;

    private String user_name;

    private String pspt_id;

    private String user_prod;

    private String in_date;

    private String ceo_id;

    private String ceo_person;

    private String dealer_id;

    private String dealer_name;

    private String building_no;

    private String building_name;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getService_kind() {
        return service_kind;
    }

    public void setService_kind(String service_kind) {
        this.service_kind = service_kind == null ? null : service_kind.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPspt_id() {
        return pspt_id;
    }

    public void setPspt_id(String pspt_id) {
        this.pspt_id = pspt_id == null ? null : pspt_id.trim();
    }

    public String getUser_prod() {
        return user_prod;
    }

    public void setUser_prod(String user_prod) {
        this.user_prod = user_prod == null ? null : user_prod.trim();
    }

    public String getIn_date() {
        return in_date;
    }

    public void setIn_date(String in_date) {
        this.in_date = in_date == null ? null : in_date.trim();
    }

    public String getCeo_id() {
        return ceo_id;
    }

    public void setCeo_id(String ceo_id) {
        this.ceo_id = ceo_id == null ? null : ceo_id.trim();
    }

    public String getCeo_person() {
        return ceo_person;
    }

    public void setCeo_person(String ceo_person) {
        this.ceo_person = ceo_person == null ? null : ceo_person.trim();
    }

    public String getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(String dealer_id) {
        this.dealer_id = dealer_id == null ? null : dealer_id.trim();
    }

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name == null ? null : dealer_name.trim();
    }

    public String getBuilding_no() {
        return building_no;
    }

    public void setBuilding_no(String building_no) {
        this.building_no = building_no == null ? null : building_no.trim();
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name == null ? null : building_name.trim();
    }
}