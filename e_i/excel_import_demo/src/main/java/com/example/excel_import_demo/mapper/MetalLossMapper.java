package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.MetalLoss;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MetalLossMapper {
    int insert(MetalLoss metalLoss);
}
