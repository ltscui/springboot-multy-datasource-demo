package com.datasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datasource.pojo.SysLog;

@DS(value = "test3")
public interface MultMapperTest03 extends BaseMapper<SysLog> {

}
