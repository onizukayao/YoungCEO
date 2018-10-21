package com.unicom.ceo.model;

public class BbCellTKey {
    private Integer id;

    private String cell_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCell_id() {
        return cell_id;
    }

    public void setCell_id(String cell_id) {
        this.cell_id = cell_id == null ? null : cell_id.trim();
    }
}