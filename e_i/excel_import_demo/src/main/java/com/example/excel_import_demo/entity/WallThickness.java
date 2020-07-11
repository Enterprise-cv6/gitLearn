package com.example.excel_import_demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WallThickness {
    private int id;
    private int pipeId;
    private int wtvYear;
    //焊缝标号
    private int wid;
    //检测里程
    private BigDecimal distance;
    //壁厚
    private BigDecimal wall_thickness;
    //长度
    private BigDecimal longs;
    //最近参考点
    private  String rpname ;
    //最近参考点距离
    private BigDecimal rpdis;


    private String remarke;

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getWall_thickness() {
        return wall_thickness;
    }

    public void setWall_thickness(BigDecimal wall_thickness) {
        this.wall_thickness = wall_thickness;
    }

    public BigDecimal getLongs() {
        return longs;
    }

    public void setLongs(BigDecimal longs) {
        this.longs = longs;
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

    public String getRemarke() {
        return remarke;
    }

    public void setRemarke(String remarke) {
        this.remarke = remarke;
    }

    @Override
    public String toString() {
        return "WallThickness{" +
                "焊缝编号='" + wid + '\'' +
                ", 检测里程='" + distance + '\'' +
                ", 壁厚='" + wall_thickness + '\'' +
                ", 长度='" + longs + '\'' +
                ", 最近参考点名称='" + rpname + '\'' +
                ", 最近参考点距离='" + rpdis + '\'' +
                ", 备注='" + remarke + '\'' +
                '}';
    }
}
