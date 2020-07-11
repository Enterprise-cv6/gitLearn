package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.ExcavateTestAnticorrosionRepair;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ExcavateTestAnticorrosionRepairMapper {
    int insert(ExcavateTestAnticorrosionRepair record);

    int insertSelective(ExcavateTestAnticorrosionRepair record);
}