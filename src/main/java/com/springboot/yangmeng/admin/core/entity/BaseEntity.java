package com.springboot.yangmeng.admin.core.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.beetl.sql.core.TailBean;

import java.util.Map;

/**
 * 描述:用于辅助序列化beetlsql 的TailBean
 * @author : xiandafu
 */

public class BaseEntity extends TailBean implements java.io.Serializable {

	protected final static String ORACLE_CORE_SEQ_NAME="core_seq";
	protected final static String ORACLE_AUDIT_SEQ_NAME="audit_seq";
	protected final static String ORACLE_FILE_SEQ_NAME="core_seq";
	@JsonAnyGetter
    public Map<String, Object> getTails(){
    	return super.getTails();
    }




}
