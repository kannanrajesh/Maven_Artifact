package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
		
	public static void Particular_CellData() throws IOException {
		File f = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int a = (int ) d;
			
			String value = String.valueOf(a);
			System.out.println(value);
		}
		wb.close();
		
	}
	public static void main(String[] args) throws IOException {
		Particular_CellData();
			
		}
}
