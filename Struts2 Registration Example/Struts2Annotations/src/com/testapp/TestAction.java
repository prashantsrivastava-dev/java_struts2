package com.testapp;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


public class TestAction {
	@Action(value = "/testAction", results = { @Result(name = "success", location = "/success.jsp"),
			@Result(name = "error", location = "/error.jsp") })
	public String execute() {
		System.out.println("execute() method called");
		return "error";
	}
}
