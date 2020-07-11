package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.UnknownObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UnknownObjectMapper {
    int insert(@Param("un") UnknownObject record);

    int insertSelective(UnknownObject record);
}