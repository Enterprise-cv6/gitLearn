package com.example.excel_import_demo.service.serviceImpl;

import com.example.excel_import_demo.entity.ExcavateTestAnticorrosionRepair;
import com.example.excel_import_demo.mapper.ExcavateTestAnticorrosionRepairMapper;
import com.example.excel_import_demo.service.ExcavateTestAnticorrosionRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ExcavateTestAnticorrosionRepairServiceImpl implements ExcavateTestAnticorrosionRepairService {
    @Autowired
    ExcavateTestAnticorrosionRepairMapper etarm;
    @Override
    public void insert(List<Object[]> list)  {
        int i=4;
        for(int j=0;j<15;j++){
            System.out.println("j is "+j+" list.get(8)"+list.get(i)[j]);
        }
        while (i<list.size()) {
            System.out.println("now i is "+i);
            //ColdPipe coldPipe = new ColdPipe();
            if (list.get(i)[0] != null) {
                System.out.println("进入赋值");

                ExcavateTestAnticorrosionRepair etar= new ExcavateTestAnticorrosionRepair();
                etar.setPipeId(100);
                etar.setEtarStation("--默认处理");
                String defect_id =list.get(i)[2].toString();
                etar.setEtarDefectId(defect_id);

                if(list.get(i)[3]!=null){
                etar.setEtarRelativePosition(list.get(i)[3].toString());
                }
                if(list.get(i)[4]!=null){
                    etar.setEtarLongitude(list.get(i)[4].toString());
                }
                if(list.get(i)[5]!=null){
                    etar.setEtarLatitude(list.get(i)[5].toString());
                }
                if(list.get(i)[6]!=null){
                    BigDecimal topdep = new BigDecimal((String) list.get(i)[6]);
                    etar.setEtarPipeTopBuriedDepth(topdep);
                }
                if(list.get(i)[7]!=null){
                    String up =list.get(i)[7].toString();
                    int leak =Double.valueOf(up).intValue();
                    etar.setEtarPcmLeakDetect(leak);
                }
                if(list.get(i)[8]!=null){

                    etar.setEtarSoilProfileDescription(list.get(i)[8].toString());
                }
                if(list.get(i)[9]!=null){
                    BigDecimal re = new BigDecimal((String) list.get(i)[9]);
                    etar.setEtarSoilResistivity(re);
                }
                if(list.get(i)[10]!=null){
                    BigDecimal ph = new BigDecimal((String) list.get(i)[10]);
                    etar.setEtarSoilPh(ph);
                }
                if(list.get(i)[11]!=null){
                    BigDecimal gph = new BigDecimal((String) list.get(i)[11]);
                    etar.setEtarGroundwaterPh(gph);
                }
                if(list.get(i)[12]!=null){
                    BigDecimal cl = new BigDecimal((String) list.get(i)[12]);
                    etar.setEtarGroundwaterCl(cl);
                }
                if(list.get(i)[13]!=null){
                    BigDecimal so4 = new BigDecimal((String) list.get(i)[13]);
                    etar.setEtarSoilPh(so4);
                }
                if(list.get(i)[14]!=null){
                    BigDecimal sa = new BigDecimal((String) list.get(i)[14]);
                    etar.setEtarGroundwaterSalt(sa);
                }
                if(list.get(i)[15]!=null){

                    etar.setEtarSoilCorrosionEvaluation(list.get(i)[15].toString());
                }
                if(list.get(i)[16]!=null){

                    etar.setEtarEnvironmentGroundSituation(list.get(i)[16].toString());
                }
                if(list.get(i)[17]!=null){

                    etar.setEtarEnvironmentSoilProfile(list.get(i)[17].toString());
                }
                if(list.get(i)[18]!=null){

                    etar.setEtarPe3Anticorrisive(list.get(i)[18].toString());
                }
                if(list.get(i)[19]!=null){

                    etar.setEtarPatchHeatShrinkableTape(list.get(i)[19].toString());
                }
                if(list.get(i)[20]!=null){

                    etar.setEtarElbowFbe(list.get(i)[20].toString());
                }
                if(list.get(i)[21]!=null){

                    etar.setEtarDamagedArea(list.get(i)[21].toString());
                }
                if(list.get(i)[22]!=null){
                    BigDecimal th = new BigDecimal((String) list.get(i)[22]);
                    etar.setEtarThickness(th);
                }

                if(list.get(i)[23]!=null){
                    etar.setEtarSparkDetection(list.get(i)[23].toString());
                }
                if(list.get(i)[24]!=null){
                    etar.setEtarPe3Steel(list.get(i)[24].toString());
                }
                if(list.get(i)[25]!=null){
                    etar.setEtarBandSteel(list.get(i)[25].toString());
                }
                if(list.get(i)[26]!=null){
                    etar.setEtarBandPe(list.get(i)[26].toString());
                }
                if(list.get(i)[27]!=null){
                    etar.setEtarBandFbe(list.get(i)[27].toString());
                }
                if(list.get(i)[28]!=null){
                    etar.setEtarFbeCohesiveForce(list.get(i)[28].toString());
                }
                if(list.get(i)[30-1]!=null){
                    etar.setEtarAnticorrosiveDamagedPictures(list.get(i)[30-1].toString());
                }
                if(list.get(i)[31+1]!=null){
                    etar.setEtarPipeCorrosionStatusDescription(list.get(i)[31+1].toString());
                }
                if(list.get(i)[32+1]!=null){
                    etar.setEtarCorrosionType(list.get(i)[32+1].toString());
                }
                if(list.get(i)[33+1]!=null){
                    etar.setEtarCorrosionArea(list.get(i)[33+1].toString());
                }
                if(list.get(i)[34+1]!=null){
                    etar.setEtarCorrosionDepth(list.get(i)[34+1].toString());
                }
                if(list.get(i)[35+1]!=null){
                    etar.setEtarCorrosionRate(list.get(i)[35+1].toString());
                }
                if(list.get(i)[36+1]!=null){
                    BigDecimal dc = new BigDecimal((String) list.get(i)[36+1]);
                    etar.setEtarPipeSoilPotentialDc(dc);
                }
                if(list.get(i)[37+1]!=null){
                    BigDecimal ac = new BigDecimal((String) list.get(i)[37+1]);
                    etar.setEtarPipeSoilPotentialAc(ac);
                }
                if(list.get(i)[38+1]!=null){
                    BigDecimal pth = new BigDecimal((String) list.get(i)[38+1]);
                    etar.setEtarPipeThickness(pth);
                }
                if(list.get(i)[39+1]!=null){

                    etar.setEtarCorrosionEvaluation(list.get(i)[39+1].toString());
                }
                if(list.get(i)[40+1]!=null){

                    etar.setEtarPipeTreatmentSuggestion(list.get(i)[40+1].toString());
                }
                if(list.get(i)[41+1]!=null){

                    etar.setEtarPipeRepairMeasure(list.get(i)[41+1].toString());
                }
                if(list.get(i)[42+1]!=null){

                    etar.setEtarPipeRepairStatus(list.get(i)[42+1].toString());
                }
                if(list.get(i)[43+1]!=null){

                    etar.setEtarPipePictureBeforeclean(list.get(i)[43+1].toString());
                }
                if(list.get(i)[44+1]!=null){

                    etar.setEtarPipePictureAfterclean(list.get(i)[44+1].toString());
                }
                if(list.get(i)[45+1]!=null){
                     //设置 45 etar_pipe_picture_afterrepair
                    //etar.setrepair(list.get(i)[45].toString());
                }
                if(list.get(i)[46+1]!=null){

                    etar.setEtarRepairAnticorrosiveStructure(list.get(i)[46+1].toString());
                }
                if(list.get(i)[47+1]!=null){
                    int num = 0;
                         if(list.get(i)[47+1].toString().equals(">5")){
                          num=1;
                         }
                    etar.setEtarRepairSiteThickness(num);
                }
                if(list.get(i)[48+1]!=null){

                    etar.setEtarRepairAnticorrosiveSparkDetection(list.get(i)[48+1].toString());
                }
                if(list.get(i)[49+1]!=null){

                    etar.setEtarRepairAnticorrosivePicture(list.get(i)[49+1].toString());
                }
                if(list.get(i)[50+2]!=null){
                    try {
                        Date date = new SimpleDateFormat("yyyy.MM.dd").parse(list.get(i)[50+2].toString());
                        etar.setEtarDetectionDate(date);
                    }catch (Exception e){

                    }
                }
                if(list.get(i)[51+2]!=null){

                    etar.setEtarRemarks(list.get(i)[51+2].toString());
                }

                //年份
                etar.setEtarYear(2014);
                //备注
                etar.setEtarBackup1(null);


                System.out.println("准备插入"+etar.toString());
                etarm.insert(etar);
                System.out.println("插入完成");
                i++;


            }
            else {
                i++;
            }
        }
    }
}
