package com.trustkernel.kpp.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.trustkernel.kpp.api.pojo.VehicleModelType;

@Mapper
public interface VehicleModelTypeDao extends BaseMapper<VehicleModelType>  {
	
	VehicleModelType selectAllData();

}
