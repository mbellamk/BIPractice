package com.bellinfo.day11.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {

		try {
			String path = System.getProperty("user.dir");
			String fileName = "writeFile.txt";
			String absolutePath = path + File.separator + fileName;
			System.out.println(absolutePath);

			File writeFile1 = new File(absolutePath);
			writeFile1.createNewFile();
			FileOutputStream fos = new FileOutputStream(writeFile1, true);

			if (writeFile1.exists()) {
				String s = "This is a write File";

				fos.write(s.getBytes());
				fos.write("\n".getBytes());
				fos.write(s.getBytes());

				fos.flush();
				fos.close();
			}

			path = System.getProperty("user.dir");
			fileName = "writeFile2.txt";
			absolutePath = path + File.separator + fileName;
			System.out.println(absolutePath);

			File writeFile2 = new File(absolutePath);
			writeFile1.createNewFile();
			FileWriter fw = new FileWriter(writeFile2);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is write File using Buffered Write");
			bw.newLine();
			bw.write("This is write File using Buffered Write line2");
			bw.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
