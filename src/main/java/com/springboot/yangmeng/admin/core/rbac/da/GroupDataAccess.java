package com.springboot.yangmeng.admin.core.rbac.da;

import com.springboot.yangmeng.admin.core.rbac.AccessType;
import com.springboot.yangmeng.admin.core.rbac.DataAccess;
import com.springboot.yangmeng.admin.core.rbac.DataAccessResullt;
import com.springboot.yangmeng.admin.core.rbac.tree.OrgItem;
import com.springboot.yangmeng.admin.core.service.CorePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 集团公司所有
 * @author lijiazhi
 *
 */
@Component
public class GroupDataAccess implements DataAccess {

	@Autowired
	CorePlatformService platformService;

	@Override
	public DataAccessResullt getOrg(Long userId, Long orgId) {
		OrgItem root = platformService.buildOrg();
		OrgItem company  = root.findChild(orgId);
		OrgItem group = root.findParentOrgItem(DefaultDataAccessFactory.GROUP_TYPE);
		List<OrgItem> all = group.findAllChildOrgItem();
		List<Long> list = new ArrayList<Long>(all.size());
		for(OrgItem org:all){
			list.add(org.getId());
		}

		DataAccessResullt ret = new DataAccessResullt();
		ret.setStatus(AccessType.OnlyOrg);
		ret.setOrgIds(list);
		return ret;

	}

	@Override
	public String getName() {
		return "集团下所有";
	}

	@Override
	public Integer getType() {
		return 6;
	}

}
