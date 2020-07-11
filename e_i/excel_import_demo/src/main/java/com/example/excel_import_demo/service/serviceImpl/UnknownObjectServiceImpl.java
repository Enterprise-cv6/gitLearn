package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.UnknownObject;
import com.example.excel_import_demo.mapper.UnknownObjectMapper;
import com.example.excel_import_demo.service.UnknownObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnknownObjectServiceImpl implements UnknownObjectService {

    @Autowired
   private UnknownObjectMapper uom;

    @Override
    public int insert(UnknownObject record) {
        return uom.insert(record);
    }
}
