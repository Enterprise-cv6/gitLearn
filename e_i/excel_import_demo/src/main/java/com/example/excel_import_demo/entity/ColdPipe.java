package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ColdPipe {
    private Integer id;

    private Integer pipeId;

    private Integer cpWeldId;

    private BigDecimal cpAbsoluteDistance;

    private BigDecimal cpPipeLength;

    private String cpFeature;

    private String cpWeldType;

    private BigDecimal cpAveWallThickness;

    private String cpUpstreamIntersection;

    private String cpDownstreamIntersection;

    private String cpNameNearestRp;

    private BigDecimal cpDistanceNearestRp;

    private String cpRemarks;

}