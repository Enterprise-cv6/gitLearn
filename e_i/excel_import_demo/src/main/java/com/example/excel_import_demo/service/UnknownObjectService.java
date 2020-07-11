package com.example.excel_import_demo.service;

import com.example.excel_import_demo.entity.UnknownObject;
import org.springframework.stereotype.Service;

@Service
public interface UnknownObjectService {
    int insert(UnknownObject record);
}
