package com.cg.exception;

public class StudentException extends RuntimeException {

	
	String msg;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
	public StudentException(String msg) {
		
		
		super(msg);
		msg=this.msg;
	
	}
	
	

}
