package com.trustkernel.kpp.api.constants;

public class UrlConstants {
	
	//private final static String TSP_BASE_URL = "http://tsp-b.kpp.trustkernel.com/tsp/";
	
	private final static String KSS_BASE_URL = "http://kss-b.kpp.trustkernel.com/kss/";
	
	private final static String KSS = "kss";
	private final static String VERSION = "v1";
	private final static String DEVICE = "device";
	private final static String VEHICLE = "vehicle";
	public final static String MANAGER = "manager";
	
	private final static String KSS_BASE_API_DEVICE = KSS_BASE_URL + KSS + "/" + VERSION + "/" + DEVICE;//手机
	private final static String KSS_BASE_API_VEHICLE = KSS_BASE_URL + KSS + "/" + VERSION + "/" + VEHICLE;//车辆
	public final static String KSS_BASE_API_MANAGER =KSS_BASE_URL + KSS + "/" + VERSION + "/" + MANAGER;//管理
	
	//需测试的接口
	public final static String kss_get_cert_chain = KSS_BASE_API_DEVICE + "/getCertChain";//获取KSS证书链
	public final static String kss_upload_dkd_csr = KSS_BASE_API_DEVICE + "/uploadDKDCsr";//上传DKD证书请求
	public final static String kss_upload_dkd_csr_v2 = KSS_BASE_API_DEVICE + "/uploadDKDCsrV2";//上传DKD证书请求V2
	public final static String kss_query_dkd_cert = KSS_BASE_API_DEVICE + "/queryDKDCert";//上传DKD证书请求V2
	public final static String kss_gen_dkd = KSS_BASE_API_DEVICE + "/genDkd";//云端自动生成数字钥匙
	public final static String kss_gen_dkd_v2 = KSS_BASE_API_DEVICE + "/genDkd/v2";//云端自动生成数字钥匙V2
	public final static String kss_apply_shared_key =  KSS_BASE_API_DEVICE+"/applySharedKey";//手机申请分享钥匙
	public final static String kss_apply_undo_key = KSS_BASE_API_DEVICE+"/applyUndoKey";//手机申请撤销钥匙
	public final static String kss_cloud_cancel_key = KSS_BASE_API_DEVICE+"/cloudUndoKey";//云端直接撤销钥匙
	public final static String kss_query_pre_instructions = KSS_BASE_API_DEVICE+"/queryPreInstructions";//获取待执行指令列表
	public final static String kss_execu_result_sync = KSS_BASE_API_DEVICE+"/execuResultSync";//指令执行结果响应
	public final static String kss_check_dkd_valid = KSS_BASE_API_DEVICE + "/checkDkdValid";//DKD有效性判断
	public final static String kss_logout_dkd = KSS_BASE_API_DEVICE + "/logoutDkd";//DKD有效性判断
	public final static String kss_download_dk = KSS_BASE_API_DEVICE + "/downloadDk";//下载数字钥匙
	public final static String kss_select_vehicle_type_flag = KSS_BASE_API_DEVICE + "/getVehicleCode";//获取车型编码
	public final static String kss_upload_calibration_data =  KSS_BASE_API_DEVICE + "/uploadCalibrationData";//上传标定数据
	public final static String kss_download_calibration_data =  KSS_BASE_API_DEVICE + "/downloadCalibrationData";//下载标定数据
	
	//辅助接口
	public final static String kss_create_kss_cert_by_type = KSS_BASE_API_MANAGER + "/createKssByType?id=94c9cafc690842bcb8c145804bd14a84";//根据车型ID生成kss根证书
	
}
