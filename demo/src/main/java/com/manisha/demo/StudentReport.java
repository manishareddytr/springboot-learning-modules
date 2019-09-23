package com.manisha.demo;

class StudentReport{
	private double maths;
	private double physics;
	private double chemistry;
	private double average;
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
	public StudentReport(double maths, double physics, double chemistry, double average) {
		super();
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.average = average;
	}
}