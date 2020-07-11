package com.example.excel_import_demo.entity;

import lombok.Data;

@Data
public class TermTable {
    //特征缩写
    private String ttAbbreviations;
    //特征全称
    private String ttFullName;
    //中文释义
    private String ttChinese;
    //年份
    private int ttYear;
}
