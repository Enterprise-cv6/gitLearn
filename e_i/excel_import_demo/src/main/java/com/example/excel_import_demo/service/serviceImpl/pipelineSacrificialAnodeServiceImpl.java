package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.pipelineSacrificialAnode;
import com.example.excel_import_demo.mapper.pipelineSacrificialAnodeMapper;
import com.example.excel_import_demo.service.pipelineSacrificialAnodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class pipelineSacrificialAnodeServiceImpl implements pipelineSacrificialAnodeService {
   @Autowired
   pipelineSacrificialAnodeMapper psam;

    @Override
    public void insert(List<Object[]> list) {
        System.out.println("list.size() IS "+list.size());
        int i=4;
        while (i<list.size() && list.get(i)[0]!=null) {
            System.out.println("now i is "+i);
            //ColdPipe coldPipe = new ColdPipe();
            if (list.get(i)[0] != null) {
                System.out.println("进入赋值");
                pipelineSacrificialAnode psa= new pipelineSacrificialAnode();
                psa.setPipeId(100);
                for(int j=0 ;j<5;j++){
                    System.out.println("list.get("+i+")["+j+"] is"+list.get(i)[j] );
                }


             //   int testnum =Double.valueOf(test).intValue();
                if(list.get(i)[1]!= null){
                    psa.setPsaTestStationId( list.get(i)[1].toString());
                }
                if(list.get(i)[2]!= null){
                    psa.setPsaRelativePosition(list.get(i)[2].toString());
                }
                if(list.get(i)[3]!= null){
                    psa.setPsaNorthLatitude(list.get(i)[3].toString());
                }
                if(list.get(i)[4]!= null){
                    psa.setPsaEastLongtitude(list.get(i)[4].toString());
                }


                System.out.println("设置out输出电流   "+list.get(i)[5]);

                psa.setPsaSacrificialCurrentout((String) list.get(i)[5]);
                BigDecimal pagp = new BigDecimal((String) list.get(i)[6]);
                psa.setPsaSacrificialAnodeGroundingPotential(pagp);
                System.out.println(" 电阻  list.get(i)[7] is  "+list.get(i)[7]);

                psa.setPsaSacrificialAnodeGroundingResistance(list.get(i)[7].toString());

                if(list.get(i)[8]==null){
                    psa.setRemarks(null);
                }
                else{
                    String re =list.get(i)[8].toString();
                    psa.setRemarks(re);
                }
                psa.setYear(2014);


                psa.setBackup1(null);
                psa.setBackup2(null);

                System.out.println("准备插入"+psa);
                psam.insert(psa);
                System.out.println("插入完成");
                i++;


            }
            else {
                i++;
            }
        }

    }
}
