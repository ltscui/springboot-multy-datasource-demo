package com.datasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datasource.pojo.SysLog;

@DS(value = "test1")
public interface MultMapperTest01 extends BaseMapper<SysLog> {

}
