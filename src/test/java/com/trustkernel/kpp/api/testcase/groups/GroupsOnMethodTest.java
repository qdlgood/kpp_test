package com.trustkernel.kpp.api.testcase.groups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

//分组测试
public class GroupsOnMethodTest {
	
	private Logger logger = LoggerFactory.getLogger(GroupsOnMethodTest.class);
	
	@Test(groups = "server")
	public void serverTest1() {
		logger.info("这是服务端组测试方法1");
	}
	
	@Test(groups = "server")
	public void serverTest2() {
		logger.info("这是服务端组测试方法2");
	}
	
	@Test(groups = "client")
	public void clientTest1() {
		logger.info("这是客户端组测试方法1");
	}
	
	@Test(groups = "client")
	public void clientTest2() {
		logger.info("这是客户端组测试方法2");
	}
	
	@Test(groups = "thirdParty")
	public void thirdParty1() {
		logger.info("这是第三方组测试方法111");
	}
	
	@Test(groups = "thirdParty")
	public void thirdParty2() {
		logger.info("这是第三方组测试方法222");
	}
	
	@Test(groups = {"client","server"})
	public void serverClientTest() {
		logger.info("这是组合端组测试方法");
	}
	
}
