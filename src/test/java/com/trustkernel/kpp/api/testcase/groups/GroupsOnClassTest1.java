package com.trustkernel.kpp.api.testcase.groups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test(groups = "max")
public class GroupsOnClassTest1 {
	
	private Logger logger = LoggerFactory.getLogger(GroupsOnClassTest1.class);
	
	public void max1() {
		logger.info("GroupsOnClass1中的max1运行！");
	}
	
	public void max2() {
		logger.info("GroupsOnClass1中的max2运行！");
	}

}
