package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class valveChamberTest {
    private int id;
    private int pipe_id;
    //阀室编号
    private String valve_chamber_id;
    //经度
    private String longitude;
    //纬度
    private  String latitude;
    //上游
    private int upper_voff;

    public int getId() {
        return id;
    }

    public int getPipe_id() {
        return pipe_id;
    }

    public String getValve_chamber_id() {
        return valve_chamber_id;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public int getUpper_voff() {
        return upper_voff;
    }

    public int getDown_voff() {
        return down_voff;
    }

    public BigDecimal getPcm() {
        return pcm;
    }

    public BigDecimal getProtect_terminal_voltage() {
        return protect_terminal_voltage;
    }

    public BigDecimal getNonprotect_terminal_voltage() {
        return nonprotect_terminal_voltage;
    }

    public String getInsulation_evaluation() {
        return insulation_evaluation;
    }

    public String getLeak_electricity_evaluation() {
        return leak_electricity_evaluation;
    }

    public BigDecimal getGround_resistance() {
        return ground_resistance;
    }

    public String getLightprotect_facilities_status() {
        return lightprotect_facilities_status;
    }

    public String getLeak_point_position() {
        return leak_point_position;
    }

    public int getLeak_point_db() {
        return leak_point_db;
    }

    public String getRepair_situation() {
        return repair_situation;
    }

    public String getDetection_date() {
        return detection_date;
    }

    public String getVct_remarks() {
        return vct_remarks;
    }

    public int getYear() {
        return year;
    }

    public String getBackup1() {
        return backup1;
    }

    public String getBackup2() {
        return backup2;
    }

    //下游
    private  int down_voff;
    //衰减因子
    private  BigDecimal pcm;
    //报端电压
    private BigDecimal protect_terminal_voltage;
    //费报端电压
    private  BigDecimal nonprotect_terminal_voltage;
    // 绝缘状况
    private String insulation_evaluation;
    //漏电评价
    private String leak_electricity_evaluation;
    //接地电阻
    private BigDecimal ground_resistance;
    //防雷
    private String lightprotect_facilities_status;
    //位置
    private  String leak_point_position;
    //db
    private int leak_point_db;
    //修复情况
    private String repair_situation;
    //检测日期
    private String detection_date;
    // 备注
    private String vct_remarks;
    // 年份
    private int year;
    //备用1
    private String backup1;
    //备用2
    private  String backup2;

    @Override
    public String toString() {
        return "valveChamberTest{" +
                "id=" + id +
                ", pipe_id=" + pipe_id +
                ", valve_chamber_id='" + valve_chamber_id + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", upper_voff=" + upper_voff +
                ", down_voff=" + down_voff +
                ", pcm=" + pcm +
                ", protect_terminal_voltage=" + protect_terminal_voltage +
                ", nonprotect_terminal_voltage=" + nonprotect_terminal_voltage +
                ", insulation_evaluation='" + insulation_evaluation + '\'' +
                ", leak_electricity_evaluation='" + leak_electricity_evaluation + '\'' +
                ", ground_resistance=" + ground_resistance +
                ", lightprotect_facilities_status='" + lightprotect_facilities_status + '\'' +
                ", leak_point_position='" + leak_point_position + '\'' +
                ", eak_point_db=" + leak_point_db +
                ", repair_situation='" + repair_situation + '\'' +
                ", detection_date='" + detection_date + '\'' +
                ", vct_remarks='" + vct_remarks + '\'' +
                ", year=" + year +
                ", backup1='" + backup1 + '\'' +
                ", backup2='" + backup2 + '\'' +
                '}';
    }
}
