package com.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentRecord {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String surName;
	private Long deptId;
	
	

	public StudentRecord(Long id, String firstName, String lastName, String surName, Long deptId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
		this.deptId = deptId;
	}

	public StudentRecord() {
	}
	
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
}
