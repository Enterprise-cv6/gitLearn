package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.valveChamberTest;
import com.example.excel_import_demo.mapper.valveChamberTestMapper;
import com.example.excel_import_demo.service.valveChamberTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class valveChamberTestServiceImpl implements valveChamberTestService {

   @Autowired
   public valveChamberTestMapper vtcm;


    @Override
    public void insert( List<Object[]> list) {
     System.out.println("list.size() IS "+list.size());
           int i=2;
      while (i<list.size()) {
          System.out.println("now i is "+i);
          //ColdPipe coldPipe = new ColdPipe();
          if (list.get(i)[0] != null) {
              System.out.println("进入赋值");


              valveChamberTest vtc = new valveChamberTest();
              vtc.setPipe_id(100);
              String number =list.get(i)[1].toString();
              vtc.setValve_chamber_id(number);
              //经度
              vtc.setLongitude(list.get(i)[2].toString());
              //维度
              vtc.setLatitude(list.get(i)[3].toString());
              //上游
              if(list.get(i)[4]==null){
                  vtc.setUpper_voff(0);
              }
              else{
                  String up =list.get(i)[4].toString();
                  int upn =Double.valueOf(up).intValue();
                  vtc.setUpper_voff(upn);
              }

              //下游
              if(list.get(i)[5]==null){
                  vtc.setDown_voff(0);
              }
              else{
                  String up =list.get(i)[5].toString();
                  int upn =Double.valueOf(up).intValue();
                  vtc.setDown_voff(upn);
              }
              //pcm
              if(list.get(i)[6]==null){
                  vtc.setPcm(null);
              }
              else{
                  BigDecimal pcm = new BigDecimal((String) list.get(i)[6]);
                  vtc.setPcm(pcm);
              }

              //报端电压
              if(list.get(i)[7]==null){
                  vtc.setProtect_terminal_voltage(null);
              }
              else{
                  BigDecimal ptv = new BigDecimal((String) list.get(i)[7]);
                  vtc.setProtect_terminal_voltage(ptv);
              }


              //匪报端
              if(list.get(i)[8]==null){
                  vtc.setNonprotect_terminal_voltage(null);
              }
              else{
                  BigDecimal nonptv = new BigDecimal((String) list.get(i)[8]);
                  vtc.setNonprotect_terminal_voltage(nonptv);
              }

              //绝缘
              if(list.get(i)[9]==null){
                  vtc.setInsulation_evaluation(null);
              }
              else{
                  vtc.setInsulation_evaluation(list.get(i)[9].toString());
              }

              //漏电
              if(list.get(i)[10]==null){
                  vtc.setLeak_electricity_evaluation(null);
              }
              else{
                  vtc.setLeak_electricity_evaluation(list.get(i)[10].toString());
              }

              //接地电阻
              if(list.get(i)[11]==null){
                  vtc.setGround_resistance(null);
              }
              else{
                  BigDecimal gr = new BigDecimal((String) list.get(i)[11]);
                  vtc.setGround_resistance(gr);
              }

              //防雷
              if(list.get(i)[12]==null){
                  vtc.setLightprotect_facilities_status(null);
              }
              else{
                  vtc.setLightprotect_facilities_status(list.get(i)[12].toString());
              }

              //位置
              if(list.get(i)[13]==null){
                  vtc.setLeak_point_position(null);
              }
              else{
                  vtc.setLeak_point_position(list.get(i)[13].toString());
              }

              //db
              if(list.get(i)[14]==null){
                  vtc.setLeak_point_db(0);
              }
              else{
                  String dp =list.get(i)[14].toString();
                  int dpn =Double.valueOf(dp).intValue();
                  vtc.setLeak_point_db(dpn);
              }

              //修复
              if(list.get(i)[15]==null){
                  vtc.setRepair_situation(null);
              }
              else{
                  vtc.setRepair_situation(list.get(i)[15].toString());
              }

              //测试日期
              if(list.get(i)[16]==null){
                  vtc.setDetection_date(null);
              }
              else{
                  vtc.setDetection_date(list.get(i)[16].toString());
              }

              //备注
              if(list.get(i)[17]==null){
                  vtc.setVct_remarks(null);
              }
              else{
                  vtc.setVct_remarks(list.get(i)[17].toString());
              }

              //年份
              vtc.setYear(2014);
              //备注
              vtc.setBackup1(null);
              vtc.setBackup2(null);

              System.out.println("准备插入"+vtc);
              vtcm.insert(vtc);
              System.out.println("插入完成");
              i++;


          }
          else {
              i++;
          }
      }

    }

    @Override
    public void insert1(List<Object[]> list) {
        System.out.println("list.size() IS "+list.size());
        int i=4;
        for(int j = 0;j<5 ;j++){
            System.out.println(" j is "+ list.get(i)[j]);
        }
        while (i<list.size() && (list.get(i)[2]!=null&& list.get(i)[3]!=null) ){
            System.out.println("now i is "+i);
            //ColdPipe coldPipe = new ColdPipe();

                System.out.println("进入赋值");

                valveChamberTest vtc = new valveChamberTest();
                vtc.setPipe_id(100);
                 // 浙江段站场测试数据表 中 数据库缺失 字段 战场名称
                 // 通过list.get(i)[1] 获取站场名称


                //报端电压
                if(list.get(i)[2]==null){
                    vtc.setProtect_terminal_voltage(null);
                }
                else{
                    BigDecimal ptv = new BigDecimal((String) list.get(i)[2]);
                    vtc.setProtect_terminal_voltage(ptv);
                }


                //匪报端
                if(list.get(i)[3]==null){
                    vtc.setNonprotect_terminal_voltage(null);
                }
                else{
                    BigDecimal nonptv = new BigDecimal((String) list.get(i)[3]);
                    vtc.setNonprotect_terminal_voltage(nonptv);
                }

                //绝缘
                if(list.get(i)[4]==null){
                    vtc.setInsulation_evaluation(null);
                }
                else{
                    vtc.setInsulation_evaluation(list.get(i)[4].toString());
                }
            //接地电阻
            if(list.get(i)[5]==null){
                vtc.setGround_resistance(null);
            }
            else{
                BigDecimal gr = new BigDecimal((String) list.get(i)[5]);
                vtc.setGround_resistance(gr);
            }



                //防雷
                if(list.get(i)[6]==null){
                    vtc.setLightprotect_facilities_status(null);
                }
                else{
                    vtc.setLightprotect_facilities_status(list.get(i)[6].toString());
                }


                //测试日期
                if(list.get(i)[7]==null){
                    vtc.setDetection_date(null);
                }
                else{
                    vtc.setDetection_date(list.get(i)[7].toString());
                }

                //备注
                if(list.get(i)[8]==null){
                    vtc.setVct_remarks(null);
                }
                else{
                    vtc.setVct_remarks(list.get(i)[8].toString());
                }

                //年份
                vtc.setYear(2014);
                //备注
                vtc.setBackup1(null);
                vtc.setBackup2(null);

                System.out.println("准备插入"+vtc);
                vtcm.insert(vtc);
                System.out.println("插入完成");
                i++;


            }

        }

    }

