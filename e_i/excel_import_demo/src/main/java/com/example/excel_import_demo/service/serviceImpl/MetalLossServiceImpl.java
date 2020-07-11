package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.MetalLoss;
import com.example.excel_import_demo.mapper.MetalLossMapper;
import com.example.excel_import_demo.service.MetalLossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MetalLossServiceImpl implements MetalLossService {
    @Autowired
    private MetalLossMapper metalLossMapper;
//    @Override
//    public void insert(MetalLoss metalLoss){
//        metalLossMapper.insert(metalLoss);
//    }

    @Override
    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            MetalLoss metalLoss = new MetalLoss();
            metalLoss.setPipeId(100);
            metalLoss.setMlYear(2014);
            String mlWeldId = (String) list.get(i)[0];
            metalLoss.setMlWeldId(Double.valueOf(mlWeldId).intValue());
            BigDecimal mlAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            metalLoss.setMlAbsoluteDistance(mlAbsoluteDistance);
            metalLoss.setMlFeature((String) list.get(i)[2]);
            BigDecimal mlLength = new BigDecimal((String) list.get(i)[3]);
            metalLoss.setMlLength(mlLength);
            BigDecimal mlWidth = new BigDecimal((String) list.get(i)[4]);
            metalLoss.setMlWidth(mlWidth);
            BigDecimal mlDeep = new BigDecimal((String) list.get(i)[5]);
            metalLoss.setMlDeep(mlDeep);
            metalLoss.setMlOrientation((String) list.get(i)[6]);
            metalLoss.setMlInOut((String) list.get(i)[7]);
            BigDecimal mlWallThickness = new BigDecimal((String) list.get(i)[8]);
            metalLoss.setMlWallThickness(mlWallThickness);
            metalLoss.setMlSize((String) list.get(i)[9]);
            BigDecimal mlWeldDistance = new BigDecimal((String) list.get(i)[10]);
            metalLoss.setMlWeldDistance(mlWeldDistance);
            metalLoss.setMlRpName((String) list.get(i)[11]);
            BigDecimal mlRpDistance = new BigDecimal((String) list.get(i)[12]);
            metalLoss.setMlRpDistance(mlRpDistance);
            metalLoss.setMlRemarks((String) list.get(i)[13]);
            metalLoss.setIsHcas((String) list.get(i)[14]);
//                metalLoss.setMlYear((int)list.get(i)[16]);
            System.out.println(metalLoss.toString());
            metalLossMapper.insert(metalLoss);
        }
    }

}