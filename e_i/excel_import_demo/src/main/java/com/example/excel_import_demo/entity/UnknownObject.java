package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UnknownObject {
    private Integer id;

    private Integer pipeId;

    private Integer uoWeldId;

    private BigDecimal uoAbsoluteDistance;

    private String uoFeature;

    private String uoOrientation;

    private BigDecimal uoWeldDistance;

    private String uoRpName;

    private BigDecimal uoRpDistance;

    private String uoRemarks;

    private Boolean uoIsHcas;

    private int year;

    private String uoBackup1;

    private String uoBackup2;

}