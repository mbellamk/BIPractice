package com.bellinfo.day12.serializationandgenerics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializationExample {

	public static void main(String args[]) throws IOException,
			ClassNotFoundException {

		String path = System.getProperty("user.dir");
		String fileName = "objectWrite.txt";
		String absolutePath = path + File.separator + fileName;
		File file = new File(absolutePath);

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Website> websites = new ArrayList<Website>();
		addWebsites(websites);
		System.out.println(websites.toString());
		for (Website website : websites) {
			oos.writeObject(website);

		}

		oos.flush();
		oos.close();

		
	}

	private static void addWebsites(ArrayList<Website> websites) {

		Website website = new Website();
		website.setName("http://www.google.com");
		website.setRank(1);
		website.setPurpose("Search Engine");
		websites.add(website);

		website = new Website();
		website.setName("http://www.amazon.com");
		website.setRank(2);
		website.setPurpose("Shopping Website");
		websites.add(website);

		website = new Website();
		website.setName("http://www.flipkart.com");
		website.setRank(1);
		website.setPurpose("Shopping Website");
		websites.add(website);

	}
}
