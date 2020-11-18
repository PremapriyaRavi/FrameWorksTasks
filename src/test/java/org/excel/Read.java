package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws Throwable {
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\DatasForExcel.xlsx");
		FileInputStream f=new FileInputStream(loc);
	    Workbook w=new XSSFWorkbook(f);
	    Sheet s = w.getSheet("Sheet1");
	    Row r = s.getRow(1);
	    Cell c = r.getCell(1);
	    System.out.println(c);
	
	}

}
