package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.TermTable;
import com.example.excel_import_demo.mapper.TermTableMapper;
import com.example.excel_import_demo.service.TermTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermTableServiceImpl implements TermTableService {
    @Autowired
    private TermTableMapper termTableMapper;

    public void insert(List<Object[]> list){
        for (int i = 1; i < list.size(); i++) {
            //存在表的size问题,暂通过判空解决
//            System.out.println(list.size());
            TermTable termTable = new TermTable();
            String abb = (String) list.get(i)[0];
            if(abb == null) break;
            termTable.setTtAbbreviations(abb);
            termTable.setTtFullName((String) list.get(i)[1]);
            termTable.setTtChinese((String) list.get(i)[2]);
            termTable.setTtYear(2014);
            System.out.println(termTable.toString());
            termTableMapper.insert(termTable);
        }
    }
}
