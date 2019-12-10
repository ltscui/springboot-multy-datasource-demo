package com.datasource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.datasource.mapper.MultMapperTest01;
import com.datasource.mapper.MultMapperTest02;
import com.datasource.mapper.MultMapperTest03;
import com.datasource.pojo.SysLog;
import com.datasource.service.MultyService;

@Service
public class MultyServiceImpl implements MultyService {

	@Autowired
	private MultMapperTest01 test01;

	@Autowired
	private MultMapperTest02 test02;

	@Autowired
	private MultMapperTest03 test03;

	public List<SysLog> test01() {
		return test01.selectList(new QueryWrapper<>());
	}

	public List<SysLog> test02() {
		return test02.selectList(new QueryWrapper<>());
	}

	public List<SysLog> test03() {
		return test03.selectList(new QueryWrapper<>());
	}

}
