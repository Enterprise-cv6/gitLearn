package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.AbnormalWeldPoint;
import com.example.excel_import_demo.mapper.AbnormalWeldPointMapper;
import com.example.excel_import_demo.service.AbnormalWeldPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class AbnormalWeldPointServiceImpl implements AbnormalWeldPointService {
    @Autowired
    private AbnormalWeldPointMapper abnormalWeldPointMapper;

    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            AbnormalWeldPoint abnormalWeldPoint = new AbnormalWeldPoint();
            abnormalWeldPoint.setPipeId(100);
            String abwWeldId = (String) list.get(i)[0];
            abnormalWeldPoint.setAbwWeldId(Double.valueOf(abwWeldId).intValue());
            BigDecimal abwAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            abnormalWeldPoint.setAbwAbsoluteDistance(abwAbsoluteDistance);
            abnormalWeldPoint.setAbwFeature((String) list.get(i)[2]);
            String abwLength = (String) list.get(i)[3];
            abnormalWeldPoint.setAbwLength(Double.valueOf(abwLength).intValue());
            String abwWidth = (String) list.get(i)[4];
            abnormalWeldPoint.setAbwWidth(Double.valueOf(abwWidth).intValue());
            abnormalWeldPoint.setAbwOrientation((String) list.get(i)[5]);
            BigDecimal abwDistanceUpstream = new BigDecimal((String) list.get(i)[6]);
            abnormalWeldPoint.setAbwDistanceUpstream(abwDistanceUpstream);
            abnormalWeldPoint.setAbwNameNearestRp((String) list.get(i)[7]);
            BigDecimal abwDistanceNearestRp = new BigDecimal((String) list.get(i)[8]);
            abnormalWeldPoint.setAbwDistanceNearestRp(abwDistanceNearestRp);
            abnormalWeldPoint.setAbwRemarks((String) list.get(i)[9]);
            abnormalWeldPoint.setAbwIsHcas((String) list.get(i)[10]);
            System.out.println(abnormalWeldPoint.toString());
            abnormalWeldPointMapper.insert(abnormalWeldPoint);
        }
    }
}
