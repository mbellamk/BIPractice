package com.bellinfo.day13.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListOperationsOnObjects {

	public static void main(String[] args) {

		List<MobilePhone> phoneList = new ArrayList<>();
		MobilePhone mp1 = new MobilePhone();
		mp1.setName("samsung");
		mp1.setOs("Android");
		mp1.setCost(500.0);
		phoneList.add(mp1);

		mp1 = new MobilePhone();
		mp1.setName("Apple");
		mp1.setOs("ios");
		mp1.setCost(600.0);
		phoneList.add(mp1);

		mp1 = new MobilePhone();
		mp1.setName("LG");
		mp1.setOs("Android");
		mp1.setCost(400.0);
		phoneList.add(mp1);

		System.out.println("Initial MobilePhone details");
		for (MobilePhone m : phoneList) {
			System.out.println(m);
		}

		// sorting mobile Phone objects
		Set<MobilePhone> phoneSet = new TreeSet<>();
		phoneSet.addAll(phoneList);

		// Displaying TreeSet results
		System.out.println("**Sorted List**");
		for (MobilePhone m : phoneSet) {
			System.out.println(m);
		}
	}

}

class MobilePhone implements Comparable<MobilePhone> {
	private String name;
	private double cost;
	private String os;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof MobilePhone) {
			MobilePhone other = (MobilePhone) obj;
			if (name.equals(other.getName()) && os.equals(other.getOs())
					&& cost == other.getCost()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return name + " " + cost + " " + os;
	}

	@Override
	public int compareTo(MobilePhone other) {

		if(this.os.compareTo(other.getOs())==0){
			return this.name.compareTo(other.getName());
		}
		return this.os.compareTo(other.getOs());
	}

}
