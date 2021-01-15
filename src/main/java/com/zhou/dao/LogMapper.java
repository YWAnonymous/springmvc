package com.zhou.dao;

import com.zhou.pojo.LogEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LogMapper {

    int saveLog(LogEntity logEntity);
}
