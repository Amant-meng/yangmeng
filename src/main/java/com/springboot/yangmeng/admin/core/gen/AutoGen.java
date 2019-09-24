package com.springboot.yangmeng.admin.core.gen;

import com.springboot.yangmeng.admin.core.gen.model.Entity;

public interface AutoGen {
	public void make(Target target, Entity entity);
	public String getName();
}
