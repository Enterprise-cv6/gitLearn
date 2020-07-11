package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.PipeFeature;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PipeFeatureMapper {
    int insert(PipeFeature record);

    int insertSelective(PipeFeature record);
}