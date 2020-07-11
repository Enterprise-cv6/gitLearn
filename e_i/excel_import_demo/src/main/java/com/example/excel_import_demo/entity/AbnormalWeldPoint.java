package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AbnormalWeldPoint {
    private Integer id;

    private Integer pipeId;

    private Integer abwWeldId;

    private BigDecimal abwAbsoluteDistance;

    private String abwFeature;

    private Integer abwLength;

    private Integer abwWidth;

    private String abwOrientation;

    private BigDecimal abwDistanceUpstream;

    private String abwNameNearestRp;

    private BigDecimal abwDistanceNearestRp;

    private String abwRemarks;

    private String abwIsHcas;
}