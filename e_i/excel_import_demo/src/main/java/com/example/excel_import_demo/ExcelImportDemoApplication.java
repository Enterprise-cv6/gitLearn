package com.example.excel_import_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.excel_import_demo.mapper")
public class ExcelImportDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelImportDemoApplication.class, args);
    }

}
