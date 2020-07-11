package com.example.excel_import_demo.mapper;

import com.example.excel_import_demo.entity.WeldList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WeldListMapper {
    public void insert1(@Param("wl") WeldList wl);
}
