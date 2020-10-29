package com.trustkernel.kpp.api.testcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

//忽略测试 
public class IgnoreTest {
	
	private Logger logger = LoggerFactory.getLogger(IgnoreTest.class);
	
	@Test(enabled = false)
    public void ignore1() {
        logger.info("ignore1 运行！");
    }

    @Test //默认是不忽略的
    public void ignore2() {
    	logger.info("ignore2 运行！");
    }

    @Test(enabled = true)
    public void ignore3() {
    	logger.info("ignore3 运行！");
    }

}
