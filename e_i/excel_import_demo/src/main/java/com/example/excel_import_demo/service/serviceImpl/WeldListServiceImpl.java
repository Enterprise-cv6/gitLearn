package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.WeldList;
import com.example.excel_import_demo.mapper.WeldListMapper;
import com.example.excel_import_demo.service.WeldListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeldListServiceImpl implements WeldListService {

    @Autowired
    public WeldListMapper wmap;

    @Override
    public void insert(WeldList wl) {
        wmap.insert1(wl);
    }
}
