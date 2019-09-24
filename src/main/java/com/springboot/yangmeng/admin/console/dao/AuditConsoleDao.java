package com.springboot.yangmeng.admin.console.dao;


import com.springboot.yangmeng.admin.core.entity.CoreAudit;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("console.audit")
public interface AuditConsoleDao extends BaseMapper<CoreAudit> {

    PageQuery<CoreAudit> queryByCondtion(PageQuery<CoreAudit> query);

}

