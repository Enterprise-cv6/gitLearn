package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.FieldWrapLimitVisible;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface FieldWrapLimitVisibleMapper {
    int insert(FieldWrapLimitVisible record);

    int insertSelective(FieldWrapLimitVisible record);
}
