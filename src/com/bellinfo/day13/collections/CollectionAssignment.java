package com.bellinfo.day13.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionAssignment {

	public static void main(String args[]) {
		System.out.println("Enter the count of hospitals");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		List<Hospital> hospitals = new ArrayList<Hospital>();
		Map<Integer, Hospital> hospitalMap = new HashMap<>();
		Map<String, Set<Hospital>> hospitalNameAndObjMap = new HashMap<>();
		Map<String, Set<Doctor>> hospitalDoctorsMap = new HashMap<>();
		Map<String, Set<Hospital>> hospitalSpecializationMap = new HashMap<>();

		for (int i = 0; i < count; i++) {
			Hospital hospital = new Hospital();
			Doctor doc = new Doctor();
			Address address = new Address();
			hospital.setDoctor(doc);
			hospital.setAddress(address);
			hospitals.add(hospital);

			// Receive Data from console
			receiveData(hospital, doc, address, scan, i);

			hospitalMap.put(address.getZipCode(), hospital);
			Set<Hospital> hospitalSet;
			if (hospitalNameAndObjMap.containsKey(hospital.getName())) {
				hospitalSet = hospitalNameAndObjMap.get(hospital.getName());
				hospitalSet.add(hospital);
			} else {
				hospitalSet = new HashSet<>();
				hospitalSet.add(hospital);
				hospitalNameAndObjMap.put(hospital.getName(), hospitalSet);
			}

			Set<Doctor> docSet;
			if (hospitalDoctorsMap.containsKey(hospital.getName())) {
				docSet = hospitalDoctorsMap.get(hospital.getName());
				docSet.add(doc);
			} else {
				docSet = new HashSet<>();
				docSet.add(doc);
				hospitalDoctorsMap.put(hospital.getName(), docSet);
			}

			Set<Hospital> hospitalSpecializationSet;
			if (hospitalSpecializationMap.containsKey(hospital.getDoctor()
					.getSpecialization())) {
				hospitalSpecializationSet = hospitalSpecializationMap
						.get(hospital.getDoctor().getSpecialization());
				hospitalSpecializationSet.add(hospital);
			} else {
				hospitalSpecializationSet = new HashSet<>();
				hospitalSpecializationSet.add(hospital);
				hospitalSpecializationMap.put(hospital.getDoctor()
						.getSpecialization(), hospitalSpecializationSet);
			}
		}
		System.out.println("**Original List**");
		System.out.println(hospitals.toString());
		TreeSet<Hospital> hospitalsTreeSet = new TreeSet<>(
				new HospitalNameAndAddressCriteria());
		hospitalsTreeSet.addAll(hospitals);
		System.out
				.println("**List After adding to tree set with Hospital Name and Address Criteria**");
		System.out.println(hospitalsTreeSet.toString());
		TreeSet<Hospital> hospitalZipTreeSet = new TreeSet<>(
				new HospitalNameAndAddressCriteria());
		hospitalZipTreeSet.addAll(hospitals);
		System.out.println("**Enter Zip code to find nearest Hospital");
		int zip = scan.nextInt();
		System.out.println("**Enter the illness");
		scan.nextLine();
		String illness = scan.nextLine();
		int min = 0;
		for (int i : hospitalMap.keySet()) {
			if (min == 0) {
				min = i;
			} else {
				if (min > Math.abs(zip - i)) {
					min = i;
				}
			}
		}
		System.out.println("**Hospital Near to your location is**");
		System.out.println(hospitalMap.get(min).toString());

		int min1 = 0;
		for (int i : hospitalMap.keySet()) {
			Hospital h = hospitalMap.get(i);
			if (h.getDoctor().getSpecialization().equals(illness)) {
				if (min1 == 0) {
					min1 = i;
				} else {
					if (min1 > Math.abs(zip - i)) {
						min1 = i;
					}
				}

			}
		}

		System.out
				.println("**Hospital Near to your location specialized to treat your illness is your illenss is**");
		System.out.println(hospitalMap.get(min).toString());

		printDoctorsFromHospital(scan, hospitalDoctorsMap);

		printHospitalsWithSpecialization(scan, hospitalSpecializationMap);
		
	}

	private static void printHospitalsWithSpecialization(Scanner scan,
			Map<String, Set<Hospital>> hospitalSpecializationMap) {
		System.out.println("Enter Specialization ");
		String name = scan.nextLine();
		if (hospitalSpecializationMap.containsKey(name))
			System.out.println(hospitalSpecializationMap.get(name).toString());
		else {
			System.out
					.println("No Doctors Exists in any hospital with the specialization:"
							+ name);
		}

	}

	private static void printDoctorsFromHospital(Scanner scan,
			Map<String, Set<Doctor>> hospitalDoctorsMap) {
		System.out.println("Enter Hospital Name");
		String name = scan.nextLine();
		if (hospitalDoctorsMap.containsKey(name))
			System.out.println(hospitalDoctorsMap.get(name).toString());
		else {
			System.out.println("No Hospitals Exists with the name:" + name);
		}
	}

	private static void receiveData(Hospital hospital, Doctor doc,
			Address address, Scanner scan, int i) {
		System.out.println("Enter Hospital" + (i + 1) + " name");
		scan.nextLine();
		hospital.setName(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " doctor id");
		doc.setDocId(scan.nextInt());
		System.out.println("Enter Hospital" + (i + 1) + " doctor name");
		scan.nextLine();
		doc.setName(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1)
				+ " doctor specialization");

		doc.setSpecialization(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " address1");
		address.setAddress1(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " address2");
		address.setAddress2(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " city");
		address.setCity(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " state");
		address.setState(scan.nextLine());
		System.out.println("Enter Hospital" + (i + 1) + " zipcode");
		address.setZipCode(scan.nextInt());

	}
}

class Hospital {
	private String name;
	private Doctor doctor;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", doctor=" + doctor + ", address="
				+ address + "]";
	}

}

class Doctor {
	private int docId;
	private String name;
	private String specialization;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", name=" + name
				+ ", specialization=" + specialization + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + docId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docId != other.docId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

}

class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int zipCode;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result
				+ ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}

}
