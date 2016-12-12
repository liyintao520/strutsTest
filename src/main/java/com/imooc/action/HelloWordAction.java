package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWordAction extends ActionSupport{
	public String execute() throws Exception {
		System.out.println("执行HelloWordAction...");
		return SUCCESS;
	}
	public String add() {
		return "add";
	}
	public String update() {
		return "update";
	}
}
