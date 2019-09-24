package com.manisha.demo;

class StudentReport{
	
	private int id;
	private String name;
	private double maths;
	private double physics;
	private double chemistry;
	private double average;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public StudentReport() {
		
	}
	public StudentReport(int id, String name, double maths, double physics, double chemistry, double average) {
		super();
		this.id = id;
		this.name = name;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.average = average;
	}
	
}