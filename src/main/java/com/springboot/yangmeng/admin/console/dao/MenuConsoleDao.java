package com.springboot.yangmeng.admin.console.dao;

import com.springboot.yangmeng.admin.core.entity.CoreMenu;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("console.menu")
public interface MenuConsoleDao extends BaseMapper<CoreMenu> {

    /**
     * 根据条件分页查询
     * @param query 查询条件
     */
    void queryByCondtion(PageQuery query);


}
