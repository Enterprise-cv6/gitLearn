package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.FieldWrapLimitVisible;
import com.example.excel_import_demo.mapper.FieldWrapLimitVisibleMapper;
import com.example.excel_import_demo.service.FieldWrapLimitVisibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldWrapLimitVisibleServiceImpl implements FieldWrapLimitVisibleService {

    @Autowired
    private FieldWrapLimitVisibleMapper fieldwraplimitvisibleMapper;

    @Override
    public void insert(List<Object[]> list){
        //list.size()存在问题，远超表的size,暂通过判空解决
        for(int i = 2; i < list.size(); i++){
            FieldWrapLimitVisible fieldwrap=new FieldWrapLimitVisible();
            fieldwrap.setPipeId(100);
            fieldwrap.setFwlvYear(2014);
            String fwlvPipejointId=(String)list.get(i)[0];
            if(fwlvPipejointId == null) break;
            fieldwrap.setFwlvPipejointId(Double.valueOf(fwlvPipejointId).intValue());

            BigDecimal fwlvAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            fieldwrap.setFwlvAbsoluteDistance(fwlvAbsoluteDistance);

            BigDecimal fwlvPipejointLength = new BigDecimal((String) list.get(i)[2]);
            fieldwrap.setFwlvPipejointLength(fwlvPipejointLength);

            fieldwrap.setFwlvPipejointType((String)list.get(i)[3]);

            BigDecimal fwlvWallThickness = new BigDecimal((String) list.get(i)[4]);
            fieldwrap.setFwlvWallThickness(fwlvWallThickness);

            fieldwrap.setFwlvUpIntersection((String)list.get(i)[5]);

            fieldwrap.setFwlvDownIntersection((String)list.get(i)[6]);

            fieldwrap.setFwlvRpName((String)list.get(i)[7]);

            BigDecimal fwlvRpDistance = new BigDecimal((String) list.get(i)[8]);
            fieldwrap.setFwlvRpDistance(fwlvRpDistance);

            fieldwrap.setFwlvRemark((String)list.get(i)[9]);

//            BigDecimal fwlvMlDepth = new BigDecimal((String) list.get(i)[10]);
//            fieldwrap.setFwlvMlDepth(fwlvMlDepth);

            fieldwrap.setFwlvMlOrientation((String)list.get(i)[11]);

            fieldwrap.setFwlvIsHcas((String)list.get(i)[12]);

            //String fwlvYear=(String)list.get(i)[13];
//            fieldwrap.setFwlvYear(Double.valueOf(fwlvYear).intValue());
            System.out.println(fieldwrap.toString());
            fieldwraplimitvisibleMapper.insert(fieldwrap);
        }
    }
}
