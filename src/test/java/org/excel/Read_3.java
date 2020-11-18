package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_3 {
	public static void main(String[] args) throws Throwable {
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\DatasForExcel.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				System.out.println(r.getCell(j));	
			}

		}

	}
}
