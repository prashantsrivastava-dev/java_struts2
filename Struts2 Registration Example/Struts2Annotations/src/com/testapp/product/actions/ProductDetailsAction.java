package com.testapp.product.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@ResultPath("/view")
@Action("/getDetails")
@Result(name="success",location="product.jsp")
public class ProductDetailsAction {
	
	public String execute() {
		System.out.println("execute() method of ProductDetailsAction called");
		return "success";
	}

}
