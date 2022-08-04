package com.testapp.user.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@ResultPath("/view")
@Action("/getDetails")
@Result(name="success",location="user.jsp")
public class UserDetailsAction {
	
	public String execute() {
		System.out.println("execute() method of UserDetailsAction called");
		return "success";
	}

}
