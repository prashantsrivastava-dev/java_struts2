package com.testapp.user.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Action("/getMetadata")
@Result(name="success",location="/namespace.jsp")
public class UserMetadataAction {
	
	public String execute() {
		System.out.println("execute() method of UserMetadataAction called");
		return "success";
	}

}
