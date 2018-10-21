package com.unicom.ceo.model;

import java.math.BigDecimal;

public class BbBillT {
    private String user_id;

    private String fee_date;

    private String user_name;

    private BigDecimal fee;

    private String cell_id;

    private String discharge;

    private String keyword;

    private String user_status;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getFee_date() {
        return fee_date;
    }

    public void setFee_date(String fee_date) {
        this.fee_date = fee_date == null ? null : fee_date.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getCell_id() {
        return cell_id;
    }

    public void setCell_id(String cell_id) {
        this.cell_id = cell_id == null ? null : cell_id.trim();
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge == null ? null : discharge.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status == null ? null : user_status.trim();
    }
}