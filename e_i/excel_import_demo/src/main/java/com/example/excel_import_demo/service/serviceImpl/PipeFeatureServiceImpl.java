package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.PipeFeature;
import com.example.excel_import_demo.mapper.PipeFeatureMapper;
import com.example.excel_import_demo.service.PipeFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class PipeFeatureServiceImpl implements PipeFeatureService {
    @Autowired
    private PipeFeatureMapper pipeFeatureMapper;

    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            PipeFeature pipeFeature = new PipeFeature();
            pipeFeature.setPipeId(100);
            pipeFeature.setPfYear(2014);
            String id = (String) list.get(i)[0];
            pipeFeature.setId(Double.valueOf(id).intValue());
            BigDecimal pfAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            pipeFeature.setPfAbsoluteDistance(pfAbsoluteDistance);
            BigDecimal pfWeldDistance = new BigDecimal((String) list.get(i)[2]);
            pipeFeature.setPfWeldDistance(pfWeldDistance);
            if(list.get(i)[3] != null){
                BigDecimal pfPipejointLength = new BigDecimal((String) list.get(i)[3]);
                pipeFeature.setPfPipejointLength(pfPipejointLength);
            }
            pipeFeature.setPfFeatureType((String) list.get(i)[4]);
            pipeFeature.setPfFeatureIdentify((String) list.get(i)[5]);
            pipeFeature.setPfCategory((String) list.get(i)[6]);
            pipeFeature.setPfOrientation((String) list.get(i)[7]);
            if(list.get(i)[8] != null){
                BigDecimal pfWallThickness = new BigDecimal((String) list.get(i)[8]);
                pipeFeature.setPfWallThickness(pfWallThickness);
            }
            if(list.get(i)[9] != null){
                BigDecimal pfLength = new BigDecimal((String) list.get(i)[9]);
                pipeFeature.setPfLength(pfLength);
            }
            if(list.get(i)[10] != null){
                BigDecimal pfWide = new BigDecimal((String) list.get(i)[10]);
                pipeFeature.setPfWide(pfWide);
            }
            if(list.get(i)[11] != null){
                BigDecimal pfDeep = new BigDecimal((String) list.get(i)[11]);
                pipeFeature.setPfDeep(pfDeep);
            }

            pipeFeature.setPfInOut((String)list.get(i)[12]);
            pipeFeature.setPfRemarks((String)list.get(i)[13]);

            System.out.println(pipeFeature.toString());
            pipeFeatureMapper.insert(pipeFeature);
        }
    }
}
