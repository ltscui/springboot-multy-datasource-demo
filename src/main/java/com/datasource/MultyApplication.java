package com.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 自动化测试启动主入口
 * @author CuiWW
 * @date 2019年10月18日
 */
@SpringBootApplication
@MapperScan(basePackages = "com.datasource.mapper")
public class MultyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultyApplication.class, args);
	}
}
