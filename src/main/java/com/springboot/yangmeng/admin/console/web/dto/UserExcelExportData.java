package com.springboot.yangmeng.admin.console.web.dto;

import lombok.Data;

/**
 * excel导出需要的模板数据
 * @author xiandafu
 *
 */
@Data
public class UserExcelExportData  {
	protected Long id;
	private String code;
	private String name;
	private String orgText;
	private String password;
	private String stateText;
	private String jobType1Text;

}
