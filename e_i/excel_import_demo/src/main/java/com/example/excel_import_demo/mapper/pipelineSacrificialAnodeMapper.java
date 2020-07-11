package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface pipelineSacrificialAnodeMapper {
    int insert(pipelineSacrificialAnode record);

    int insertSelective(pipelineSacrificialAnode record);
}