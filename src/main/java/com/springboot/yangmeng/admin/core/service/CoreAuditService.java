package com.springboot.yangmeng.admin.core.service;

import com.springboot.yangmeng.admin.core.dao.CoreAuditDao;
import com.springboot.yangmeng.admin.core.entity.CoreAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoreAuditService extends CoreBaseService<CoreAudit> {

    @Autowired
    private CoreAuditDao sysAuditDao;


}
