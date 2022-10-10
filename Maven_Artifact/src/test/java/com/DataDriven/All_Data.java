package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
public static void main(String[] args) throws Throwable {
	File f = new File("D:\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(1);
			int numberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
					Row r = s.getRow(i);
		
				int numberOfCells = r.getPhysicalNumberOfCells();
				for (int j = 0; j < numberOfCells; j++) {	
				
					Cell c = r.getCell(j);
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
		
	}
}
}


