package com.example.excel_import_demo.service.serviceImpl;


import com.example.excel_import_demo.entity.MetalIncrease;
import com.example.excel_import_demo.mapper.MetalIncreaseMapper;
import com.example.excel_import_demo.service.MetalIncreaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

@Service
public class MetalIncreaseServiceImpl implements MetalIncreaseService {

    @Autowired
    private MetalIncreaseMapper metalIncreaseMapper;

    public void insert(List<Object[]> list) throws ParseException {
        for(int i = 2;i< list.size();i++){
            MetalIncrease metalIncrease = new MetalIncrease();
            metalIncrease.setPipeId(100);

            //编号
            String meIncreaceId = (String) list.get(i)[0];
            metalIncrease.setMiWeldId(Double.valueOf(meIncreaceId).intValue());

            //里程
            BigDecimal miAbsoluteDistance = new BigDecimal((String)list.get(i)[1]);
            metalIncrease.setMiAbsoluteDistance(miAbsoluteDistance);

            //特征
            metalIncrease.setMiFeature((String)list.get(i)[2]);

            //周向
            metalIncrease.setMiOrientation((String)list.get(i)[3]);

            //距离
            BigDecimal miWeldDistance = new BigDecimal((String) list.get(i)[4]);
            metalIncrease.setMiWeldDistance(miWeldDistance);

            //参考点
            metalIncrease.setMiRpName((String)list.get(i)[5]);

            //最近参考点
            BigDecimal miRpDistance = new BigDecimal((String)list.get(i)[6]);
            metalIncrease.setMiRpDistance(miRpDistance);

            //备注
            metalIncrease.setMiRemarks((String)list.get(i)[7]);


            System.out.println(metalIncrease);

            metalIncreaseMapper.insert(metalIncrease);
        }

    }

}
