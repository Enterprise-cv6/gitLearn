package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.Elbow;
import com.example.excel_import_demo.mapper.ElbowMapper;
import com.example.excel_import_demo.service.ElbowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ElbowServiceImpl implements ElbowService {
    @Autowired
    private ElbowMapper elbowMapper;

    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            Elbow elbow = new Elbow();
            elbow.setPipeId(100);
            String paWeldId = (String) list.get(i)[0];
            elbow.setEbWeldId(Double.valueOf(paWeldId).intValue());
            BigDecimal ebAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            elbow.setEbAbsoluteDistance(ebAbsoluteDistance);
            elbow.setEbFeature((String) list.get(i)[2]);
            elbow.setEbNameNearestRp((String) list.get(i)[3]);
            BigDecimal ebDistanceNearestRp = new BigDecimal((String) list.get(i)[4]);
            elbow.setEbDistanceNearestRp(ebDistanceNearestRp);
            elbow.setEbRemarks((String) list.get(i)[5]);
            elbow.setEbIsHcas((String) list.get(i)[6]);
            System.out.println(elbow.toString());
            elbowMapper.insert(elbow);
        }
    }
}
