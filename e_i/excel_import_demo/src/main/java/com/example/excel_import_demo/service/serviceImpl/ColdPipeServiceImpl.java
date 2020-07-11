package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.ColdPipe;
import com.example.excel_import_demo.mapper.ColdPipeMapper;
import com.example.excel_import_demo.service.ColdPipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ColdPipeServiceImpl implements ColdPipeService {

    @Autowired
    private ColdPipeMapper coldPipeMapper;

    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            ColdPipe coldPipe = new ColdPipe();
            coldPipe.setPipeId(100);
            String cpWeldId = (String) list.get(i)[0];
            coldPipe.setCpWeldId(Double.valueOf(cpWeldId).intValue());
            BigDecimal cpAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            coldPipe.setCpAbsoluteDistance(cpAbsoluteDistance);
            BigDecimal cpPipeLength = new BigDecimal((String) list.get(i)[2]);
            coldPipe.setCpPipeLength(cpPipeLength);
            coldPipe.setCpFeature((String) list.get(i)[3]);
            coldPipe.setCpWeldType((String) list.get(i)[4]);
            BigDecimal cpAveWallThickness = new BigDecimal((String) list.get(i)[5]);
            coldPipe.setCpAveWallThickness(cpAveWallThickness);
            coldPipe.setCpUpstreamIntersection((String) list.get(i)[6]);
            coldPipe.setCpDownstreamIntersection((String) list.get(i)[7]);
            coldPipe.setCpNameNearestRp((String) list.get(i)[8]);
            BigDecimal cpDistanceNearestRp = new BigDecimal((String) list.get(i)[9]);
            coldPipe.setCpDistanceNearestRp(cpDistanceNearestRp);
            coldPipe.setCpRemarks((String) list.get(i)[10]);
            System.out.println(coldPipe.toString());
            coldPipeMapper.insert(coldPipe);
        }
    }
}
