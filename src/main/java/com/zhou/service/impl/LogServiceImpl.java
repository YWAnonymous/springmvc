package com.zhou.service.impl;

import com.zhou.dao.LogMapper;
import com.zhou.pojo.LogEntity;
import com.zhou.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    public int saveLog(LogEntity logEntity) {
        return logMapper.saveLog(logEntity);
    }
}
