package com.springboot.yangmeng.admin.core.dao;

import com.springboot.yangmeng.admin.core.entity.CoreUserRole;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("core.coresUserRole")
public interface CoreUserRoleDao extends BaseMapper<CoreUserRole> {


}
