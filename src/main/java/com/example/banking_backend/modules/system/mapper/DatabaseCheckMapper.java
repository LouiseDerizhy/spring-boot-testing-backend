package com.example.banking_backend.modules.system.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DatabaseCheckMapper {
    int checkConnection();
}