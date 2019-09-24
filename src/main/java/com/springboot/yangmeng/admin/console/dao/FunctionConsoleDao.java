package com.springboot.yangmeng.admin.console.dao;

import com.springboot.yangmeng.admin.core.entity.CoreFunction;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("console.function")
public interface FunctionConsoleDao extends BaseMapper<CoreFunction> {

    /**
     * 根据条件查询
     *
     * @param query
     */
    public void queryByCondtion(PageQuery query);
}
