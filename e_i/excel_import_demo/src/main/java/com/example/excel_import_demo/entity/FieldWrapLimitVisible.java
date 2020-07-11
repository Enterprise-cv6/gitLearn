package com.example.excel_import_demo.entity;


import lombok.Data;

import java.math.BigDecimal;

//补口带下异常表
@Data
public class FieldWrapLimitVisible {
    //主键
    private Integer id;
    //所属管道id
    private Integer pipeId;
    //管节编号
    private Integer fwlvPipejointId;
    //检测里程
    private BigDecimal fwlvAbsoluteDistance;
    //管节长度
    private BigDecimal fwlvPipejointLength;
    //管节类型
    private String fwlvPipejointType;
    //壁厚
    private BigDecimal fwlvWallThickness;
    //上游交点
    private String fwlvUpIntersection;
    //下游交点
    private String fwlvDownIntersection;
    //最近参考点
    private String fwlvRpName;
    //距最近参考点距离
    private BigDecimal fwlvRpDistance;
    //备注
    private String fwlvRemark;
    //金属损失点深度
    private BigDecimal fwlvMlDepth;
    //金属损失点周向
    private String fwlvMlOrientation;
    //是否位于高后果区
    private String fwlvIsHcas;
    //所属年份
    private Integer fwlvYear;
}
