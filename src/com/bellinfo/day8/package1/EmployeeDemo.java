package com.bellinfo.day8.package1;

public class EmployeeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee();
		Department d = new Department();
		d.setId(1);
		d.setName("CS");
		e.setId(1);
		e.setName("Raghu");
		e.setD(d);
		Employee e1 = e.clone();
		 d.setId(2);
		System.out.println(e1.getD().getId());
		e1=null;
		e=null;
		System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Out of it");
		//System.out.println(e.getId());
	}

}

class Employee implements Cloneable {
	private int id;
	private String name;
	private Department d;

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

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee) super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbaging");
		super.finalize();
	}


}

class Department implements Cloneable {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}

	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department)super.clone();
	}

}