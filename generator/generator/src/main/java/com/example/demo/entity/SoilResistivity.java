package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SoilResistivity {
    private Integer id;

    private Integer pipeId;

    private String srTestStationId;

    private String srRelativePosition;

    private String srLongitude;

    private String srLatitude;

    private BigDecimal srSoilResistivity;

    private String srSoilCorrosionEval;

    private Date srDetectionTime;

    private String srRemarks;

    private Integer srYear;

    private String srBackup1;

    private String srBackup2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPipeId() {
        return pipeId;
    }

    public void setPipeId(Integer pipeId) {
        this.pipeId = pipeId;
    }

    public String getSrTestStationId() {
        return srTestStationId;
    }

    public void setSrTestStationId(String srTestStationId) {
        this.srTestStationId = srTestStationId == null ? null : srTestStationId.trim();
    }

    public String getSrRelativePosition() {
        return srRelativePosition;
    }

    public void setSrRelativePosition(String srRelativePosition) {
        this.srRelativePosition = srRelativePosition == null ? null : srRelativePosition.trim();
    }

    public String getSrLongitude() {
        return srLongitude;
    }

    public void setSrLongitude(String srLongitude) {
        this.srLongitude = srLongitude == null ? null : srLongitude.trim();
    }

    public String getSrLatitude() {
        return srLatitude;
    }

    public void setSrLatitude(String srLatitude) {
        this.srLatitude = srLatitude == null ? null : srLatitude.trim();
    }

    public BigDecimal getSrSoilResistivity() {
        return srSoilResistivity;
    }

    public void setSrSoilResistivity(BigDecimal srSoilResistivity) {
        this.srSoilResistivity = srSoilResistivity;
    }

    public String getSrSoilCorrosionEval() {
        return srSoilCorrosionEval;
    }

    public void setSrSoilCorrosionEval(String srSoilCorrosionEval) {
        this.srSoilCorrosionEval = srSoilCorrosionEval == null ? null : srSoilCorrosionEval.trim();
    }

    public Date getSrDetectionTime() {
        return srDetectionTime;
    }

    public void setSrDetectionTime(Date srDetectionTime) {
        this.srDetectionTime = srDetectionTime;
    }

    public String getSrRemarks() {
        return srRemarks;
    }

    public void setSrRemarks(String srRemarks) {
        this.srRemarks = srRemarks == null ? null : srRemarks.trim();
    }

    public Integer getSrYear() {
        return srYear;
    }

    public void setSrYear(Integer srYear) {
        this.srYear = srYear;
    }

    public String getSrBackup1() {
        return srBackup1;
    }

    public void setSrBackup1(String srBackup1) {
        this.srBackup1 = srBackup1 == null ? null : srBackup1.trim();
    }

    public String getSrBackup2() {
        return srBackup2;
    }

    public void setSrBackup2(String srBackup2) {
        this.srBackup2 = srBackup2 == null ? null : srBackup2.trim();
    }
}