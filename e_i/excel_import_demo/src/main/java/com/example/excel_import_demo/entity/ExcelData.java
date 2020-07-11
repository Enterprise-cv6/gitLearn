package com.example.excel_import_demo.entity;

import java.util.List;

public class ExcelData {
    private String fileName;
    private String[] head;
    private List<String[]> data;

    public String getFileName() {
        return fileName;
    }

    public String[] getHead() {
        return head;
    }

    public List<String[]> getData() {
        return data;
    }
}
