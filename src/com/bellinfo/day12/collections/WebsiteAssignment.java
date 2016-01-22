package com.bellinfo.day12.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class WebsiteAssignment {

	public static void main(String args[]) {

		int choice = 0;
		ArrayList<Website> websites = new ArrayList<>();
		do {
			System.out.println("Enter the count of websites");
			Scanner scan = new Scanner(System.in);
			int count = scan.nextInt();
			for (int i = 0; i < count; i++) {
				Website website = new Website();
				System.out.println("Enter website" + (i + 1) + " Name:");
				website.setName(scan.next());
				System.out.println("Enter Website" + (i + 1) + " Rank:");
				website.setRank(scan.nextInt());
				System.out.println("Enter website" + (i + 1) + " purpose:");
				scan.nextLine();
				website.setPurpose(scan.nextLine());
				websites.add(website);
			}

			System.out.println("Details of Websites you entered are:");
			System.out.println(websites.toString());
		} while (choice == 1);
	}
}

class Website implements Serializable {
	private String name;
	private int rank;
	private String purpose;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "name=" + name + ", rank=" + rank + ", purpose=" + purpose
				+ "\n";
	}

}
