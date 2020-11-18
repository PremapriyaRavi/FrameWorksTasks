package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_2 {
	public static void main(String[] args) throws Throwable {
		
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\DatasForExcel.xlsx");
	    FileInputStream f=new FileInputStream(loc);
	    Workbook w=new XSSFWorkbook(f);
	    Sheet s = w.getSheet("sheet1");
	    Row r = s.getRow(0);
	    int rowcount = s.getPhysicalNumberOfRows();
	    int cellcount = r.getPhysicalNumberOfCells();
	    System.out.println("rowcount=:"+rowcount);
	    System.out.println("cellcount=:"+cellcount);
	    
	
	}

}
