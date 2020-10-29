package com.trustkernel.kpp.api.testcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

//异常测试
public class ExceptionTest {
	
	private Logger logger = LoggerFactory.getLogger(ExceptionTest.class);
	
	/**
	 * 什么时候会用到异常测试？
	 * 在我们期望结果为某一个异常的时候
	 * 比如：我们传入了某些不合法的参数，程序抛出了异常
	 * 也就是说我们的预期结果就是这个异常
	 */
	
	@Test(expectedExceptions = RuntimeException.class)
	public void runTimeExceptionSuccess() {
		logger.info("这是一个成功的异常测试");
		throw new RuntimeException();
	}
	
	@Test(expectedExceptions = RuntimeException.class)
	public void runTimeExceptionFailed() {
		logger.info("这是一个失败的异常测试");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
    public void arithmeticException() {
        int i = 1/0;
	}

}
