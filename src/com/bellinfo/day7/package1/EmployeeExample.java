package com.bellinfo.day7.package1;

public class EmployeeExample {
	public static void main(String args[]) {
		Department d = new Department();
		Department d1 = new Department();
		Employee e = new Employee();
		Employee e1 = new Employee();
		d.setId(1);
		d.setName("CS");
		d1.setId(1);
		d1.setName("ECE");
		e.setEmpId(1);
		e.setDepartment(d);
		e1.setEmpId(1);
		e1.setDepartment(d1);
		if (e.equals(e1)) {
			System.out.println("Same");
		} else {
			System.out.println("not same");
		}

		System.out.println(e.toString());
		System.out.println(e1.toString());
	}
}

class Employee {
	private int empId;
	private String empName;
	private Department department;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			if (getEmpId() == emp.getEmpId()
					&& getDepartment().equals(emp.getDepartment())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", department=" + department + ", salary=" + salary + "]";
	}

}

class Department {
	private int id;
	private String name;
	private String location;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (obj instanceof Department) {
			Department d = (Department) obj;
			if (getId() == d.getId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location="
				+ location + "]";
	}

}