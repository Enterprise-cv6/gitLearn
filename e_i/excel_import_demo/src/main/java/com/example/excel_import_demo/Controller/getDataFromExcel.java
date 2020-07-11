package com.example.excel_import_demo.Controller;

import com.example.excel_import_demo.Util.ExcelUtil;
import com.example.excel_import_demo.entity.UnknownObject;
import com.example.excel_import_demo.entity.WallThickness;
import com.example.excel_import_demo.entity.WeldList;
import com.example.excel_import_demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

@Controller
public class getDataFromExcel {

    @Autowired
    private ExcelUtil excelUtil;
    @Autowired
    private MetalLossService metalLossService;
    @Autowired
    private PipingAccessoriesService pipingAccessoriesService;
    @Autowired
    private ElbowService elbowService;
    @Autowired
    private ColdPipeService coldPipeService;
    @Autowired
    private AbnormalWeldPointService abnormalWeldPointService;
    @Autowired
    private WtvExcelMapperService wts;
    @Autowired
    private PipeFeatureService pipeFeatureService;
    @Autowired
    private FieldWrapLimitVisibleService fieldWrapLimitVisibleService;
//    @Autowired
//    private WeldListService wls;
//    @Autowired
//    private UnknownObjectService unos;
    @Autowired
    private MetalIncreaseService metalIncreaseService;
    @Autowired
    private TermTableService termTableService;

    /**
     * hqx
     *  7 阀室测试
     */
    @Autowired
    public valveChamberTestService vtcs;

