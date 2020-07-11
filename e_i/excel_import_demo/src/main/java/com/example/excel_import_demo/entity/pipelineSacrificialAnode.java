package com.example.excel_import_demo.entity;

import java.math.BigDecimal;

public class pipelineSacrificialAnode {
    private Integer id;

    private Integer year;

    private Integer pipeId;

    private String psaTestStationId;

    private String psaRelativePosition;

    private String psaEastLongtitude;

    private String psaNorthLatitude;

    private String psaSacrificialCurrentout;

    private BigDecimal psaSacrificialAnodeGroundingPotential;

    private String psaSacrificialAnodeGroundingResistance;

    private String remarks;

    private String backup1;

    public String getPsaSacrificialAnodeGroundingResistance() {
        return psaSacrificialAnodeGroundingResistance;
    }

    public void setPsaSacrificialAnodeGroundingResistance(String psaSacrificialAnodeGroundingResistance) {
        this.psaSacrificialAnodeGroundingResistance = psaSacrificialAnodeGroundingResistance;
    }

    private String backup2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPipeId() {
        return pipeId;
    }

    public void setPipeId(Integer pipeId) {
        this.pipeId = pipeId;
    }

    public String getPsaTestStationId() {
        return psaTestStationId;
    }

    public void setPsaTestStationId(String psaTestStationId) {
        this.psaTestStationId = psaTestStationId == null ? null : psaTestStationId.trim();
    }

    public String getPsaRelativePosition() {
        return psaRelativePosition;
    }

    public void setPsaRelativePosition(String psaRelativePosition) {
        this.psaRelativePosition = psaRelativePosition == null ? null : psaRelativePosition.trim();
    }

    public String getPsaEastLongtitude() {
        return psaEastLongtitude;
    }

    public void setPsaEastLongtitude(String psaEastLongtitude) {
        this.psaEastLongtitude = psaEastLongtitude == null ? null : psaEastLongtitude.trim();
    }

    public String getPsaNorthLatitude() {
        return psaNorthLatitude;
    }

    public void setPsaNorthLatitude(String psaNorthLatitude) {
        this.psaNorthLatitude = psaNorthLatitude == null ? null : psaNorthLatitude.trim();
    }

    public String getPsaSacrificialCurrentout() {
        return psaSacrificialCurrentout;
    }

    public void setPsaSacrificialCurrentout(String psaSacrificialCurrentout) {
        this.psaSacrificialCurrentout = psaSacrificialCurrentout;
    }

    public BigDecimal getPsaSacrificialAnodeGroundingPotential() {
        return psaSacrificialAnodeGroundingPotential;
    }

    public void setPsaSacrificialAnodeGroundingPotential(BigDecimal psaSacrificialAnodeGroundingPotential) {
        this.psaSacrificialAnodeGroundingPotential = psaSacrificialAnodeGroundingPotential;
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1 == null ? null : backup1.trim();
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2 == null ? null : backup2.trim();
    }
}