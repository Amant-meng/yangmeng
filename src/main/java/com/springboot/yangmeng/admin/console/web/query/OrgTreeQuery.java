package com.springboot.yangmeng.admin.console.web.query;

import com.springboot.yangmeng.admin.core.web.query.PageParam;

import java.util.List;

/**
 * 描述: 带有组织树相关的查询
 */
public class OrgTreeQuery extends PageParam {
    protected Long orgId; //组织id
    protected List<Long> orgIds;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public List<Long> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<Long> orgIds) {
        this.orgIds = orgIds;
    }
}
