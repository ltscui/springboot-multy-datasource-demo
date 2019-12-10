package com.datasource.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datasource.pojo.SysLog;
import com.datasource.service.MultyService;

@RestController
@RequestMapping("/multy")
public class MultyController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MultyService multyService;

	@GetMapping("/test")
	public String test() {
		List<SysLog> test01 = multyService.test01();
		logger.info("test01 库 -> {}", test01.toString());

		List<SysLog> test02 = multyService.test02();
		logger.info("test02 库 -> {}", test02.toString());

		List<SysLog> test03 = multyService.test03();
		logger.info("test03 库 -> {}", test03.toString());
		return null;
	}
}
