package com.zhou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogEntity {
    private int id;
    private String module;//执行的模块
    private String method; //执行的方法
    private String responseDate;//响应时间
    private String comment;//执行描述

}
