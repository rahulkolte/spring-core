package com.rk;

public class DepartmentBean {

	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void print()
	{
		System.out.println("Department object is created" + deptName);
	}
}
