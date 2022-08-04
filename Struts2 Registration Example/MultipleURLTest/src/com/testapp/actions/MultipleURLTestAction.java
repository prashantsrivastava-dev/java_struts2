package com.testapp.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;

@Actions({
	@Action(value="/testAction1", results = {@Result(name="success",location="/result1.jsp")}),
	@Action(value="/testAction2", results = {@Result(name="success",location="/result2.jsp")})
})
public class MultipleURLTestAction {
	
	public String execute() {
		System.out.println("execute() method of MultipleURLTestAction called");
		return "success";
	}

}
