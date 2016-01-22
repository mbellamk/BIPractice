package com.bellinfo.day11.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {

		File sampleFile = new File(
				"D:\\Training\\Java\\BellInfo\\BellInfo\\src\\com\\bellinfo\\day11\\files\\readFile.txt");
		sampleFile.createNewFile();
		FileInputStream fis = new FileInputStream(sampleFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		while (dis.available() != 0) {
			String s = dis.readLine();
			System.out.println(s);
		}
		dis.close();
		bis.close();
		fis.close();
		String path = System.getProperty("user.dir");
		String fileName = "writeFile.txt";
		String absolutePath = path + File.separator + fileName;
		System.out.println(absolutePath);

		File secondFile = new File(absolutePath);
		secondFile.createNewFile();

		FileReader fr = new FileReader(secondFile);
		BufferedReader br = new BufferedReader(fr);

		String s1 = "";
		int count = 0;
		s1 = br.readLine();
		while (s1 != null) {
			System.out.println(s1);
			s1 = br.readLine();
		}
		br.close();
		fr.close();
	}

}
