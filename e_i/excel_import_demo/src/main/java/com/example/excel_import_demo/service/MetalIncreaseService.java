package com.example.excel_import_demo.service;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public interface MetalIncreaseService {
    void insert(List<Object[]> list) throws ParseException;

}
