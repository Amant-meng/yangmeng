package com.springboot.yangmeng.admin.core.conf;

import com.springboot.yangmeng.admin.core.rbac.DataAccessFactory;
import com.springboot.yangmeng.admin.core.rbac.da.DefaultDataAccessFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 数据权限，可以自动装配
 */
@Configuration
public class RbacDataAccessConfig {
	@ConditionalOnMissingBean(DataAccessFactory.class)
	@Bean
	public DataAccessFactory dataAccessFatory(ApplicationContext applicationContext) {
		return (DataAccessFactory) new DefaultDataAccessFactory(applicationContext);
	}
}
