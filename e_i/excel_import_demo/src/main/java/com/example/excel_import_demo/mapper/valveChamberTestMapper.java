package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.valveChamberTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface valveChamberTestMapper {
    public void insert(@Param("vtc") valveChamberTest vct);
}
