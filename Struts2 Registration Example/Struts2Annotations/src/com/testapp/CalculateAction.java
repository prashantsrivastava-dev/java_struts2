package com.testapp;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


public class CalculateAction {
	
	@Action(value="/calculateEMI", results = {@Result(name = "success", location = "/success.jsp")})
	public String calculateEMI() {
		System.out.println("calculateEMI() called");
		return "success";
	}
	
	@Action(value="/calculateInterestRate", results = {@Result(name = "success", location = "/error.jsp")})
	public String calculateInterestRate() {
		System.out.println("calculateInterestRate() called");
		return "success";
	}
	
	@Action("/calculateIncomeTax")
	public String calculateIncomeTax() {
		System.out.println("calculateIncomeTax() called");
		return "success";
	}

}
