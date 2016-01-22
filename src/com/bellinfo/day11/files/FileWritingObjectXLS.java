package com.bellinfo.day11.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class FileWritingObjectXLS {

	public static void main(String[] args) {

		try {

			String path = System.getProperty("user.dir");
			String fileName = "students.xls";
			String absolutePath = path + File.separator + fileName;
			System.out.println(absolutePath);

			File writeFile2 = new File(absolutePath);
			writeFile2.createNewFile();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet worksheet = workbook.createSheet("Students");

			HSSFRow rowHeading = worksheet.createRow((short) 0);

			HSSFCell cellA1 = rowHeading.createCell((short) 0);
			cellA1.setCellValue("Id");
			HSSFCellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			cellA1.setCellStyle(cellStyle);

			HSSFCell cellA2 = rowHeading.createCell((short) 1);
			cellA2.setCellValue("Name");
			cellA2.setCellStyle(cellStyle);

			HSSFCell cellA3 = rowHeading.createCell((short) 2);
			cellA3.setCellValue("Marks");
			cellA3.setCellStyle(cellStyle);

			HSSFCell cellA4 = rowHeading.createCell((short) 3);
			cellA4.setCellValue("Fee");
			cellA4.setCellStyle(cellStyle);

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of students:");
			int count = scan.nextInt();
			for (int i = 0; i < count; i++) {

				HSSFRow row1 = worksheet.createRow((short) (i + 1));

				System.out.println("Enter Student" + (i + 1) + " id:");
				HSSFCell cellId = row1.createCell((short) 0);
				cellId.setCellValue(scan.nextInt());
				System.out.println("Enter Student" + (i + 1) + " Name:");
				HSSFCell cellName = row1.createCell((short) 1);
				cellName.setCellValue(scan.next());
				System.out.println("Enter Student" + (i + 1) + " Marks:");
				HSSFCell cellMarks = row1.createCell((short) 2);
				cellMarks.setCellValue(scan.nextInt());
				System.out.println("Enter Student" + (i + 1) + " Fee:");
				HSSFCell cellFee = row1.createCell((short) 3);
				cellFee.setCellValue(scan.nextDouble());
			}

			FileOutputStream outputStream = new FileOutputStream(writeFile2);
			workbook.write(outputStream);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
