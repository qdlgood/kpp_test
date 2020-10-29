package com.trustkernel.kpp.api;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.trustkernel.kpp.api.dao",annotationClass = Mapper.class)
@SpringBootApplication
public class ApiTestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);
	}

}
