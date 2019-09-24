package com.springboot.yangmeng.admin.console.dao;

import com.springboot.yangmeng.admin.console.web.dto.RoleDataAccessFunction;
import com.springboot.yangmeng.admin.core.entity.CoreRoleFunction;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

@SqlResource("console.roleFunction")
public interface RoleFunctionConsoleDao extends BaseMapper<CoreRoleFunction> {


    void deleteRoleFunction(List<Long> ids);

    List<Long> getFunctionIdByRole(Long roleId);

    List<RoleDataAccessFunction> getQueryFunctionAndRoleData(Long roleId);


}
