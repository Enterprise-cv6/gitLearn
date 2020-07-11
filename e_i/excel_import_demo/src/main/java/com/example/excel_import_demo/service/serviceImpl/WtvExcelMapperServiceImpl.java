package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.WallThickness;
import com.example.excel_import_demo.mapper.WtvExcelMapper;
import com.example.excel_import_demo.service.WtvExcelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WtvExcelMapperServiceImpl implements WtvExcelMapperService {

    @Autowired
    private WtvExcelMapper Wtxmapper;

    @Override
    public void insert(WallThickness term) {
       Wtxmapper.insert(term);
    }
}
