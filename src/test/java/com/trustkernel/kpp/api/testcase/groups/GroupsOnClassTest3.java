package com.trustkernel.kpp.api.testcase.groups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test(groups = "min")
public class GroupsOnClassTest3 {
	
    private Logger logger = LoggerFactory.getLogger(GroupsOnClassTest3.class);
	
	public void min1() {
		logger.info("GroupsOnClass3中的min1运行！");
	}
	
	public void min2() {
		logger.info("GroupsOnClass3中的min2运行！");
	}

}
