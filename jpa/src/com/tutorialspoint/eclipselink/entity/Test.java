package com.tutorialspoint.eclipselink.entity;

public class Test {
	
	
	 private int eid;
	   private String ename;
	   private double salary;
	   private String deg;
	   
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [eid=" + eid + ", ename=" + ename + ", salary=" + salary
				+ ", deg=" + deg + ", getEid()=" + getEid() + ", getEname()="
				+ getEname() + ", getSalary()=" + getSalary() + ", getDeg()="
				+ getDeg() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Test(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}

	   
	   
}
