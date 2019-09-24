package com.springboot.yangmeng.admin.core.util;

import com.springboot.yangmeng.admin.core.entity.CoreOrg;
import com.springboot.yangmeng.admin.core.rbac.tree.OrgItem;

import java.util.ArrayList;
import java.util.List;

public class OrgBuildUtil {
	private  OrgBuildUtil(){

	}


	public static void buildTreeNode(OrgItem parent,List<CoreOrg> list){



		long id = parent.getId();
		List<CoreOrg> dels = new ArrayList<>();
		for(CoreOrg sysOrg:list){
			if(sysOrg.getParentOrgId()!=null&&sysOrg.getParentOrgId()==id){
				OrgItem item = new OrgItem(sysOrg);
				item.setParent(parent);
				dels.add(sysOrg);
			}
		}
		list.removeAll(dels);

		if(list.isEmpty()){
			return ;
		}
		for(OrgItem child:parent.getChildren()){
			buildTreeNode(child,list);
		}

	}
}
