package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.Elbow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ElbowMapper {
    int insert(Elbow record);

    int insertSelective(Elbow record);
}