package com.bellinfo.day11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordReplace {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file Name");
		String fileName = scan.next();
		System.out
				.println("Do you want to replace any word in the file? Enter Y or N");
		char choice = scan.next().charAt(0);
		String str = "";
		String replaceString = "";
		if (choice == 'Y' || choice == 'y') {
			System.out.println("Enter the string you want to replace");
			str = scan.next();
			System.out.println("Enter the string you want to replace with");
			replaceString = scan.next();
		}
		String path = System.getProperty("user.dir");
		// String fileName = "writeFile.txt";
		String absolutePath = path + File.separator + fileName;
		System.out.println(absolutePath);

		File file = new File(absolutePath);

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String s1 = "";
		int count = 0;
		s1 = br.readLine();
		int wordCount = 0;
		String data = "";
		int lineCount = 0;
		while (s1 != null) {
			if (lineCount == 0) {
				lineCount++;
			} else {
				data += "\n";
			}
			String splitStr[] = s1.split(" ");
			if (choice == 'Y' || choice == 'N') {
				for (int i = 0; i < splitStr.length; i++) {
					if (splitStr[i].equals(str)) {
						splitStr[i] = replaceString;
					}
					if (i != 0) {
						data += " ";
					}
					data += splitStr[i];
				}
			}
			wordCount += splitStr.length;
			System.out.println(s1);
			s1 = br.readLine();
		}
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes());

		fos.flush();
		fos.close();

		br.close();
		fr.close();
		System.out.println("Total Word Count:" + wordCount);
	}

}
