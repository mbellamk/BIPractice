package com.bellinfo.day6.package1;

import java.util.Arrays;
import java.util.Scanner;

public abstract class StudentPhoneNumberDemo {

	public static void main(String[] args) {
		System.out.println("Please enter the count of students");
		Scanner scan = new Scanner(System.in);
		int count=scan.nextInt();
		Student[] students=new Student[count];
		
		for(int i=0;i<count;i++){
			Student student=new Student();

			Address address=new Address();
			student.setAddress(address);
			String[] phoneNumbers;
			System.out.println("Enter Student"+(i+1)+" Id");
			student.setId(scan.nextInt());
			System.out.println("Enter Student"+(i+1)+" Name");
			student.setName(scan.next());
			System.out.println("Enter Student"+(i+1)+" Fee");
			student.setFee(scan.nextDouble());
			System.out.println("Enter Student"+(i+1)+" Section");
			student.setSection(scan.next().charAt(0));
			System.out.println("Enter How many phone numbers do you want to enter");
			int phoneCount=scan.nextInt();
			if(phoneCount==0)
			{
				phoneNumbers=new String[1];
				System.out.println("Need to enter atleast one phone number");
				System.out.println("Enter Phone Number1");
				phoneNumbers[0]=scan.next();
			}else
			{
				phoneNumbers=new String[phoneCount];
				for(int j=0;j<phoneCount;j++)
				{
					System.out.println("Enter Phone Number"+(j+1));
					phoneNumbers[j]=scan.next();
				}
			}
			student.setPhoneNumbers(phoneNumbers);
			System.out.println("Enter Student"+(i+1)+" City ");
			address.setCity(scan.next());
			System.out.println("Enter Student"+(i+1)+" State");
			address.setState(scan.next());
			System.out.println("Enter Student"+(i+1)+" Country");
			address.setCountry(scan.next());
			System.out.println("Enter Student"+(i+1)+" zip");
			address.setZip(scan.next());
			students[i]=student;
		}
		
		for(int i=0;i<count;i++)
		{
				System.out.println(students[i]);
		}

	}

}

class Student {

	int id;
	String name;
	double fee;
	char section;
	String[] phoneNumbers;
	Address address;

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

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public String[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", fee=" + fee
				+ ", section=" + section + ", phoneNumbers="
				+ Arrays.toString(phoneNumbers) + ", address=" + address + "]";
	}

	
	
}

class Address {
	String city;
	String state;
	String country;
	String zip;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + ", zip=" + zip + "]";
	}

	
}
