package com.springboot.yangmeng.admin.console.dao;

import com.springboot.yangmeng.admin.core.entity.CoreRole;
import com.springboot.yangmeng.admin.core.entity.CoreUser;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

@SqlResource("console.role")
public interface RoleConsoleDao extends BaseMapper<CoreRole> {

    /**
     * 根据条件分页查询
     * @param query 查询条件
     */
    void queryByCondtion(PageQuery query);

    /**
     * 批量删除角色
     * @param ids 角色id
     */
    void batchDelByIds(List<Long> ids);

    void batchDeleteRoleFunction(List<Long> ids);
    void batchDeleteRoleMenu(List<Long> ids);
    void batchDeleteUserRole(List<Long> ids);


    PageQuery<CoreUser>  queryUser(PageQuery query);




}
