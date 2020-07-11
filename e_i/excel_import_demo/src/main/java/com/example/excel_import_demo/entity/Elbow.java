package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
* @Author: MQ
* @Description: 弯头列表
* @Date: 2020/7/6
**/
@Data
public class Elbow {
    //主键
    private int id;
    //所属管道id
    private int pipeId;
    //环焊缝编号
    private int ebWeldId;
    //检测里程
    private BigDecimal ebAbsoluteDistance;
    //特征识别
    private String ebFeature;
    //最近参考点名称
    private String ebNameNearestRp;
    //距最近参考点距离
    private BigDecimal ebDistanceNearestRp;
    //备注
    private String ebRemarks;
    //是否位于高后果区
    private String ebIsHcas;
}
