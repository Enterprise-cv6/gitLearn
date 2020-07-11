package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.AbnormalWeldPoint;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AbnormalWeldPointMapper {
    int insert(AbnormalWeldPoint record);

    int insertSelective(AbnormalWeldPoint record);
}