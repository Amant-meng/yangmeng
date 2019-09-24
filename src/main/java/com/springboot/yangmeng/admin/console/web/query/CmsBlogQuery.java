package com.springboot.yangmeng.admin.console.web.query;

import com.springboot.yangmeng.admin.core.annotation.Query;
import com.springboot.yangmeng.admin.core.web.query.PageParam;

/**
 *CmsBlog查询
 */
public class CmsBlogQuery extends PageParam {
    @Query(name = "id", display = true)
    private Integer id;
    public Integer getId(){
        return  id;
    }
    public void setId(Integer id ){
        this.id = id;
    }

}
