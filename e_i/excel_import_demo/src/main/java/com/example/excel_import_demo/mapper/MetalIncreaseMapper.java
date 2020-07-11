package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.MetalIncrease;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MetalIncreaseMapper {
    int insert(MetalIncrease record);

    int insertSelective(MetalIncrease record);
}
