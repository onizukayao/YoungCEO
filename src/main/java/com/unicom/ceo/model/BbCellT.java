package com.unicom.ceo.model;

import java.math.BigDecimal;

public class BbCellT extends BbCellTKey {
    private String cell_name;

    private String cell_kind;

    private String address;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String lac;

    private String ci;

    private String building_no;

    private String cell_status;

    public String getCell_name() {
        return cell_name;
    }

    public void setCell_name(String cell_name) {
        this.cell_name = cell_name == null ? null : cell_name.trim();
    }

    public String getCell_kind() {
        return cell_kind;
    }

    public void setCell_kind(String cell_kind) {
        this.cell_kind = cell_kind == null ? null : cell_kind.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac == null ? null : lac.trim();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci == null ? null : ci.trim();
    }

    public String getBuilding_no() {
        return building_no;
    }

    public void setBuilding_no(String building_no) {
        this.building_no = building_no == null ? null : building_no.trim();
    }

    public String getCell_status() {
        return cell_status;
    }

    public void setCell_status(String cell_status) {
        this.cell_status = cell_status == null ? null : cell_status.trim();
    }
}