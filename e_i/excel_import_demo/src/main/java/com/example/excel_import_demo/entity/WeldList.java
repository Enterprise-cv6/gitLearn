package com.example.excel_import_demo.entity;

import java.math.BigDecimal;

public class WeldList {
    //pip_id
    private int pipe_id;
    //管节标号
    private  int pipejoint_id;
    //检测里程
    private BigDecimal absolute_distance;
    //管节长度
    private  BigDecimal pipejoint_length;
    private  String backup1;
    private String backup2;

    @Override
    public String toString() {
        return "WeldList{" +
                "pipe_id=" + pipe_id +
                ", pipejoint_id=" + pipejoint_id +
                ", absolute_distance=" + absolute_distance +
                ", pipejoint_length=" + pipejoint_length +
                ", backup1='" + backup1 + '\'' +
                ", backup2='" + backup2 + '\'' +
                ", feature='" + feature + '\'' +
                ", pipejoint_type='" + pipejoint_type + '\'' +
                ", wall_thickness=" + wall_thickness +
                ", up_intersection='" + up_intersection + '\'' +
                ", down_intersection='" + down_intersection + '\'' +
                ", rpname='" + rpname + '\'' +
                ", rpdis=" + rpdis +
                ", remake='" + remake + '\'' +
                ", is_hcas=" + is_hcas +
                ", year=" + year +
                '}';
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1;
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2;
    }

    public int getPipe_id() {
        return pipe_id;
    }

    public void setPipe_id(int pipe_id) {
        this.pipe_id = pipe_id;
    }

    //特征标记
    private String feature;
    //关节类型
    private  String pipejoint_type;
    //壁厚
    private BigDecimal wall_thickness;
    //上游焦点
    private String  up_intersection;
    //下右焦点
    private String  down_intersection;
    //z最近参考点名称
    private String rpname ;
    //rp距离
    private  BigDecimal rpdis;
    //备注
    private String remake;
    //高风险区？
    private int is_hcas;

    //年份 year
    private int year;

    public int getPipejoint_id() {
        return pipejoint_id;
    }

    public void setPipejoint_id(int pipejoint_id) {
        this.pipejoint_id = pipejoint_id;
    }

    public BigDecimal getAbsolute_distance() {
        return absolute_distance;
    }

    public void setAbsolute_distance(BigDecimal absolute_distance) {
        this.absolute_distance = absolute_distance;
    }

    public BigDecimal getPipejoint_length() {
        return pipejoint_length;
    }

    public void setPipejoint_length(BigDecimal pipejoint_length) {
        this.pipejoint_length = pipejoint_length;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getPipejoint_type() {
        return pipejoint_type;
    }

    public void setPipejoint_type(String pipejoint_type) {
        this.pipejoint_type = pipejoint_type;
    }

    public BigDecimal getWall_thickness() {
        return wall_thickness;
    }

    public void setWall_thickness(BigDecimal wall_thickness) {
        this.wall_thickness = wall_thickness;
    }

    public String getUp_intersection() {
        return up_intersection;
    }

    public void setUp_intersection(String up_intersection) {
        this.up_intersection = up_intersection;
    }

    public String getDown_intersection() {
        return down_intersection;
    }

    public void setDown_intersection(String down_intersection) {
        this.down_intersection = down_intersection;
    }

    public String getRpname() {
        return rpname;
    }

    public void setRpname(String rpname) {
        this.rpname = rpname;
    }

    public BigDecimal getRpdis() {
        return rpdis;
    }

    public void setRpdis(BigDecimal rpdis) {
        this.rpdis = rpdis;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public int getIs_hcas() {
        return is_hcas;
    }

    public void setIs_hcas(int is_hcas) {
        this.is_hcas = is_hcas;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public WeldList() {
    }
}
