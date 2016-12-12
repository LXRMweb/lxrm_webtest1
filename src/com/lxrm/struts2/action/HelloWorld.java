/*
 * author:lxrm
 * time:2016.05.06
 * */

package com.lxrm.struts2.action;

import com.opensymphony.xwork2.Action;

public class HelloWorld implements Action {
	private String message;
	public String getMessage(){
		return this.message;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		message="Hello World!";
		return SUCCESS;
	}

}
