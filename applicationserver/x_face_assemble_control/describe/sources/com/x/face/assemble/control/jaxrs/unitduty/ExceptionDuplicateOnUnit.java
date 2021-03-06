package com.x.face.assemble.control.jaxrs.unitduty;

import com.x.base.core.project.exception.PromptException;

class ExceptionDuplicateOnUnit extends PromptException {

	private static final long serialVersionUID = 4132300948670472899L;

	ExceptionDuplicateOnUnit(String name, String unitName) {
		super("组织职务名称 {} 在同一个组织 {} 中必须唯一.", name, unitName);
	}
}
