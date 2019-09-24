package com.springboot.yangmeng.admin.core.dao;

import com.springboot.yangmeng.admin.core.entity.CoreRoleFunction;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

@SqlResource("core.coreRoleFunction")
public interface CoreRoleFunctionDao extends BaseMapper<CoreRoleFunction> {


    List<CoreRoleFunction> getRoleFunction(Long userId, Long orgId,
                                           String code);

    List<String> getRoleChildrenFunction(Long userId, Long orgId,
                                         Long parentId);


}
