package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
* @Author: MQ
* @Description: 管道附件表
* @Date: 2020/7/6
**/
@Data
public class PipingAccessories {
    //未知物列表id
    private int id;
    //所属管道id
    private int pipeId;
    //环焊缝编号
    private  int paWeldId;
    //检测里程
    private BigDecimal paAbsoluteDistance;
    //特征识别
    private String paFeature;
    //周向
    private String paOrientation;
    //上游环焊缝距离
    private BigDecimal paWeldDistance;
    //最近参考点
    private String paRpName;
    private int paYear;
    //距最近参考点的距离
    private BigDecimal paRpDistance;
    //备注
    private String paRemarks;
    //是否位于高后果区
    private String paIsHcas;
}