    @ResponseBody
    @PostMapping("/importExcelvtc")
    public String importExcelVtc(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request){
        try {
            //这里循环读取 文件的分页
            int sheetNum= ExcelUtil.sheetNumber(excelFile.getInputStream());
            for(int i=0;i<sheetNum;i++) {
                List<Object[]> list = ExcelUtil.importExcel4(excelFile.getInputStream(),i);
                if(i==0 ){
                    System.out.println("插入 sheet 1 ");
                    vtcs.insert(list);
                }
                if(i==1){
                    System.out.println("插入 sheet 2 ");
                   vtcs.insert1(list);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }


    /**
     * hqx
     * 表11 牺牲阳极统计
     */
    @Autowired
    public pipelineSacrificialAnodeService psa;

    @ResponseBody
    @PostMapping("/importExcelpsa")
    public String importExcelPsa(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request){
        try {
            List<Object[]> list = ExcelUtil.importExcel2(excelFile.getInputStream());
            psa.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * hqx
     * 表 8 管道开挖检测及防腐层修复数据表
     */
    @Autowired
    public ExcavateTestAnticorrosionRepairService etar;

    @ResponseBody
    @PostMapping("/importExcelEtar")
    public String importExcelEtar(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request){
        try {
            List<Object[]> list = ExcelUtil.importExcel2(excelFile.getInputStream());
            etar.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
    * @Author: MQ
    * @Description: 解析本地金属损失文件
    * @Date: 2020/7/5
    **/
    @ResponseBody
    @PostMapping("/importExcel2")
    public String importExcel(HttpServletRequest request) {
        String fileName = request.getParameter("fileName");
        try {
            List<Object[]> list = excelUtil.importExcel(fileName);
            metalLossService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    @ResponseBody
    @PostMapping(value = "/testExcel")
    public String testImportExcel(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        String name = excelFile.getOriginalFilename();
        System.out.println(name);
        //TODO 业务逻辑，通过excelFile.getInputStream()，处理Excel文件
        try {
            System.out.println(excelFile.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "test";
    }
    /**
    * @Author: MQ
    * @Description: 解析上传金属损失文件
    * @Date: 2020/7/5
    **/
    @ResponseBody
    @PostMapping("/importExcelMl")
    public String importExcelMl(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            metalLossService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**    !!!
    * @Author: MQ
    * @Description: 解析管道附件列表
    * @Date: 2020/7/6
    **/
    @ResponseBody
    @PostMapping("/importExcelPa")
    public String importExcelPa(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            pipingAccessoriesService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: MQ
     * @Description: 解析弯头列表
     * @Date: 2020/7/6
     **/
    @ResponseBody
    @PostMapping("/importExcelEb")
    public String importExcelEb(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            elbowService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: MQ
     * @Description: 解析冷弯管列表
     * @Date: 2020/7/6
     **/
    @ResponseBody
    @PostMapping("/importExcelCp")
    public String importExcelCp(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
//            System.out.println(excelFile.getOriginalFilename());
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            coldPipeService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: MQ
     * @Description: 解析焊缝异常点列表
     * @Date: 2020/7/6
     **/
    @ResponseBody
    @PostMapping("/importExcelAbw")
    public String importExcelAbw(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            abnormalWeldPointService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: MQ
     * @Description: 解析管道特征列表
     * @Date: 2020/7/7
     **/
    @ResponseBody
    @PostMapping("/importExcelPf")
    public String importExcelPf(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            pipeFeatureService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: MQ
     * @Description: 解析专业术语表
     * @Date: 2020/7/8
     **/
    @ResponseBody
    @PostMapping("/importExcelTt")
    public String importExcelTt(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            termTableService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * @Author: wang ao
     * @Description: 补口带下异常表解析
     * @Date: 2020/7/7
     */
    @ResponseBody
    @PostMapping("/importExcelFwlv")
    public String importExcelFwlv(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request) {
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            fieldWrapLimitVisibleService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    /**
     * 解析金属增加列表
     */
    @ResponseBody
    @PostMapping("/importExcelMi")
    public String importExcelMi(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request){
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            metalIncreaseService.insert(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }


    @ResponseBody
    @PostMapping("/importExcelWtv")
    public String importExcelWtv(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request)
    {
//        String fileName = request.getParameter("fileName");
        List<WallThickness> list_target = new LinkedList<>();

        try {
//            List<Object[]> list = ExcelUtil.importExcel(fileName);
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            System.out.println("list size is +++"+list.size()+"list[0] size is ++++++"+ list.get(0).toString());
            int i=2;
            while(i<list.size()){
                if(list.get(i)[0]!=null && list.get(i)[1]!=null){
                    System.out.println("now i is "+i+"     对应的size 是 list.get(i)  "+list.get(i).length);
                    WallThickness term = new WallThickness();
//               for(int j=0;j<5;j++){
//                   System.out.println("第 "+j+"个——————————————————————"+list.get(i)[j]);
//               }
                    String number =list.get(i)[0].toString();
                    int num =Double.valueOf(number).intValue();
                    term.setPipeId(100);
                    term.setWtvYear(2014);
                    term.setWid( num);
                    term.setDistance(new BigDecimal(String.valueOf(list.get(i)[1])));
                    term.setWall_thickness(new BigDecimal(String.valueOf(list.get(i)[2])));
                    term.setLongs(new BigDecimal(String.valueOf(list.get(i)[3])));
                    term.setRpname(String.valueOf(list.get(i)[4]));
                /*
                now i is 1859     对应的size 是 list.get(i)  5
                  java.lang.ArrayIndexOutOfBoundsException: 5
                  at com.example.excel_import_demo.Controller.getDataFromExcel.importExcel(getDataFromExcel.java:39)
                 在数据表中的第1859行 时 数据处理出现问题 第6项为空 其长度为 5
                 */
                    if(list.get(i).length>5)
                    {
                        term.setRpdis(new BigDecimal(String.valueOf(list.get(i)[5])));
                    }
                    if(list.get(i).length>6)
                    {
                        term.setRemarke(String.valueOf(list.get(i)[6]));
                    }


                    list_target.add(term);
                    System.out.println("对象已经添加"+term.toString()+"现在列表中共有数据："+list_target.size());
                    if(i>0){
                        System.out.println("");
                        wts.insert(term);
                        System.out.println("进入数据库");
                    }
                    i++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    @ResponseBody
    @PostMapping("/importExcelWl")
    public String importExcelWl(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request)
    {
        List<WeldList> list_target = new LinkedList<>();
        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            //System.out.println("list size is +++"+list.size()+"list[0] size is ++++++"+ list.get(0).toString());
            int i=2;
            //数据过多 设置为 前100条
//            int len  = Math.min(list.size(),100);
            while(i<list.size()){
                if(list.get(i)[0]!=null && list.get(i)[1]!=null){
                    // System.out.println("now i is "+i+"     对应的size 是 list.get(i)  "+list.get(i).length);
                    WeldList wl = new WeldList();
//               for(int j=0;j<5;j++){
//                   System.out.println("第 "+j+"个——————————————————————"+list.get(i)[j]);
//               }
                    wl.setPipe_id(100);
                    //节点id
                    String number =list.get(i)[0].toString();
                    int num =Double.valueOf(number).intValue();
                    wl.setPipejoint_id( num);
                    //绝对距离
                    wl.setAbsolute_distance(new BigDecimal(String.valueOf(list.get(i)[1])));
                    //管道长度
                    if(list.get(i)[2] != null){
                        wl.setPipejoint_length(new BigDecimal(String.valueOf(list.get(i)[2])));
                    }
                    //特征识别
                    wl.setFeature(String.valueOf(list.get(i)[3]));
                    //类型
                    wl.setPipejoint_type(String.valueOf(list.get(i)[4]));
                    //壁厚
                    wl.setWall_thickness(new BigDecimal(String.valueOf(list.get(i)[5])));
                    //上游
                    wl.setUp_intersection(String.valueOf(list.get(i)[6]));
                    //下游
                    wl.setDown_intersection(String.valueOf(list.get(i)[7]));
                    //rpname
                    wl.setRpname(String.valueOf(list.get(i)[8]));
                    //rpdis
                    wl.setRpdis(new BigDecimal(String.valueOf(list.get(i)[9])));
                    //备注
                    wl.setRemake(String.valueOf(list.get(i)[10]));
                    //高风险
                    if(list.get(i).length>11){
                        String ha =String.valueOf(list.get(i)[11]);
                        int num1=0;
                        if("是"==ha){
                            num1=1;
                        }
                        wl.setIs_hcas(num1);

                    }
                    if(list.get(i).length>12){
                        String ha =String.valueOf(list.get(i)[12]);

                        wl.setBackup1(ha);

                    }
                    if(list.get(i).length>13){
                        String ha =String.valueOf(list.get(i)[13]);

                        wl.setBackup1(ha);

                    }



                /*
                now i is 1859     对应的size 是 list.get(i)  5
                  java.lang.ArrayIndexOutOfBoundsException: 5
                  at com.example.excel_import_demo.Controller.getDataFromExcel.importExcel(getDataFromExcel.java:39)
                 在数据表中的第1859行 时 数据处理出现问题 第6项为空 其长度为 5
                 */


                    //list_target.add(term);
                    System.out.println("对象已经添加"+wl.toString());
                    if(i>0){
                        System.out.println("");
                        wl.setYear(2014);
                        //wls.insert(wl);
                        //System.out.println("进入数据库");
                    }
                    i++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }

    @ResponseBody
    @PostMapping("/importExcelUo")
    public String importExcelUo(@RequestParam(value = "file", required=false) MultipartFile excelFile, HttpServletRequest request)
    {
        List<WeldList> list_target = new LinkedList<>();

        try {
            List<Object[]> list = excelUtil.importExcel2(excelFile.getInputStream());
            //System.out.println("list size is +++"+list.size()+"list[0] size is ++++++"+ list.get(0).toString());
            int i=2;
            //数据过多 设置为 前100条
//            int len  = Math.min(list.size(),100);
            while(i<list.size()){

                if(list.get(i)[0]!=null && list.get(i)[1]!=null){
                    // System.out.println("now i is "+i+"     对应的size 是 list.get(i)  "+list.get(i).length);
                    UnknownObject un = new UnknownObject();
//               for(int j=0;j<5;j++){
//                   System.out.println("第 "+j+"个——————————————————————"+list.get(i)[j]);
//               }
                    un.setPipeId(100);
                    //焊缝编号
                    String number =list.get(i)[0].toString();
                    int num =Double.valueOf(number).intValue();
                    un.setUoWeldId(num);

                    //绝对距离
                    un.setUoAbsoluteDistance(new BigDecimal(String.valueOf(list.get(i)[1])));

                    //特征识别
                    un.setUoFeature(String.valueOf(list.get(i)[2]));
                    //周向
                    un.setUoOrientation(String.valueOf(list.get(i)[3]));
                    //上游距离
                    un.setUoWeldDistance(new BigDecimal(String.valueOf(list.get(i)[4])));
                    //rp
                    un.setUoRpName(String.valueOf(list.get(i)[5]));
                    //rpdis
                    un.setUoRpDistance(new BigDecimal(String.valueOf(list.get(i)[6])));
                    //备注
                    un.setUoRemarks(String.valueOf(list.get(i)[7]));
                    //高风险
                    if(list.get(i).length>11){
                        String ha =String.valueOf(list.get(i)[11]);
                        boolean  num1=false;
                        if("是"==ha){
                            num1=true;
                        }
                        un.setUoIsHcas(num1);

                    }
                    else {
                        un.setUoIsHcas(false);
                    }



                /*
                now i is 1859     对应的size 是 list.get(i)  5
                  java.lang.ArrayIndexOutOfBoundsException: 5
                  at com.example.excel_import_demo.Controller.getDataFromExcel.importExcel(getDataFromExcel.java:39)
                 在数据表中的第1859行 时 数据处理出现问题 第6项为空 其长度为 5
                 */


                    //list_target.add(term);
                    //un.setYear("");
                    System.out.println("对象已经添加"+un.toString());
                    if(i>0){
                        System.out.println("");
                        Calendar c = Calendar.getInstance();
                        c.get(Calendar.YEAR);
                        System.out.println("c is "+ c.get(Calendar.YEAR));
                        un.setYear(2014);
                        //unos.insert(un);
                        //System.out.println("进入数据库");
                    }
                    i++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }
}
