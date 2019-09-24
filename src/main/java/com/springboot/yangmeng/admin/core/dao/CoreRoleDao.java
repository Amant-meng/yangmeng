package com.springboot.yangmeng.admin.core.dao;

import com.springboot.yangmeng.admin.core.entity.CoreRole;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("core.coreRole")
public interface CoreRoleDao extends BaseMapper<CoreRole> {



}
