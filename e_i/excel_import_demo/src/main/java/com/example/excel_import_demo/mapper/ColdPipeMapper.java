package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.ColdPipe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ColdPipeMapper {
    int insert(ColdPipe record);

    int insertSelective(ColdPipe record);
}