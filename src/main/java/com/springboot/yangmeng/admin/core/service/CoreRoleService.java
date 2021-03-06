package com.springboot.yangmeng.admin.core.service;

import com.springboot.yangmeng.admin.core.dao.CoreRoleDao;
import com.springboot.yangmeng.admin.core.entity.CoreRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述: 字典 service，包含常规字典和级联字典的操作。
 * @author : xiandafu
 */
@Service
@Transactional
public class CoreRoleService extends CoreBaseService<CoreRole> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoreRoleService.class);

    @Autowired
    private CoreRoleDao roleDao;


    public List<CoreRole> getAllRoles(String type){
    	CoreRole template = new CoreRole();
    	template.setType(type);
    	return roleDao.template(template);
    }





}
