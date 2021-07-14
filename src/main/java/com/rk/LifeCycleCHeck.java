package com.rk;

import org.springframework.beans.factory.BeanNameAware;

public class LifeCycleCHeck implements BeanNameAware {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	 public void myInit(){
	      System.out.println("Bean is going through init.");
	   }
	   public void myDestroy(){
	      System.out.println("Bean will destroy now.");
	   }

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("In set Bean Name");
	}
}
