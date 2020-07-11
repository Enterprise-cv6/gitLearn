package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PipeFeature {
    private Integer id;

    private Integer pipeId;

    private BigDecimal pfAbsoluteDistance;

    private BigDecimal pfWeldDistance;

    private BigDecimal pfPipejointLength;

    private String pfFeatureType;

    private String pfFeatureIdentify;

    private String pfCategory;

    private String pfOrientation;

    private BigDecimal pfWallThickness;

    private BigDecimal pfLength;

    private BigDecimal pfWide;

    private BigDecimal pfDeep;

    private String pfInOut;

    private String pfRemarks;

    private Boolean pfIsHcas;

    private int pfYear;
}