package com.springboot.yangmeng.admin.core.dao;

import com.springboot.yangmeng.admin.core.entity.CoreAudit;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;


@SqlResource("core.coreAudit")
public interface CoreAuditDao extends BaseMapper<CoreAudit> {

}
