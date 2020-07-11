package com.example.excel_import_demo.service;

import com.example.excel_import_demo.entity.WeldList;
import org.springframework.stereotype.Service;

@Service
public interface WeldListService {
    public void insert(WeldList wl);
}
