package com.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private long deptId;
	private String deptname;
	
	public Department(long i, String deptname) {
		this.deptId = i;
		this.deptname = deptname;
	}
	
	public Department() {
	}

	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
