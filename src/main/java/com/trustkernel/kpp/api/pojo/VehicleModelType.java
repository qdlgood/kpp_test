package com.trustkernel.kpp.api.pojo;

/**
 * 车型表 
 */
public class VehicleModelType extends BaseEntity {
	
	public static final String status_ok="0";
	public static final String status_not="1";

	/**
	 * 车型
	 */
	private String model;

	/**
	 * 车型别名
	 */
	private String describe;

	/**
	 * 数字钥匙服务状态
	 * 0已启用 1已关闭
	 */
	private String status;

	/**
	 * 车型根证书id
	 */
	private String certId;

	/**
	 * 车型根秘钥id
	 */
	private String keyId;

}
