package com.trustkernel.kpp.api.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	
	public final static String charset="utf-8";
	
	/**
	 * 不带请求头的get方法封装
	 * @param url
	 * @return 返回请求响应对象
	 */
	public static CloseableHttpResponse get (String url)  {
		logger.info("send get request method parameter: url is " + url);
		//创建一个可关闭的HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建一个HttpGet的请求对象
		HttpGet httpget = new HttpGet(url);
		//执行请求
		CloseableHttpResponse httpResponse = null;
		try {
			httpResponse = httpclient.execute(httpget);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send get request method is successful");
		return httpResponse;
	}
	
	/**
	 * 带请求头信息的get方法封装
	 * @param url
	 * @param headermap 带请求的头信息
	 * @return 返回响应对象
	 */
	public static CloseableHttpResponse get (String url, HashMap<String,String> headermap) {
		logger.info("send get request method parameter: url is {} , headermap is {}", url, headermap);
		//创建一个可关闭的HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建一个HttpGet的请求对象
		HttpGet httpget = new HttpGet(url);
		//加载请求头到httpget对象
		for(Map.Entry<String, String> entry : headermap.entrySet()) {
			httpget.addHeader(entry.getKey(), entry.getValue());
		}
		//执行请求
		CloseableHttpResponse httpResponse = null;
		try {
			httpResponse = httpclient.execute(httpget);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send get request method is successful");	
		return httpResponse;
	}
	
	/**
	 * 封装post请求方法
	 * @param url
	 * @param entityString 设置json请求参数
	 * @param headermap 带请求的头信息
	 * @return 返回响应对象
	 */
	public static CloseableHttpResponse post (String url, String entityString, HashMap<String,String> headermap) {
		logger.info("send post request method parameter: url is {} , headermap is {}", url, headermap);
		//创建一个可关闭的HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建一个HttpPost的请求对象
		HttpPost httppost = new HttpPost(url);
		//加载请求头到httppost对象
		for(Map.Entry<String, String> entry : headermap.entrySet()) {
			httppost.addHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse httpResponse = null;
		try {
			//装填参数
			StringEntity s = new StringEntity(entityString, charset);
			s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json"));
			//设置参数到请求对象中
			httppost.setEntity(s);
			//发送post请求
			httpResponse = httpclient.execute(httppost);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send post request method is successful");
		return httpResponse;
	}
	
	//没有请求头的信息
	public static CloseableHttpResponse post (String url, String entityString) {
		logger.info("send post request method parameter: url is {} , entityString is {}", url, entityString);
		//创建一个可关闭的HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建一个HttpPost的请求对象
		HttpPost httppost = new HttpPost(url);
		//设置header信息
		httppost.addHeader("apiKey", "4db5916a9d1247baa8e441ef78cadedd");
		httppost.setHeader("Content-type", "application/json");
		CloseableHttpResponse httpResponse = null;
		try {
			//装填参数
			StringEntity s = new StringEntity(entityString, charset);
			s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json"));
			//设置参数到请求对象中
			httppost.setEntity(s);
			//发送post请求
			httpResponse = httpclient.execute(httppost);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send post request method is successful");
		return httpResponse;
	}
	//没有json请求参数
	public static CloseableHttpResponse post (String url) {
		logger.info("send post request method parameter: url is {} ", url);
		//创建一个可关闭的HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建一个HttpPost的请求对象
		HttpPost httppost = new HttpPost(url);
		//设置header信息
		httppost.addHeader("apiKey", "4db5916a9d1247baa8e441ef78cadedd");
		httppost.setHeader("Content-type", "application/json");
		CloseableHttpResponse httpResponse = null;
		try {
			//发送post请求
			httpResponse = httpclient.execute(httppost);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send post request method is successful");
		return httpResponse;
	}
	
	
	/**
	 * 封装 put请求方法
	 * @param url
	 * @param entityString json请求参数
	 * @param headerMap 带请求的头信息
	 * @return 返回响应对象
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static CloseableHttpResponse put (String url, String entityString, HashMap<String,String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPut httpput = new HttpPut(url);
		StringEntity s = new StringEntity(entityString, charset);
		s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json"));
		httpput.setEntity(s);
		for(Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpput.addHeader(entry.getKey(), entry.getValue());
		}
		//发送put请求
		CloseableHttpResponse httpResponse = httpclient.execute(httpput);
		logger.info("send put request method is successful");
		return httpResponse;
	}
	
	/**
	 * 封装 delete请求方法
	 * @param url
	 * @return
	 */
	public static CloseableHttpResponse delete (String url) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpDelete httpdel = new HttpDelete(url);
		//发送delete请求
		CloseableHttpResponse httpResponse = null;
		try {
			httpResponse = httpclient.execute(httpdel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("send delete request method is successful");
		return httpResponse;
	}
	
	/**
	 * 
	 * @param 请求响应对象
	 * @return response 任何请求返回的响应对象
	 */
	public static JSONObject getResponseJsonObject (CloseableHttpResponse response) {
		String responseString = null;
		try {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				responseString = EntityUtils.toString(entity, charset);
			}
			EntityUtils.consume(entity);
			response.close();
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
		JSONObject responseJson = JSON.parseObject(responseString);
		return responseJson;
	}
	
	/**
	 * 获取响应状态码
	 * @param responseJsonObject
	 * @return
	 */
	public static String getStatusCode (JSONObject responseJsonObject) {
		String statusCode = responseJsonObject.getString("code");
		return statusCode;
		
	}
	
	/**
	 * 获取响应数据
	 * @param responseJsonObject
	 * @return
	 */
	public static String getData (JSONObject responseJsonObject) {
		String data = responseJsonObject.getString("data");
		return data;
		
	}
	

}
