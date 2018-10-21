package com.unicom.ceo.model;

import java.math.BigDecimal;
import java.util.Date;

public class BbProjectsInfoT {
    private String project_id;

    private String invest_id;

    private String invest_name;

    private String invest_amounts;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String project_address;

    private String building_no;

    private String project_status;

    private Integer new_fixed_port;

    private Date create_date;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id == null ? null : project_id.trim();
    }

    public String getInvest_id() {
        return invest_id;
    }

    public void setInvest_id(String invest_id) {
        this.invest_id = invest_id == null ? null : invest_id.trim();
    }

    public String getInvest_name() {
        return invest_name;
    }

    public void setInvest_name(String invest_name) {
        this.invest_name = invest_name == null ? null : invest_name.trim();
    }

    public String getInvest_amounts() {
        return invest_amounts;
    }

    public void setInvest_amounts(String invest_amounts) {
        this.invest_amounts = invest_amounts == null ? null : invest_amounts.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getProject_address() {
        return project_address;
    }

    public void setProject_address(String project_address) {
        this.project_address = project_address == null ? null : project_address.trim();
    }

    public String getBuilding_no() {
        return building_no;
    }

    public void setBuilding_no(String building_no) {
        this.building_no = building_no == null ? null : building_no.trim();
    }

    public String getProject_status() {
        return project_status;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status == null ? null : project_status.trim();
    }

    public Integer getNew_fixed_port() {
        return new_fixed_port;
    }

    public void setNew_fixed_port(Integer new_fixed_port) {
        this.new_fixed_port = new_fixed_port;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}