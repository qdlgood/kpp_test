package com.trustkernel.kpp.api.testcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

//多线程测试：xml文件方式实现
public class MultiThreadOnXmlTest {
	
	private Logger logger = LoggerFactory.getLogger(MultiThreadOnXmlTest.class);
	
	@Test
    public void test1() {
        logger.info("Thread Id : {}",Thread.currentThread().getId());
    }

    @Test
    public void test2() {
    	logger.info("Thread Id : {}",Thread.currentThread().getId());
    }

    @Test
    public void test3() {
    	logger.info("Thread Id : {}",Thread.currentThread().getId());
    }

}
