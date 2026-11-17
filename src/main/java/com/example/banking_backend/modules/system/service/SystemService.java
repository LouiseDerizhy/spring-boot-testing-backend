package com.example.banking_backend.modules.system.service;

import org.springframework.stereotype.Service;

import com.example.banking_backend.modules.system.mapper.DatabaseCheckMapper;

@Service
public class SystemService {

    private final DatabaseCheckMapper databaseCheckMapper;

    public SystemService(DatabaseCheckMapper databaseCheckMapper) {
        this.databaseCheckMapper = databaseCheckMapper;
    }

    public int checkDatabase() {
        return databaseCheckMapper.checkConnection();
    }
}