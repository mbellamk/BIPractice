package com.bellinfo.day11.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class FileWritingXLS {

	public static void main(String[] args) {

		try {
			String path = System.getProperty("user.dir");
			String fileName = "writeFile.txt";
			String absolutePath = path + File.separator + fileName;
			System.out.println(absolutePath);

			path = System.getProperty("user.dir");
			fileName = "week.xls";
			absolutePath = path + File.separator + fileName;
			System.out.println(absolutePath);

			File writeFile2 = new File(absolutePath);
			writeFile2.createNewFile();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet worksheet = workbook.createSheet("POI Worksheet");

			// index from 0,0... cell A1 is cell(0,0)
			HSSFRow rowHeading = worksheet.createRow((short) 0);

			HSSFCell cellA1 = rowHeading.createCell((short) 0);
			cellA1.setCellValue("Week");
			HSSFCellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
			cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			cellA1.setCellStyle(cellStyle);

			HSSFRow row1 = worksheet.createRow((short) 1);

			HSSFCell cellMonday = row1.createCell((short) 0);
			cellMonday.setCellValue("Monday");

			HSSFRow row2 = worksheet.createRow((short) 2);
			HSSFCell cell2 = row2.createCell((short) 0);
			cell2.setCellValue("Tueday");

			HSSFRow row3 = worksheet.createRow((short) 3);
			HSSFCell cell3 = row3.createCell((short) 0);
			cell3.setCellValue("Wednesday");

			HSSFRow row4 = worksheet.createRow((short) 4);
			HSSFCell cell4 = row4.createCell((short) 0);
			cell4.setCellValue("Thursday");

			HSSFRow row5 = worksheet.createRow((short) 5);
			HSSFCell cell5 = row5.createCell((short) 0);
			cell5.setCellValue("Friday");

			HSSFRow row6 = worksheet.createRow((short) 6);
			HSSFCell cell6 = row6.createCell((short) 0);
			cell6.setCellValue("Saturday");

			HSSFRow row7 = worksheet.createRow((short) 7);
			HSSFCell cell7 = row7.createCell((short) 0);
			cell7.setCellValue("Sunday");

			FileOutputStream outputStream = new FileOutputStream(writeFile2);
			workbook.write(outputStream);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}

class Website implements Serializable{



	
	
}