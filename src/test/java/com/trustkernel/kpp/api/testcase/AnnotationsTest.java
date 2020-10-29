package com.trustkernel.kpp.api.testcase;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//注解测试
public class AnnotationsTest {
	
	private Logger logger = LoggerFactory.getLogger(AnnotationsTest.class);
	
	@BeforeSuite
	public void beforeSuite() {
		logger.info("execute beforeSuite1 method");
	}
	
	@AfterSuite
	public void afterSuite() {
		logger.info("execute afterSuite2 method");
	}
	
	@BeforeTest
	public void beforeTest() {
		logger.info("execute beforeTest1 method");
	}
	
	@AfterTest
	public void afterTest() {
		logger.info("execute afterTest2 method");
	}
	
	@BeforeClass
	public void beforeClass() {
		logger.info("execute beforeClass1 method");
	}
	
	@AfterClass
	public void afterClass() {
		logger.info("execute afterClass2 method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		logger.info("execute beforeMethod1 method");
	}
	
	@AfterMethod
	public void afterMethod() {
		logger.info("execute afterMethod2 method");
	}
	
	@Test //priority = 1  默认值是0，指定所加@Test的方法执行顺序，值越小优先级越高
	public void login() {
		logger.info("登录。。。");
	}
	
	@Test
	public void exit() {
		logger.info("退出。。。");
	}

}
