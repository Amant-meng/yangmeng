package com.springboot.yangmeng.admin.core.rbac.da;

import com.springboot.yangmeng.admin.core.rbac.AccessType;
import com.springboot.yangmeng.admin.core.rbac.DataAccess;
import com.springboot.yangmeng.admin.core.rbac.DataAccessResullt;
import com.springboot.yangmeng.admin.core.service.CorePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 只查看自己
 * @author lijiazhi
 *
 */
@Component
public class OwnerDataAccess implements DataAccess {

	@Autowired
	CorePlatformService platformService;

	@Override
	public DataAccessResullt getOrg(Long userId, Long orgId) {
		DataAccessResullt ret = new DataAccessResullt();
		ret.setStatus(AccessType.OnlyUser);
		ret.setUserIds(Arrays.asList(userId));
		return ret;

	}

	@Override
	public String getName() {
		return "只查看自己";
	}

	@Override
	public Integer getType() {
		return 1;
	}

}
