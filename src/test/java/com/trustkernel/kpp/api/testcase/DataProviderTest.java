package com.trustkernel.kpp.api.testcase;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.fabric.xmlrpc.base.Array;
import com.trustkernel.kpp.api.pojo.demo.User;

//参数化测试：第二种
public class DataProviderTest {
	
	private Logger logger = LoggerFactory.getLogger(DataProviderTest.class);
	
	//一个参数
	@Test(dataProvider = "OneParam")
	public void oneDataProviderTest(String description) {
		logger.info("关键时刻：" + description);
	}
	
	@DataProvider(name = "OneParam")
	public Object[] oneData() {
		Object[] objects = new Object[] {
				"不","知","所","措"
		};
		return objects;
	}
	
	//两个参数
	@Test(dataProvider = "twoParam")
	public void twoDataProviderTest(String name, int age) {
		logger.info("name is {}, age is {}", name, age);
	}
	
	@DataProvider(name = "twoParam")
	public Object[] twoData() {
		Object[][] o = new Object[][] {
            {"zhangsan",10},
            {"lisi",11},
            {"wangwu",12},
            {"zhaoliu",13}
        };
        return o;
	}
	
	//多个参数
	@Test(dataProvider = "manyParam")
	public void manyDataProviderTest(String name,int age,String nation,int height) {
		logger.info("name is {}, age is {}, nation is {}, height is {}",name, age, nation, height);
	}
	
	@DataProvider(name = "manyParam")
	public Object[] manyData() {
		Object[][] o = new Object[][] {
			{"A",20,"中国",180},
            {"B",21,"USA",150},
            {"C",22,"AUS",160},
            {"D",23,"CAN",170}
        };
        return o;
	}
	
	//对象，List (根据方法名不同 传不同的参数)
	@Test(dataProvider = "userParam")
	public void getUser(User user) {
	    logger.info("User is " + user.toString());
	}
	@Test(dataProvider = "userParam")
	public void getUsers(List<User> users) {
		for (User user : users) {
			logger.info("User is " + user.toString());
		}
	}
	
	@DataProvider(name = "userParam")
	public Object[] userData(Method method) {
		Object[] objects = null;
		if (method.getName().equals("getUser")) {
			objects = new Object[] {
					new User("lisi", "男", 15),
					new User("wangwu", "男", 16),
					new User("zhangsan", "男", 17)
				};
		} else if (method.getName().equals("getUsers")) {
			List<User> list = new ArrayList<>();
			list.add(new User("lisi", "男", 15));
			list.add(new User("wangwu", "男", 16));
			list.add(new User("zhangsan", "男", 17));
			objects = new Object[] {
					list
			};
		}
		return objects;
	}
	
	//如果应用数据源在另一个类中定义的，还需指明其所在测试类
	//如：@Test(dataProvider = "", dataProviderClass = ***.class)
	
}
