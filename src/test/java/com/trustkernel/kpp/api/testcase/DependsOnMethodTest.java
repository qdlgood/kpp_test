package com.trustkernel.kpp.api.testcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

//依赖测试
public class DependsOnMethodTest {
	
	private Logger logger = LoggerFactory.getLogger(DependsOnMethodTest.class);
	
	@Test
	public void dependTest() {
//		Assert.fail("error");
		logger.info("Execute dependTest method");
	}
	
	@Test(dependsOnMethods = {"dependTest"})
	public void dependTest2() {
		logger.info("Execute dependTest2 method");
	}
	
	@Test(groups = "login")
    public void dependGroupsTest1() {
        logger.info("欢迎登录");
    }

    @Test(groups = "recharge")
    public void dependGroupsTest2() {
        Assert.fail("error...");
        logger.info("你已成功充值");
    }

    @Test(dependsOnGroups = "login")
    public void dependGroupsTest3() {
    	logger.info("请您操作");
    }

    //同时依赖多个组,用{}
    @Test(dependsOnGroups = {"login","recharge"}) //如果recharge失败，此测试方法也会失败
    public void dependGroupsTest4() {
    	logger.info("请您选择需要购买的产品");
    }

}
