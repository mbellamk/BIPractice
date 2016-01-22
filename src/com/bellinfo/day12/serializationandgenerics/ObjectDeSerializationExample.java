package com.bellinfo.day12.serializationandgenerics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectDeSerializationExample {

	public static void main(String args[]) throws IOException,
			ClassNotFoundException {

		String path = System.getProperty("user.dir");
		String fileName = "objectWrite.txt";
		String absolutePath = path + File.separator + fileName;
		File file = new File(absolutePath);

		ArrayList<Website> websites = new ArrayList<>();
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		try {
			while (obj != null) {
				Website retrievedWebsite = (Website) obj;
				websites.add(retrievedWebsite);
				obj = ois.readObject();
			}
		} catch (Exception e) {
			System.out.println();
		}

		System.out.println(websites.toString());

	}
}
