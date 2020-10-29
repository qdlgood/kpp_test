package com.trustkernel.kpp.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trustkernel.kpp.api.dao.VehicleModelTypeDao;
import com.trustkernel.kpp.api.pojo.VehicleModelType;
import com.trustkernel.kpp.api.service.IVehicleModelTypeService;

@Service
public class VehicleModelTypeServiceImpl implements IVehicleModelTypeService{
	
	private Logger logger = LoggerFactory.getLogger(VehicleModelTypeServiceImpl.class);
	
	@Autowired
	VehicleModelTypeDao vehicleModelTypeDao;

	@Override
	public VehicleModelType selectAll() {
		logger.info("访问数据库。。。");
		return vehicleModelTypeDao.selectAllData();
	}

}
