package com.bellinfo.day7.package1;

import java.util.Scanner;

public class EmployeeAssignment {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of employee");
		int count = s.nextInt();
		EmployeeDetails[] employee = new EmployeeDetails[count];

		for (int i = 0; i < count; i++) {
			EmployeeDetails employer = new EmployeeDetails();
			DepartmentDetails department = new DepartmentDetails();
			employer.setDepartment(department);
			System.out.println("Enter Employee" + (i + 1) + " Id");
			employer.setEmpId(s.nextInt());
			System.out.println("Enter Employee" + (i + 1) + " Name");
			s.nextLine();
			employer.setEmpName(s.nextLine());
			System.out.println("Enter Employee" + (i + 1) + " Salary");
			employer.setSalary(s.nextDouble());
			System.out.println("Enter Employee" + (i + 1) + " Department Id");
			department.setId(s.nextInt());
			System.out.println("Enter Employee" + (i + 1) + " Department Name");
			s.nextLine();
			department.setName(s.nextLine());
			System.out.println("Enter Employee" + (i + 1)
					+ " Department Location");
			// s.nextLine();
			department.setLocation(s.nextLine());
			employee[i] = employer;
			System.out.println(i);
		}

		int[] duplicateArray=new int[count];
		for(int i=0;i<count;i++)
		{
			duplicateArray[i]=-1;
		}
		int nextIndex=0;
		for (int i = 0; i < count; i++) {

			for (int j = (i + 1); j < count; j++) {
				if (employee[i].equals(employee[j])) {
					duplicateArray[nextIndex]=j;
					nextIndex++;
				}
			}
		}
		
		for(int i=0;i<count;i++){
			boolean status=true;
			for(int j=0;j<count;j++)
			{
				if(i==duplicateArray[j])
				{
					status=false;
					break;
				}
			}
			if(status){
				System.out.println(employee[i]);
			}
		}

	}
}

class EmployeeDetails {
	private int empId;
	private String empName;
	private DepartmentDetails department;
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

	public DepartmentDetails getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDetails department) {
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
		if (obj instanceof EmployeeDetails) {
			EmployeeDetails emp = (EmployeeDetails) obj;
			if (getEmpId() == emp.getEmpId()
					&& getEmpName().equals(emp.getEmpName())
					&& getDepartment().equals(emp.getDepartment())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", department=" + department + "]";
	}

}

class DepartmentDetails {
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

		if (obj instanceof DepartmentDetails) {
			DepartmentDetails d = (DepartmentDetails) obj;
			if (getId() == d.getId() && getName().equals(d.getName())
					&& getLocation().equals(d.getLocation())) {
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