package com.springboot.yangmeng.admin.console.web.dto;


import com.springboot.yangmeng.admin.core.entity.CoreFunction;

public class RoleDataAccessFunction extends CoreFunction {
	private Integer dataAccessType;
	private Long roleId;

	public Integer getDataAccessType() {
		return dataAccessType;
	}

	public void setDataAccessType(Integer dataAccessType) {
		this.dataAccessType = dataAccessType;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
