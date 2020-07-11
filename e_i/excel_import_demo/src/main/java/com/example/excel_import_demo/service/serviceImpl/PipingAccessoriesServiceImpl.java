package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.PipingAccessories;
import com.example.excel_import_demo.mapper.PipingAccessoriesMapper;
import com.example.excel_import_demo.service.PipingAccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PipingAccessoriesServiceImpl implements PipingAccessoriesService {

    @Autowired
    private PipingAccessoriesMapper pipingAccessoriesMapper;

    public void insert(List<Object[]> list) {
        for (int i = 2; i < list.size(); i++) {
            PipingAccessories pipingAccessories = new PipingAccessories();
            pipingAccessories.setPipeId(100);
            pipingAccessories.setPaYear(2014);
            String paWeldId = (String) list.get(i)[0];
            pipingAccessories.setPaWeldId(Double.valueOf(paWeldId).intValue());
            BigDecimal paAbsoluteDistance = new BigDecimal((String) list.get(i)[1]);
            pipingAccessories.setPaAbsoluteDistance(paAbsoluteDistance);
            pipingAccessories.setPaFeature((String) list.get(i)[2]);
            //单元格时间格式问题
            Date paOrientation = (Date) list.get(i)[3];
            DateFormat df = DateFormat.getTimeInstance();//只显示出时分秒
            if(paOrientation != null){
//                System.out.println(df.format(paOrientation));
                String str = df.format(paOrientation);
                pipingAccessories.setPaOrientation(str.substring(0,str.length() - 3));

            }
            BigDecimal paWeldDistance = new BigDecimal((String) list.get(i)[4]);
            pipingAccessories.setPaWeldDistance(paWeldDistance);
            BigDecimal paRpDistance = new BigDecimal((String) list.get(i)[6]);
            pipingAccessories.setPaRpDistance(paRpDistance);
            pipingAccessories.setPaRemarks((String) list.get(i)[7]);
            pipingAccessories.setPaIsHcas((String) list.get(i)[8]);
            pipingAccessories.setPaRpName((String) list.get(i)[5]);
            pipingAccessories.setPaYear(2014);

            System.out.println(pipingAccessories.toString());
            pipingAccessoriesMapper.insert(pipingAccessories);
        }
    }
}
