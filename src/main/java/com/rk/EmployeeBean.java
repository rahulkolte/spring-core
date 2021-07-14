package com.rk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	@Autowired
	@Qualifier("q2")
	private DepartmentBean departmentBean;

	private String name;
	private int id;

	// constrctor based
	
	/*
	 * public EmployeeBean(DepartmentBean departmentBean) { // TODO Auto-generated
	 * constructor stub this.departmentBean = departmentBean; }
	 */

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	@Override
	public String toString() {
		return "EmployeeBean [departmentBean=" + departmentBean + ", name=" + name + ", id=" + id
				+ ", getDepartmentBean()=" + getDepartmentBean() + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		departmentBean.print();
	}
}
