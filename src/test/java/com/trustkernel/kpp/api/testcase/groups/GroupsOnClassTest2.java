package com.trustkernel.kpp.api.testcase.groups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test(groups = "max")
public class GroupsOnClassTest2 {
	
    private Logger logger = LoggerFactory.getLogger(GroupsOnClassTest2.class);
	
	public void max1() {
		logger.info("GroupsOnClass2中的max1运行！");
	}
	
	public void max2() {
		logger.info("GroupsOnClass2中的max2运行！");
	}

}
