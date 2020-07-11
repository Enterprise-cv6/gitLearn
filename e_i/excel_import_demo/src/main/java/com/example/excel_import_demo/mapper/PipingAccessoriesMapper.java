package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.PipingAccessories;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PipingAccessoriesMapper {
    int insert(PipingAccessories record);

    int insertSelective(PipingAccessories record);
}