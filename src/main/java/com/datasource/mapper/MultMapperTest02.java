package com.datasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datasource.pojo.SysLog;

@DS(value = "test2")
public interface MultMapperTest02 extends BaseMapper<SysLog> {

}
