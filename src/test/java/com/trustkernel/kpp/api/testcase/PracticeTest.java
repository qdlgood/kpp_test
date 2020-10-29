package com.trustkernel.kpp.api.testcase;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
import com.trustkernel.kpp.api.ApiTestApplication;
import com.trustkernel.kpp.api.constants.UrlConstants;
import com.trustkernel.kpp.api.pojo.VehicleModelType;
import com.trustkernel.kpp.api.service.IVehicleModelTypeService;
import com.trustkernel.kpp.api.utils.HttpUtil;

@SpringBootTest(classes = ApiTestApplication.class)
public class PracticeTest extends AbstractTestNGSpringContextTests{
	
	private Logger logger = LoggerFactory.getLogger(PracticeTest.class);
	
	@Autowired
	IVehicleModelTypeService vehicleModelTypeService;
	
	@Test(dataProvider = "typeIdParam")
	public void test(String typeId) {
		JSONObject paramsJsonObject = new JSONObject();
		paramsJsonObject.put("typeId", typeId);
		CloseableHttpResponse response = HttpUtil.post(UrlConstants.kss_get_cert_chain, paramsJsonObject.toString());
		JSONObject responseJsonObject = HttpUtil.getResponseJsonObject(response);
		logger.info("result is " + responseJsonObject);
		String statusCode = HttpUtil.getStatusCode(responseJsonObject);
		Assert.assertEquals(statusCode, "10000");
	}
	
	@DataProvider(name = "typeIdParam")
	public Object[] paramsData() {
		Object[] objects = {
			"", null,"123", "94c9cafc690842bcb8c145804bd14a84","cceb272dac6c468d8b37b98e93e5f167"
		};
		return objects;
	}
	
//	@Test
//	public void selectId() {
//		logger.info("Begin selectData method");
//		VehicleModelType  vehicleModelType = vehicleModelTypeService.selectAll();
//		Assert.assertEquals(vehicleModelType.getId(), "94c9cafc690842bcb8c145804bd14a84");
//	}
	
	@Test
	public void createKssCert() {
		CloseableHttpResponse response = HttpUtil.post(UrlConstants.kss_create_kss_cert_by_type);
		JSONObject responseJsonObject = HttpUtil.getResponseJsonObject(response);
		logger.info("result is " + responseJsonObject);
	}
	
	@Test(dataProvider = "certRequestParam")
	public void uploadDKDCsr(String certRequest) {
		JSONObject paramsJsonObject = new JSONObject();
		paramsJsonObject.put("certRequest", certRequest);
		CloseableHttpResponse response = HttpUtil.post(UrlConstants.kss_upload_dkd_csr, paramsJsonObject.toString());
		JSONObject responseJsonObject = HttpUtil.getResponseJsonObject(response);
		logger.info("result is " + responseJsonObject);
		String statusCode = HttpUtil.getStatusCode(responseJsonObject);
		Assert.assertEquals(statusCode, "10000");
	}
	
	@DataProvider(name = "certRequestParam")
	public Object certRequestParam() {
		Object[] objects = {
			"123"	
		};
		return objects;
	}

}
