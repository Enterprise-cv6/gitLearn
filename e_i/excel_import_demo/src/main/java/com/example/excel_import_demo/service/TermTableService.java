package com.example.excel_import_demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TermTableService {
    void insert(List<Object[]> list);
}
