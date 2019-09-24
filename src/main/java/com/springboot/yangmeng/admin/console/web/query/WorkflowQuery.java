package com.springboot.yangmeng.admin.console.web.query;

import com.springboot.yangmeng.admin.core.annotation.Query;
import com.springboot.yangmeng.admin.core.web.query.PageParam;

/**
 * 字典表单查询条件
 */
public class WorkflowQuery extends PageParam {

    @Query(name = "用户列表", display = true,fuzzy=true)
    private String userIds;
    @Query(name = "角色列表", display = true,fuzzy=true)
    private String roleIds;
    @Query(name = "机构列表", display = true,fuzzy=true)
    private String orgIds;
	public String getUserIds() {
		return userIds;
	}
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	public String getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(String orgIds) {
		this.orgIds = orgIds;
	}







}
