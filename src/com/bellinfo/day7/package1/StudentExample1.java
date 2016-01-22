package com.bellinfo.day7.package1;

public class StudentExample1 {

	public static void main(String args[]) {
		Student sd1 = new Student();
		Student sd2 = new Student();
		Student sd3 = new Student();

		sd1.setId(1);
		sd1.setName("Santosh");
		sd1.setFee(12.0);

		sd2.setId(1);
		sd2.setName("Rajesh");
		sd2.setFee(11.0);

		sd3.setId(1);
		sd3.setName("Ravi");
		sd3.setFee(10.0);

		System.out.println(sd1.toString());
	}
}

class Student {

	private int id;
	private String name;
	private double fee;

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

	
	
}