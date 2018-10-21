package com.unicom.ceo.model;

import java.math.BigDecimal;

public class BbDealerT {
    private String dealer_id;

    private String dealer_name;

    private String ceo_id;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String dealer_address;

    private Long dealer_cost;

    private String dealer_state;

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

    public String getCeo_id() {
        return ceo_id;
    }

    public void setCeo_id(String ceo_id) {
        this.ceo_id = ceo_id == null ? null : ceo_id.trim();
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

    public String getDealer_address() {
        return dealer_address;
    }

    public void setDealer_address(String dealer_address) {
        this.dealer_address = dealer_address == null ? null : dealer_address.trim();
    }

    public Long getDealer_cost() {
        return dealer_cost;
    }

    public void setDealer_cost(Long dealer_cost) {
        this.dealer_cost = dealer_cost;
    }

    public String getDealer_state() {
        return dealer_state;
    }

    public void setDealer_state(String dealer_state) {
        this.dealer_state = dealer_state == null ? null : dealer_state.trim();
    }
}