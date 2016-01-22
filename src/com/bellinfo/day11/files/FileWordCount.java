package com.bellinfo.day11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir");
		String fileName = "writeFile.txt";
		String absolutePath = path + File.separator + fileName;
		System.out.println(absolutePath);

		File file = new File(absolutePath);

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String s1 = "";
		int count = 0;
		s1 = br.readLine();
		int wordCount = 0;
		while (s1 != null) {
			String splitStr[] = s1.split(" ");
			wordCount += splitStr.length;
			System.out.println(s1);
			s1 = br.readLine();
		}
		br.close();
		fr.close();
		System.out.println("Total Word Count:" + wordCount);
	}

}
