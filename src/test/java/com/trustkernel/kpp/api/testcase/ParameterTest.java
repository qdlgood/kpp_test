package com.trustkernel.kpp.api.testcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//参数化测试：第一种
public class ParameterTest {
	
	public Logger loggrer = LoggerFactory.getLogger(ParameterTest.class);
	
	@Test
	@Parameters({"name","age"}) //xml文件中声明
	public void paramTest(String name, int age) {
		loggrer.info("name: {}, age: {}", name, age);
	}

}
