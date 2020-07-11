package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MetalIncrease {
    private Integer id;

    private Integer pipeId;

    private Integer miWeldId;

    private BigDecimal miAbsoluteDistance;

    private String miFeature;

    private String miOrientation;

    private BigDecimal miWeldDistance;

    private String miRpName;

    private BigDecimal miRpDistance;

    private String miRemarks;

    private int  miYear=2014;

    private String miBackup1;

    private String miBackup2;



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

    public Integer getMiWeldId() {
        return miWeldId;
    }

    public void setMiWeldId(Integer miWeldId) {
        this.miWeldId = miWeldId;
    }

    public BigDecimal getMiAbsoluteDistance() {
        return miAbsoluteDistance;
    }

    public void setMiAbsoluteDistance(BigDecimal miAbsoluteDistance) {
        this.miAbsoluteDistance = miAbsoluteDistance;
    }

    public String getMiFeature() {
        return miFeature;
    }

    public void setMiFeature(String miFeature) {
        this.miFeature = miFeature;
    }

    public String getMiOrientation() {
        return miOrientation;
    }

    public void setMiOrientation(String miOrientation) {
        this.miOrientation = miOrientation;
    }

    public BigDecimal getMiWeldDistance() {
        return miWeldDistance;
    }

    public void setMiWeldDistance(BigDecimal miWeldDistance) {
        this.miWeldDistance = miWeldDistance;
    }

    public String getMiRpName() {
        return miRpName;
    }

    public void setMiRpName(String miRpName) {
        this.miRpName = miRpName;
    }

    public BigDecimal getMiRpDistance() {
        return miRpDistance;
    }

    public void setMiRpDistance(BigDecimal miRpDistance) {
        this.miRpDistance = miRpDistance;
    }

    public String getMiRemarks() {
        return miRemarks;
    }

    public void setMiRemarks(String miRemarks) {
        this.miRemarks = miRemarks;
    }

    public int getMiYear() {
        return miYear;
    }

    public void setMiYear(int miYear) {
        this.miYear = miYear;
    }

    public String getMiBackup1() {
        return miBackup1;
    }

    public void setMiBackup1(String miBackup1) {
        this.miBackup1 = miBackup1;
    }

    public String getMiBackup2() {
        return miBackup2;
    }

    public void setMiBackup2(String miBackup2) {
        this.miBackup2 = miBackup2;
    }

    @Override
    public String toString() {
        return "MetalIncrease{" +
                "id=" + id +
                ", pipeId=" + pipeId +
                ", miWeldId=" + miWeldId +
                ", miAbsoluteDistance=" + miAbsoluteDistance +
                ", miFeature='" + miFeature + '\'' +
                ", miOrientation='" + miOrientation + '\'' +
                ", miWeldDistance=" + miWeldDistance +
                ", miRpName='" + miRpName + '\'' +
                ", miRpDistance=" + miRpDistance +
                ", miRemarks='" + miRemarks + '\'' +
                ", miYear=" + miYear +
                ", miBackup1='" + miBackup1 + '\'' +
                ", miBackup2='" + miBackup2 + '\'' +
                '}';
    }
}