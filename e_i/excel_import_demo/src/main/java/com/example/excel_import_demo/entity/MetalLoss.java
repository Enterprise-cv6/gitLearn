package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;
/**
* @Author: MQ
* @Description: 金属损失表
* @Date: 2020/7/4
**/
@Data
public class MetalLoss {

    private int id;

    private int pipeId;

    private int mlWeldId;

    private BigDecimal mlAbsoluteDistance;

    private String mlFeature;

    private BigDecimal mlLength;

    private BigDecimal mlWidth;

    private BigDecimal mlDeep;

    private String mlOrientation;

    private String mlInOut;

    private BigDecimal mlWallThickness;

    private String mlSize;

    private BigDecimal mlWeldDistance;

    private String mlRpName;

    private BigDecimal mlRpDistance;

    private String mlRemarks;

    private String isHcas;

    private int mlYear;

}
