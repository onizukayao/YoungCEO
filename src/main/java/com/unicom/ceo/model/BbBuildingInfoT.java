package com.unicom.ceo.model;

import java.math.BigDecimal;

public class BbBuildingInfoT {
    private String building_no;

    private String building_name;

    private String building_address;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Integer fixed_port;

    private Integer use_port;

    private String dealer_no;

    private String building_status;

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

    public String getBuilding_address() {
        return building_address;
    }

    public void setBuilding_address(String building_address) {
        this.building_address = building_address == null ? null : building_address.trim();
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

    public Integer getFixed_port() {
        return fixed_port;
    }

    public void setFixed_port(Integer fixed_port) {
        this.fixed_port = fixed_port;
    }

    public Integer getUse_port() {
        return use_port;
    }

    public void setUse_port(Integer use_port) {
        this.use_port = use_port;
    }

    public String getDealer_no() {
        return dealer_no;
    }

    public void setDealer_no(String dealer_no) {
        this.dealer_no = dealer_no == null ? null : dealer_no.trim();
    }

    public String getBuilding_status() {
        return building_status;
    }

    public void setBuilding_status(String building_status) {
        this.building_status = building_status == null ? null : building_status.trim();
    }
}