package com.trustkernel.kpp.api.pojo;

import java.util.Date;

public class BaseEntity {
	private String id;
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private String createBy;// 创建人
	private String updateBy;// 更新人
	private String isDeleted;//0未删除 1已经删除

	public String getId() {
		return id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsDeleted() {

		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

}