package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.WallThickness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WtvExcelMapper {

    public void insert(@Param("term") WallThickness term);

}
