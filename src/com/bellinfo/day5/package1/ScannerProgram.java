package com.bellinfo.day5.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerProgram {

	public static void main(String args[]){
		System.out.println("Enter count");
		Scanner s=new Scanner(System.in);
		List<PersonDetails> personList=new ArrayList<>();
		PersonDetails[] personArray=new PersonDetails[3];
		int a=s.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Please enter Name");
			String name=s.next();
			System.out.println("Please enter Id");
			int id=s.nextInt();
			PersonDetails p=new PersonDetails();
			p.setId(id);
			p.setName(name);
			//personList.add(p);
			personArray[i]=p;
		}
		
		for(int i=0;i<3;i++)
		{
			
			PersonDetails p=personArray[i];
			System.out.println("Name:"+p.getName()+" \tId:"+p.getId());
		}
	}
}

class PersonDetails{
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
